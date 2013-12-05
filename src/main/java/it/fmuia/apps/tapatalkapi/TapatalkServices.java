package it.fmuia.apps.tapatalkapi;

import it.fmuia.apps.tapatalkapi.bean.Config;
import it.fmuia.apps.tapatalkapi.methods.ForumFunction;

import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

import org.apache.log4j.xml.DOMConfigurator;
import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;
import org.apache.xmlrpc.client.XmlRpcSun15HttpTransportFactory;
import org.apache.xmlrpc.client.XmlRpcTransport;
import org.apache.xmlrpc.client.XmlRpcTransportFactory;

public class TapatalkServices
{

	private XmlRpcClient client;

	private Config forumConfig;

	private ForumService forumService;

	private UserService userService;

	private TopicService topicServices;

	public TapatalkServices(String url) throws MalformedURLException
	{
		this(new URL(url));
	}

	public TapatalkServices(URL url)
	{
		this.initLogger();
		CookieManager cookiemanager = new CookieManager();

		cookiemanager.setCookiePolicy(CookiePolicy.ACCEPT_ALL);
		CookieHandler.setDefault(cookiemanager);
		XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
		config.setServerURL(url);

		final XmlRpcTransportFactory transportFactory = new XmlRpcSun15HttpTransportFactory(client)
		{
			public XmlRpcTransport getTransport()
			{
				return new MessageLoggingTransport(client);
			}
		};

		this.setClient(new XmlRpcClient());
		this.getClient().setTransportFactory(transportFactory);
		this.getClient().setConfig(config);
		this.setForumConfig(getConfig());
		this.forumService = new ForumService(getClient(), getForumConfig());
		this.userService = new UserService(getClient(), getForumConfig());
		this.setTopicServices(new TopicService(getClient(), getForumConfig()));
	}

	private void initLogger()
	{
		DOMConfigurator.configure(TapatalkServices.class.getResource("/config/log4j.xml"));
	}

	@SuppressWarnings("unchecked")
	public Config getConfig()
	{
		HashMap<String, Object> result;
		try
		{

			result = (HashMap<String, Object>) this.getClient().execute(ForumFunction.GET_CONFIG, new Object[0]);
		}
		catch (XmlRpcException e1)
		{
			throw new RuntimeException("Errore durante la chiamata del metodo " + ForumFunction.GET_CONFIG, e1);
		}
		try
		{
			return ResultsMapper.mapResult(Config.class, result);
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

	public ForumService getForumService()
	{
		return forumService;
	}

	public void setForumService(ForumService forumService)
	{
		this.forumService = forumService;
	}

	public UserService getUserService()
	{
		return userService;
	}

	public void setUserService(UserService userService)
	{
		this.userService = userService;
	}

	public TopicService getTopicServices()
	{
		return topicServices;
	}

	public void setTopicServices(TopicService topicServices)
	{
		this.topicServices = topicServices;
	}
}
