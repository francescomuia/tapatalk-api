package it.fmuia.apps.tapatalkapi;

import it.fmuia.apps.tapatalkapi.bean.BoardStat;
import it.fmuia.apps.tapatalkapi.bean.Config;
import it.fmuia.apps.tapatalkapi.bean.Forum;
import it.fmuia.apps.tapatalkapi.bean.PartecipatedForum;
import it.fmuia.apps.tapatalkapi.bean.Smilie;
import it.fmuia.apps.tapatalkapi.bean.Smilies;
import it.fmuia.apps.tapatalkapi.exception.TapatalkApiException;
import it.fmuia.apps.tapatalkapi.exception.TapatalkMappingException;
import it.fmuia.apps.tapatalkapi.exception.UnsupportedFunction;
import it.fmuia.apps.tapatalkapi.methods.ForumFunction;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.xml.bind.DatatypeConverter;

import org.apache.log4j.Logger;
import org.apache.xmlrpc.client.XmlRpcClient;

public class ForumService extends TapatalkBaseService
{
	private static final Logger LOGGER = Logger.getLogger(ForumService.class);

	public ForumService(XmlRpcClient client, Config forumConfig)
	{
		super(client, forumConfig);
	}

	/**
	 * Return full forum in a nested tree structure. In API Level 3 no parameter
	 * required for this function and the sub-forum description. For Level 4,
	 * forum description is omitted unless "return_description" is set to true
	 * @return
	 * @throws TapatalkApiException
	 */
	public Forum[] getForum() throws TapatalkApiException
	{
		if (this.getForumConfig().getGetForum() != null && this.getForumConfig().getGetForum().equals("1"))
		{
			LOGGER.debug("INVOKE GET FORUM API 4");
			return this.getForum(true, "");
		}
		else
		{
			LOGGER.debug("INVOKE GET FORUM API 3");
			return this.invokeFuntionArray(ForumFunction.GET_FORUM, Forum.class, new Object[0]);
		}
	}

	/**
	 * Return full forum in a nested tree structure. In API Level 3 no parameter
	 * required for this function and the sub-forum description. For Level 4,
	 * forum description is omitted unless "return_description" is set to true
	 * @param returnDescription
	 * @param forumId
	 * @return
	 * @throws TapatalkApiException
	 */
	public Forum[] getForum(boolean returnDescription, String forumId) throws TapatalkApiException
	{
		return this.invokeFuntionArray(ForumFunction.GET_FORUM, Forum.class, returnDescription, forumId);
	}

	/**
	 * return a list of sub-forum that user has previously participated in,
	 * order by the latest date of participation.
	 * @return
	 * @throws UnsupportedFunction
	 * @throws TapatalkApiException
	 */
	public PartecipatedForum getParticipatedForum() throws UnsupportedFunction, TapatalkApiException
	{
		if (this.getForumConfig().getGetParticipatedForum() == null)
		{
			throw new UnsupportedFunction();
		}
		else if (this.getForumConfig().getGetParticipatedForum().equals("1"))
		{
			LOGGER.debug("INVOKE GET PARTICIPATED");
			return this.invokeFuntion(ForumFunction.GET_PARTICIPATED, PartecipatedForum.class, new Object[0]);
		}
		else
		{
			throw new UnsupportedFunction();
		}
	}

	/**
	 * mark all the unread topics as read
	 * @return result
	 * @throws TapatalkApiException
	 */
	public boolean markAllAsRead() throws TapatalkApiException
	{
		Map<String, Object> result = this.invokeFuntion(ForumFunction.GET_MARK_ALL_AS_READ);
		return (Boolean) result.get("result");
	}

	/**
	 * mark all the unread topics as read
	 * @param forumId
	 * @return result
	 * @throws TapatalkApiException
	 */
	public void markAllAsRead(String forumId) throws TapatalkApiException
	{
		Map<String, Object> result = this.invokeFuntion(ForumFunction.GET_MARK_ALL_AS_READ, forumId);
		boolean success = (Boolean) result.get("result");
		if (!success)
		{
			try
			{
				throw new RuntimeException(new String((byte[]) result.get("result_text"), "UTF-8"));
			}
			catch (UnsupportedEncodingException e)
			{
				throw new RuntimeException(e);
			}
		}
	}

