package it.fmuia.apps.tapatalkapi;

import it.fmuia.apps.tapatalkapi.bean.Config;
import it.fmuia.apps.tapatalkapi.exception.TapatalkApiException;
import it.fmuia.apps.tapatalkapi.exception.TapatalkMappingException;
import it.fmuia.apps.tapatalkapi.methods.ForumFunction;

import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

public abstract class TapatalkBaseService
{

	private XmlRpcClient client;

	private Config forumConfig;

	private final static String RESULT_VALID_KEY = "result";

	private final static String RESULT_TEXT_KEY = "result_text";

	public TapatalkBaseService(XmlRpcClient client, Config forumConfig)
	{

		this.client = client;
		this.forumConfig = forumConfig;
	}

	public boolean isValid()
	{
		try
		{
			this.getClient().execute(ForumFunction.GET_CONFIG, new Object[0]);
			return true;
		}
		catch (XmlRpcException e)
		{
			return false;
		}
	}

	private void checkValidResult(Object result) throws TapatalkApiException
	{
		if (result instanceof HashMap<?, ?>)
		{
			HashMap<?, ?> map = (HashMap<?, ?>) result;
			if (map.containsKey(RESULT_VALID_KEY))
			{
				boolean valid = (Boolean) map.get(RESULT_VALID_KEY);
				if (!valid)
				{
					String errorMessage = "Il risultato della chiamata non è valido";
					if (map.containsKey(RESULT_TEXT_KEY))
					{
						errorMessage = new String((byte[]) map.get(RESULT_TEXT_KEY),Charset.defaultCharset());
					}
					throw new TapatalkApiException(errorMessage);
				}
			}
		}
	}

	private String getForumUrl()
	{
		XmlRpcClientConfigImpl config = (XmlRpcClientConfigImpl) this.getClient().getConfig();
		return config.getServerURL().toExternalForm();
	}

	@SuppressWarnings("unchecked")
	public <T> T invokeFuntion(String functionName, Object... params) throws TapatalkApiException
	{
		try
		{
			T resultData = (T) this.getClient().execute(functionName, params);
			this.checkValidResult(resultData);
			return resultData;
		}
		catch (XmlRpcException e)
		{
			throw new RuntimeException("["+getForumUrl()+"]"+"Errore durante l'invocazione del metodo " + functionName, e);
		}
	}

	public <T> T invokeFuntion(String functionName, Class<T> result, Object... params) throws TapatalkApiException
	{
		try
		{
			Map<String, Object> resultData = this.invokeFuntion(functionName, params);
			this.checkValidResult(resultData);
			return ResultsMapper.mapResult(result, resultData);
		}
		catch (TapatalkMappingException e)
		{
			throw new RuntimeException("Errore durante l'invocazione del metodo " + functionName, e);
		}

	}

	@SuppressWarnings("unchecked")
	public <T> T[] invokeFuntionArray(String functionName, Class<T> result, Object... params) throws TapatalkApiException
	{
		try
		{
			Object[] resultData = (Object[]) this.invokeFuntion(functionName, params);
			T[] resultsArray = (T[]) Array.newInstance(result, resultData.length);
			for (int i = 0; i < resultData.length; i++)
			{
				HashMap<String, Object> data = (HashMap<String, Object>) resultData[i];
				resultsArray[i] = ResultsMapper.mapResult(result, data);
			}
			return resultsArray;
		}
		catch (TapatalkMappingException e)
		{
			throw new RuntimeException("Errore durante l'invocazione del metodo " + functionName, e);
		}

	}

	public XmlRpcClient getClient()
	{
		return client;
	}

	public void setClient(XmlRpcClient client)
	{
		this.client = client;
	}

	public Config getForumConfig()
	{
		return forumConfig;
	}

	public void setForumConfig(Config forumConfig)
	{
		this.forumConfig = forumConfig;
	}
}
