package it.fmuia.apps.tapatalkapi;

import it.fmuia.apps.tapatalkapi.bean.Config;
import it.fmuia.apps.tapatalkapi.methods.ForumFunction;

import java.lang.reflect.Array;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.xml.DOMConfigurator;
import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;
import org.apache.xmlrpc.client.XmlRpcTransport;
import org.apache.xmlrpc.client.XmlRpcTransportFactory;

public abstract class TapatalkBaseService
{

	private XmlRpcClient client;

	private Config forumConfig;

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

	@SuppressWarnings("unchecked")
	public <T> T invokeFuntion(String functionName, Object... params)
	{
		try
		{
			T resultData = (T) this.getClient().execute(functionName, params);
			return resultData;
		}
		catch (XmlRpcException e)
		{
			throw new RuntimeException("Errore durante l'invocazione del metodo " + functionName, e);
		}
	}

	@SuppressWarnings("unchecked")
	public <T> T invokeFuntion(String functionName, Class<T> result, Object... params)
	{
		try
		{
			Map<String, Object> resultData = this.invokeFuntion(functionName, params);
			return ResultsMapper.mapResult(result, resultData);
		}
		catch (XmlRpcException e)
		{
			throw new RuntimeException("Errore durante l'invocazione del metodo " + functionName, e);
		}
		catch (Exception e)
		{
			throw new RuntimeException("Errore durante il mapping del risultato", e);
		}
	}

	@SuppressWarnings("unchecked")
	public <T> T[] invokeFuntionArray(String functionName, Class<T> result, Object... params)
	{
		try
		{
			Object[] resultData = (Object[]) this.getClient().execute(functionName, params);
			T[] resultsArray = (T[]) Array.newInstance(result, resultData.length);
			for (int i = 0; i < resultData.length; i++)
			{
				HashMap<String, Object> data = (HashMap<String, Object>) resultData[i];
				resultsArray[i] = ResultsMapper.mapResult(result, data);
			}
			return resultsArray;
		}
		catch (XmlRpcException e)
		{
			throw new RuntimeException("Errore durante l'invocazione del metodo " + functionName, e);
		}
		catch (Exception e)
		{
			throw new RuntimeException("Errore durante il mapping del risultato", e);
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
