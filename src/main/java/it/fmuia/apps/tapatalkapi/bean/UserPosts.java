package it.fmuia.apps.tapatalkapi.bean;

import it.fmuia.apps.tapatalkapi.PropertyName;

import java.util.Date;

public class UserPosts
{
	@PropertyName(name = "forum_id")
	private String forumId;

	@PropertyName(name = "forum_name")
	private String forumName;

	@PropertyName(name = "topic_id")
	private String topicId;

	@PropertyName(name = "topic_title")
	private String topicTitle;

	@PropertyName(name = "post_id")
	private String postId;

	@PropertyName(name = "post_time")
	private Date postTime;

	@PropertyName(name = "reply_number")
	private int replyNumber;

	@PropertyName(name = "new_post")
	private boolean newPost;

	@PropertyName(name = "view_number")
	private int viewNumber;

	@PropertyName(name = "short_content")
	private String shortContent;

	@PropertyName(name = "post_author_id")
	private String postAuthorId;

	@PropertyName(name = "icon_url")
	private String iconUrl;

	@PropertyName(name = "timestamp")
	private String timestamp;

	@PropertyName(name = "post_author_name")
	private String postAuthorName;

	@PropertyName(name = "is_approved")
	private boolean isApproved;

	@PropertyName(name = "can_delete")
	private boolean canDelete;

	@PropertyName(name = "post_title")
	private String postTitle;

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

	public String getPostId()
	{
		return postId;
	}

	public void setPostId(String postId)
	{
		this.postId = postId;
	}

	public Date getPostTime()
	{
		return postTime;
	}

	public void setPostTime(Date postTime)
	{
		this.postTime = postTime;
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
		builder.append("UserPosts [forumId=");
		builder.append(forumId);
		builder.append(", forumName=");
		builder.append(forumName);
		builder.append(", topicId=");
		builder.append(topicId);
		builder.append(", topicTitle=");
		builder.append(topicTitle);
		builder.append(", postId=");
		builder.append(postId);
		builder.append(", postTime=");
		builder.append(postTime);
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

	public String getPostAuthorId()
	{
		return postAuthorId;
	}

	public void setPostAuthorId(String postAuthorId)
	{
		this.postAuthorId = postAuthorId;
	}

	public String getIconUrl()
	{
		return iconUrl;
	}

	public void setIconUrl(String iconUrl)
	{
		this.iconUrl = iconUrl;
	}

	public String getTimestamp()
	{
		return timestamp;
	}

	public void setTimestamp(String timestamp)
	{
		this.timestamp = timestamp;
	}

	public String getPostAuthorName()
	{
		return postAuthorName;
	}

	public void setPostAuthorName(String postAuthorName)
	{
		this.postAuthorName = postAuthorName;
	}

	public boolean isApproved()
	{
		return isApproved;
	}

	public void setApproved(boolean isApproved)
	{
		this.isApproved = isApproved;
	}

	public boolean isCanDelete()
	{
		return canDelete;
	}

	public void setCanDelete(boolean canDelete)
	{
		this.canDelete = canDelete;
	}

	public String getPostTitle()
	{
		return postTitle;
	}

	public void setPostTitle(String postTitle)
	{
		this.postTitle = postTitle;
	}

}
