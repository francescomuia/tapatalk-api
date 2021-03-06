package it.fmuia.apps.tapatalkapi;

import it.fmuia.apps.tapatalkapi.bean.Config;
import it.fmuia.apps.tapatalkapi.bean.InboxStat;
import it.fmuia.apps.tapatalkapi.bean.OnlineUsers;
import it.fmuia.apps.tapatalkapi.bean.RecommendedUsers;
import it.fmuia.apps.tapatalkapi.bean.Topics;
import it.fmuia.apps.tapatalkapi.bean.User;
import it.fmuia.apps.tapatalkapi.bean.UserPosts;
import it.fmuia.apps.tapatalkapi.exception.LoginException;
import it.fmuia.apps.tapatalkapi.exception.TapatalkApiException;
import it.fmuia.apps.tapatalkapi.exception.TapatalkMappingException;
import it.fmuia.apps.tapatalkapi.exception.UnsupportedFunction;
import it.fmuia.apps.tapatalkapi.methods.UserFunction;

import java.awt.image.BufferedImage;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.imageio.ImageIO;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.apache.log4j.Logger;
import org.apache.ws.commons.util.Base64;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

/**
 * This section provides necessary functions related to user such as
 * authentication, user profile and other user specific actions.
 * @author muia
 * 
 */
public class UserService extends TapatalkBaseService
{

	private final String AVATAR_CLIENT_PAGE = "avatar.php";

	private final static Logger LOGGER = Logger.getLogger(UserService.class);

	public UserService(XmlRpcClient client, Config forumConfig)
	{
		super(client, forumConfig);
	}

	public boolean ignoreUser(String userId, Operation op) throws TapatalkApiException
	{
		HashMap<String, Object> result = this.invokeFuntion(UserFunction.IGNORE_USER, new Object[]
		{ userId, op.ordinal() });
		return (Boolean) result.get("result");
	}

	/**
	 * Return a list of users by giving key word. Flag 'search_user' returned in
	 * get_config will indicate the plugin support this function.
	 * @param keywords using * from partial search
	 * @return
	 */
	public List<User> searchUser(String keywords)
	{
		return this.searchUser(keywords, 1, 20);
	}

	/**
	 * Return a list of users by giving key word. Flag 'search_user' returned in
	 * get_config will indicate the plugin support this function.
	 * @param keywords using * from partial search
	 * @param page
	 * @param numberOfrows
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List<User> searchUser(String keywords, int page, int numberOfrows)
	{
		try
		{
			HashMap<String, Object> results = this.invokeFuntion(UserFunction.SEARCH_USER, new Object[]
			{ keywords.getBytes(Charset.defaultCharset()), page, numberOfrows });
			Object[] lists = (Object[]) results.get("list");
			List<User> users = new ArrayList<User>();
			for (Object data : lists)
			{
				users.add(ResultsMapper.mapResult(User.class, (HashMap<String, Object>) data));
			}
			return users;
		}
		catch (Exception e)
		{
			throw new RuntimeException("Si è verificato un errore durante il mapping del risultato", e);
		}
	}

	/**
	 * Return a list of recommended users for conversation or pm. Flag
	 * 'user_recommended' returned in get_config will indicate the plugin
	 * support this function. It will return 20 users at default without any
	 * @param mode
	 * @return
	 * @throws TapatalkApiException
	 */
	public RecommendedUsers getRecommendedUser(UserType mode) throws TapatalkApiException
	{
		return this.getRecommendedUser(1, 20, mode);
	}

	/**
	 * Return a list of recommended users for conversation or pm. Flag
	 * 'user_recommended' returned in get_config will indicate the plugin
	 * support this function. It will return 20 users at default without any
	 * parameter.
	 * @param page
	 * @param numberOfResults
	 * @param mode
	 * @return
	 * @throws TapatalkApiException
	 */
	public RecommendedUsers getRecommendedUser(int page, int numberOfResults, UserType mode) throws TapatalkApiException
	{

		RecommendedUsers recommendedUsers = this.invokeFuntion(UserFunction.GET_RECOMMENDED_USER, RecommendedUsers.class, new Object[]
		{ page, numberOfResults, mode.ordinal() + 1 });
		return recommendedUsers;
	}

