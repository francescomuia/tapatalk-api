package it.fmuia.apps.tapatalkapi;

import it.fmuia.apps.tapatalkapi.bean.Config;
import it.fmuia.apps.tapatalkapi.bean.Topics;
import it.fmuia.apps.tapatalkapi.exception.TapatalkApiException;
import it.fmuia.apps.tapatalkapi.methods.TopicFunction;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.xmlrpc.client.XmlRpcClient;

public class TopicService extends TapatalkBaseService
{

	public TopicService(XmlRpcClient client, Config forumConfig)
	{
		super(client, forumConfig);
	}

	/**
	 * mark unread topics as read
	 * @param topicIds An array of string contains a list of topic Id to be
	 * marked as read.
	 * @return
	 * @throws TapatalkApiException
	 */
	@SuppressWarnings("all")
	public boolean markTopicRead(String... topicIds) throws TapatalkApiException
	{
		HashMap<String, Object> results = this.invokeFuntion(TopicFunction.MARK_TOPIC_READ, topicIds);
		return (Boolean) results.get("result");
	}

	/**
	 * Given an array of topic IDs, returns their status including unread
	 * status, number of reply, number of view and so on. A light-weight
	 * approach to retrieve certain information without pulling a list of
	 * unwanted data.
	 * @param topicIds
	 * @return
	 */
	@SuppressWarnings("all")
	public List<Topics> getTopicStatus(String... topicIds)
	{
		try
		{
			HashMap<String, Object> results = this.invokeFuntion(TopicFunction.GET_TOPIC_STATUS, new Object[]
			{ topicIds });
			Object[] topics = (Object[]) results.get("status");
			List<Topics> topicsList = new ArrayList<Topics>();
			for (Object obj : topics)
			{
				topicsList.add(ResultsMapper.mapResult(Topics.class, (HashMap) obj));
			}
			return topicsList;
		}
		catch (Exception e)
		{
			throw new RuntimeException("Si è verificato un errore durante il mapping del risultato", e);
		}
	}
}
