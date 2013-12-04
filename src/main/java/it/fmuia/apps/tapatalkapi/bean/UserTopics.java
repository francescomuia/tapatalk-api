package it.fmuia.apps.tapatalkapi.bean;

import java.util.Date;

import it.fmuia.apps.tapatalkapi.PropertyName;

public class UserTopics
{
	@PropertyName(name = "forum_id")
	private String forumId;

	@PropertyName(name = "forum_name")
	private String forumName;

	@PropertyName(name = "topic_id")
	private String topicId;

	/**
	 * Remove all BBCode in title
	 */
	@PropertyName(name = "topic_title")
	private String topicTitle;

	/**
	 * return display name if it has
	 */
	@PropertyName(name = "last_reply_author_name")
	private String lastReplyAuthorName;

	@PropertyName(name = "last_reply_author_id")
	private String lastReplyAuthorId;

	/**
	 * Return the last post author avatar URL
	 */
	@PropertyName(name = "icon_url")
	private String iconUrl;

	/**
	 * Return the last post author avatar URL
	 */
	@PropertyName(name = "last_reply_time")
	private Date lastReplyTime;

	/**
	 * total number of reply in this topic. If this is no reply in this return,
	 * return 0.
	 */
	@PropertyName(name = "reply_number")
	private int replyNumber;

	/**
	 * return true if this topic contains new post since user last login
	 */
	@PropertyName(name = "new_post")
	private boolean newPost;

	/**
	 * total number of view in this topic
	 */
	@PropertyName(name = "view_number")
	private int viewNumber;

	/**
	 * Characters display rules (should follow this sequence): 1) Remove all
	 * BBCode except [ur], [img]. 2) Convert "[url http://...]http://…..[/url]"
	 * to "[url]". 3) Convert "[img]http://…..[/img]" to "[img]". 4) Remove
	 * "Last edited by..." tag at the end. 5) Remove all non-displayable
	 * characters (e.g. \n, \t, etc). 6) Remove all whitespace, /n and /r at the
	 * begining and ending of the content. 7) return only first 200 characters
	 */
	@PropertyName(name = "short_content")
	private String shortContent;

	@PropertyName(name = "post_author_id")
	private String postAuthorId;

	@PropertyName(name = "timestamp")
	private String timestamp;

	@PropertyName(name = "can_close")
	private boolean canClose;

	@PropertyName(name = "can_subscribe")
	private boolean canSubscribe;

	@PropertyName(name = "is_approved")
	private boolean isApproved;

	@PropertyName(name = "post_author_name")
	private String postAuthorName;

	@PropertyName(name = "post_time")
	private Date postTime;

	public String getForumId()
	{
		return forumId;
	}

	public void setForumId(String forumId)
	{
		this.forumId = forumId;
	}

	public String getForumName()
	{
		return forumName;
	}

	public void setForumName(String forumName)
	{
		this.forumName = forumName;
	}

	public String getTopicId()
	{
		return topicId;
	}

	public void setTopicId(String topicId)
	{
		this.topicId = topicId;
	}

	public String getTopicTitle()
	{
		return topicTitle;
	}

	public void setTopicTitle(String topicTitle)
	{
		this.topicTitle = topicTitle;
	}

	public String getLastReplyAuthorName()
	{
		return lastReplyAuthorName;
	}

	public void setLastReplyAuthorName(String lastReplyAuthorName)
	{
		this.lastReplyAuthorName = lastReplyAuthorName;
	}

	public String getLastReplyAuthorId()
	{
		return lastReplyAuthorId;
	}

	public void setLastReplyAuthorId(String lastReplyAuthorId)
	{
		this.lastReplyAuthorId = lastReplyAuthorId;
	}

	public String getIconUrl()
	{
		return iconUrl;
	}

	public void setIconUrl(String iconUrl)
	{
		this.iconUrl = iconUrl;
	}

	public Date getLastReplyTime()
	{
		return lastReplyTime;
	}

	public void setLastReplyTime(Date lastReplyTime)
	{
		this.lastReplyTime = lastReplyTime;
	}

	public int getReplyNumber()
	{
		return replyNumber;
	}

	public void setReplyNumber(int replyNumber)
	{
		this.replyNumber = replyNumber;
	}

	public boolean isNewPost()
	{
		return newPost;
	}

	public void setNewPost(boolean newPost)
	{
		this.newPost = newPost;
	}

	public int getViewNumber()
	{
		return viewNumber;
	}

	public void setViewNumber(int viewNumber)
	{
		this.viewNumber = viewNumber;
	}

	public String getShortContent()
	{
		return shortContent;
	}

	public void setShortContent(String shortContent)
	{
		this.shortContent = shortContent;
	}

	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("UsersTopics [forumId=");
		builder.append(forumId);
		builder.append(", forumName=");
		builder.append(forumName);
		builder.append(", topicId=");
		builder.append(topicId);
		builder.append(", topicTitle=");
		builder.append(topicTitle);
		builder.append(", lastReplyAuthorName=");
		builder.append(lastReplyAuthorName);
		builder.append(", lastReplyAuthorId=");
		builder.append(lastReplyAuthorId);
		builder.append(", iconUrl=");
		builder.append(iconUrl);
		builder.append(", lastReplyTime=");
		builder.append(lastReplyTime);
		builder.append(", replyNumber=");
		builder.append(replyNumber);
		builder.append(", newPost=");
		builder.append(newPost);
		builder.append(", viewNumber=");
		builder.append(viewNumber);
		builder.append(", shortContent=");
		builder.append(shortContent);
		builder.append("]");
		return builder.toString();
	}
}