	/**
	 * Allows mobile client to access password protected sub-forum. It currently
	 * support only sub-forum at leaf level. If the password is valid, also
	 * return the updated cookies so the client will have access to the
	 * subsequent get_topic calls
	 * @param forumId
	 * @param password
	 * @return
	 * @throws TapatalkApiException
	 */
	public void loginForum(String forumId, String password) throws TapatalkApiException
	{
		Map<String, Object> result;
		byte[] encodedPassword = DatatypeConverter.parseBase64Binary(password);
		result = this.invokeFuntion(ForumFunction.LOGIN_FORUM, forumId, encodedPassword);
		boolean res = (Boolean) result.get("result");
		if (!res)
		{
			try
			{
				throw new RuntimeException(new String((byte[]) result.get("result_text"), "UTF-8"));
			}
			catch (UnsupportedEncodingException e)
			{
				throw new RuntimeException(e);
			}
		}
	}

	/**
	 * This new function is used to extract topic / post ID from a URL so an
	 * internal link can be open in app. Especially in SEO environment it is
	 * impossible for the app to detect the IDs from URL and hence requires
	 * server-side assistance. This function is used in conjunction with
	 * get_config that returns get_id_by_url = 1.
	 * @param url
	 * @return
	 * @throws TapatalkApiException
	 */
	public String[] getIdByUrl(String url) throws TapatalkApiException
	{
		Map<String, Object> result;
		result = this.invokeFuntion(ForumFunction.GET_ID_BY_URL, url);
		String[] ret = new String[3];
		ret[0] = (String) result.get("forum_id");
		ret[1] = (String) result.get("topic_id");
		ret[2] = (String) result.get("post_id");
		return ret;
	}

	public BoardStat getBoardStat() throws TapatalkApiException
	{
		return this.invokeFuntion(ForumFunction.GET_BOARD_STAT, BoardStat.class, new Object[]
		{});
	}

	@SuppressWarnings("unchecked")
	public Forum[] getForumStatus(String[] forumIds) throws TapatalkApiException, UnsupportedFunction
	{
		if ("1".equals(this.getForumConfig().getGetForumStatus()))
		{
			Map<String, Object> result;
			try
			{
				result = (Map<String, Object>) this.invokeFuntion(ForumFunction.GET_FORUM_STATUS, new Object[]
				{ forumIds });
				Object[] forumsData = (Object[]) result.get("forums");
				Forum[] forums = new Forum[forumsData.length];
				for (int i = 0; i < forums.length; i++)
				{
					forums[i] = ResultsMapper.mapResult(Forum.class, (Map<String, Object>) forumsData[i]);
				}
				return forums;
			}
			catch (TapatalkMappingException e)
			{
				throw new RuntimeException("Errore durante l'invocazione del metodo " + ForumFunction.GET_FORUM_STATUS, e);
			}
		}
		else
		{
			throw new UnsupportedFunction();
		}

	}

	@SuppressWarnings("unchecked")
	public List<Smilies> getSmilies() throws UnsupportedFunction
	{
		if ("1".equals(this.getForumConfig().getGetSmilies()))
		{
			try
			{
				HashMap<String, HashMap<String, Object>> functionResults = this.invokeFuntion(ForumFunction.GET_SMILIES, new Object[0]);
				HashMap<String, Object> map = functionResults.get("list");
				Iterator<Map.Entry<String, Object>> enumeration = map.entrySet().iterator();
				List<Smilies> smiliesList = new ArrayList<Smilies>();
				while (enumeration.hasNext())
				{
					Map.Entry<String, Object> entry = enumeration.next();
					Object[] smiliesArray = (Object[]) entry.getValue();
					Smilies smilies = new Smilies(entry.getKey());
					for (Object object : smiliesArray)
					{
						Smilie smilie = ResultsMapper.mapResult(Smilie.class, (HashMap<String, Object>) object);
						smilies.getSmilies().add(smilie);
					}
					smiliesList.add(smilies);
				}
				return smiliesList;
			}
			catch (Exception e)
			{
				throw new RuntimeException("Si è verificato un errore durante il mapping", e);
			}
		}
		else
		{
			throw new UnsupportedFunction();
		}
	}
}