	/**
	 * Returns a list of posts (max. 50) that's a particular user has replied
	 * to.
	 * @param username
	 * @param userId
	 * @return
	 * @throws TapatalkApiException
	 */
	@SuppressWarnings("unchecked")
	public List<UserPosts> getUserReplyPost(String username, String userId) throws TapatalkApiException
	{
		try
		{
			Object[] results = null;
			if (userId != null)
			{
				results = this.invokeFuntion(UserFunction.GET_USER_REPLY_POST, new Object[]
				{ new byte[0], userId });
			}
			else
			{
				results = this.invokeFuntion(UserFunction.GET_USER_REPLY_POST, new Object[]
				{ username.getBytes(Charset.defaultCharset()) });
			}
			List<UserPosts> topics = new ArrayList<UserPosts>();
			for (Object result : results)
			{
				HashMap<String, Object> res = (HashMap<String, Object>) result;
				UserPosts usersTopics = ResultsMapper.mapResult(UserPosts.class, res);
				topics.add(usersTopics);
			}
			return topics;
		}
		catch (TapatalkMappingException e)
		{
			throw new RuntimeException("Si è verificato un errore durante la chiamata", e);
		}
	}

	/**
	 * Returns a list of topics (max 50) the user has previously created. Sorted
	 * by last reply time
	 * @throws TapatalkApiException
	 */
	@SuppressWarnings("unchecked")
	public List<Topics> getUserTopic(String username, String userId) throws TapatalkApiException
	{
		try
		{
			Object[] results = null;
			if (userId != null)
			{
				results = (Object[]) this.invokeFuntion(UserFunction.GET_USER_TOPIC, new Object[]
				{ new byte[0], userId });
			}
			else
			{
				results = (Object[]) this.invokeFuntion(UserFunction.GET_USER_TOPIC, new Object[]
				{ username.getBytes(Charset.defaultCharset()) });
			}
			List<Topics> topics = new ArrayList<Topics>();
			for (Object result : results)
			{
				HashMap<String, Object> res = (HashMap<String, Object>) result;
				Topics usersTopics = ResultsMapper.mapResult(Topics.class, res);
				topics.add(usersTopics);
			}
			return topics;
		}
		catch (TapatalkMappingException e)
		{
			throw new RuntimeException("Si è verificato un errore durante la chiamata", e);
		}
	}

	public User getUserInfoByUsername(String username) throws TapatalkApiException
	{
		return this.invokeFuntion(UserFunction.GET_USER_INFO, User.class, new Object[]
		{ username.getBytes(Charset.defaultCharset()), "" });
	}

	public User getUserInfoByUserId(String userId) throws TapatalkApiException
	{
		return this.invokeFuntion(UserFunction.GET_USER_INFO, User.class, new Object[]
		{ "", userId });
	}

	/**
	 * Returns a list of user who are currently online. You can specify forum
	 * and thread to limit the users you need.
	 * @return
	 * @throws TapatalkApiException
	 */
	public OnlineUsers getOnlineUsers() throws TapatalkApiException
	{
		return this.invokeFuntion(UserFunction.GET_ONLINE_USERS, OnlineUsers.class, new Object[0]);
	}

	/**
	 * Returns a list of user who are currently online. You can specify forum
	 * and thread to limit the users you need.
	 * @return
	 * @throws TapatalkApiException
	 */
	public OnlineUsers getOnlineUsers(String id, Area area, int page, int numberOfresults) throws TapatalkApiException
	{
		String idParam = "";
		String areaParam = "";
		if (id != null)
		{
			idParam = id;
		}
		if (area != null)
		{
			areaParam = area.getValue();
		}
		return this.invokeFuntion(UserFunction.GET_ONLINE_USERS, OnlineUsers.class, page, numberOfresults, idParam, areaParam);
	}

	/**
	 * 
	 * @return true if succed
	 * @throws TapatalkApiException
	 */
	public boolean logoutUser() throws TapatalkApiException
	{
		Boolean result = this.invokeFuntion(UserFunction.LOGOUT_USER, new Object[0]);
		return result;
	}

	/**
	 * returns inbox related statistic for the user that is currently connected.
	 * In API Level 3 there is no input parameter need to pass into this
	 * function.
	 * @return
	 * @throws TapatalkApiException
	 */
	public InboxStat getInboxStat() throws TapatalkApiException
	{
		return this.invokeFuntion(UserFunction.GET_INBOX_STAT, InboxStat.class, new Object[0]);
	}

