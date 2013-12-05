package it.fmuia.apps.tapatalkapi;

import it.fmuia.apps.tapatalkapi.exception.LoginException;
import it.fmuia.apps.tapatalkapi.exception.TapatalkApiException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;
import java.util.Properties;

import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import junit.framework.TestCase;

public class TestTapatalkApi extends TestCase
{
	private Properties forums;

	private Properties forumUserPsw;

	private List<TapatalkServices> services30;

	private List<TapatalkServices> services40;

	public TestTapatalkApi() throws Exception
	{
		setForums(new Properties());
		getForums().load(ForumServiceTest.class.getResourceAsStream("/forums.properties"));
		setForumUserPsw(new Properties());
		getForumUserPsw().load(ForumServiceTest.class.getResourceAsStream("/forums_user_psw.properties"));

		String[] urls = this.forums.getProperty("3.0").split(",");
		services30 = new ArrayList<TapatalkServices>(urls.length);
		for (String url : urls)
		{
			services30.add(new TapatalkServices(url));
		}
		urls = this.forums.getProperty("4.0").split(",");
		services40 = new ArrayList<TapatalkServices>(urls.length);
		for (String url : urls)
		{
			services40.add(new TapatalkServices(url));
		}

	}

	public Properties getForums()
	{
		return forums;
	}

	public void setForums(Properties forums)
	{
		this.forums = forums;
	}

	public Properties getForumUserPsw()
	{
		return forumUserPsw;
	}

	public void setForumUserPsw(Properties forumUserPsw)
	{
		this.forumUserPsw = forumUserPsw;
	}

	public List<TapatalkServices> getServices30()
	{
		return services30;
	}

	public void setServices30(List<TapatalkServices> services30)
	{
		this.services30 = services30;
	}

	public List<TapatalkServices> getServices40()
	{
		return services40;
	}

	public void setServices40(List<TapatalkServices> services40)
	{
		this.services40 = services40;
	}

	public List<TapatalkServices> getAllServices()
	{
		List<TapatalkServices> services = this.getServices30();
		services.addAll(this.getServices40());
		return services;
	}

	public void login(TapatalkServices services) throws TapatalkApiException
	{
		String url = ((XmlRpcClientConfigImpl) services.getClient().getConfig()).getServerURL().toExternalForm();
		String[] usernamePsw = this.getForumUserPsw().getProperty(url).split(",");
		try
		{
			services.getUserService().login(usernamePsw[0], usernamePsw[1]);
		}
		catch (LoginException e)
		{
			fail("Errore durante il login " + e.getMessage());
		}
	}
}
