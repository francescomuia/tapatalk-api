package it.fmuia.apps.tapatalkapi.bean;

import it.fmuia.apps.tapatalkapi.PropertyName;

public class InboxStat
{
	/**
	 * returns total number of unread message in inbox
	 */
	@PropertyName(name = "inbox_unread_count")
	private int inboxUnreadCount;

	/**
	 * returns total number of subscribed topics that are unread.
	 */
	@PropertyName(name = "subscribed_topic_unread_count")
	private int subscribedTopicUnreadCount;

	public int getInboxUnreadCount()
	{
		return inboxUnreadCount;
	}

	public void setInboxUnreadCount(int inboxUnreadCount)
	{
		this.inboxUnreadCount = inboxUnreadCount;
	}

	public int getSubscribedTopicUnreadCount()
	{
		return subscribedTopicUnreadCount;
	}

	public void setSubscribedTopicUnreadCount(int subscribedTopicUnreadCount)
	{
		this.subscribedTopicUnreadCount = subscribedTopicUnreadCount;
	}

	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("InboxStat [inboxUnreadCount=");
		builder.append(inboxUnreadCount);
		builder.append(", subscribedTopicUnreadCount=");
		builder.append(subscribedTopicUnreadCount);
		builder.append("]");
		return builder.toString();
	}
}