	/**
	 * Server returns cookies in HTTP header. Client should store the cookies
	 * and pass it back to server for all subsequence calls to maintain user
	 * session. ** DO NOT include HTTP Cookies in the request header
	 * @return
	 * @throws LoginException
	 * @throws TapatalkApiException
	 */
	public User login(String loginName, String password) throws LoginException, TapatalkApiException
	{
		LOGGER.debug("LOGIN API 3");
		return this.login(loginName, password, false, null, true);
	}

	/**
	 * Server returns cookies in HTTP header. Client should store the cookies
	 * and pass it back to server for all subsequence calls to maintain user
	 * session. ** DO NOT include HTTP Cookies in the request header
	 * @return
	 * @throws LoginException
	 * @throws TapatalkApiException **
	 */
	public User login(String loginName, String password, boolean anonymous, String push) throws LoginException, TapatalkApiException
	{
		LOGGER.debug("LOGIN API 4");
		return this.login(loginName, password, anonymous, push, false);
	}

	private User login(String loginName, String password, boolean anonymous, String push, boolean apiVersion3) throws LoginException,
			TapatalkApiException
	{
		byte[] encodedPassword = null;
		if (this.getForumConfig().getSupportMd5() != null && this.getForumConfig().getSupportMd5().equals("1"))
		{
			LOGGER.debug("MD5 ENCRIPTION");
			encodedPassword = DigestUtils.md5Hex(password).getBytes(Charset.defaultCharset());

		}
		else if (this.getForumConfig().getSupportSha1() != null && this.getForumConfig().getSupportSha1().equals("1"))
		{
			LOGGER.debug("SHA1 ENCRIPTION");
			encodedPassword = DigestUtils.shaHex(password).getBytes(Charset.defaultCharset());

		}
		else
		{
			encodedPassword = password.getBytes();
		}

		Map<String, Object> result = null;
		if (apiVersion3)
		{
			result = this.invokeFuntion(UserFunction.LOGIN, loginName.getBytes(), encodedPassword);
		}
		else
		{
			if (push == null)
			{
				push = this.getForumConfig().getPush() != null ? this.getForumConfig().getPush().toString() : "";
			}
			result = this.invokeFuntion(UserFunction.LOGIN, loginName.getBytes(), encodedPassword, anonymous, push);
		}
		if (!(Boolean) result.get("result"))
		{
			throw new LoginException(new String((byte[]) result.get("result_text"), Charset.defaultCharset()));
		}
		else
		{
			try
			{
				User user = ResultsMapper.mapResult(User.class, result);
				return user;
			}
			catch (Exception e)
			{
				throw new RuntimeException("Errore durante il mapping del risultato", e);
			}
		}
	}

	/**
	 * This script allows the app to pass the user id or based64 encoded
	 * username and it returns the user's avatar as an image. Return a 1x1 image
	 * if this user has no avatar.
	 * @param userId
	 * @param username
	 * @return
	 * @throws UnsupportedFunction
	 */
	public BufferedImage getAvatar(String userId, String username) throws UnsupportedFunction
	{
		if (this.getForumConfig().getAvatar() != null && this.getForumConfig().getAvatar().equals("1"))
		{
			try
			{
				URL url = ((XmlRpcClientConfigImpl) this.getClient().getClientConfig()).getServerURL();
				String urlExternalForm = url.toExternalForm();
				String path = urlExternalForm.substring(0, urlExternalForm.lastIndexOf("/") + 1) + AVATAR_CLIENT_PAGE;
				String usernameBase64 = Base64.encode(username.getBytes(Charset.defaultCharset()));
				URIBuilder builder = new URIBuilder();
				builder.setPort(url.getPort()).setPath(path).setParameter("user_id", userId).setParameter("username", usernameBase64);
				HttpGet get = new HttpGet(builder.build());
				System.out.println(get.getURI());
				HttpClient httpclient = HttpClientBuilder.create().build();
				HttpResponse response = httpclient.execute(get);
				HttpEntity entity = response.getEntity();
				if (response.getStatusLine().getStatusCode() == 200)
				{

					BufferedImage image = null;
					if (entity != null)
					{
						InputStream in = entity.getContent();
						if (in.available() > 1)
						{
							LOGGER.debug("CREATE IMAGE");
							image = ImageIO.read(entity.getContent());
						}
						EntityUtils.consume(entity);
					}

					return image;
				}
				else
				{

					return null;
				}

			}
			catch (Exception e)
			{
				throw new RuntimeException(e);
			}
		}
		else
		{
			throw new UnsupportedFunction();
		}

	}
}
