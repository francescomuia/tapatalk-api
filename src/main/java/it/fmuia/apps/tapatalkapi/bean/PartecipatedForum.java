package it.fmuia.apps.tapatalkapi.bean;

import java.util.Arrays;

import it.fmuia.apps.tapatalkapi.PropertyName;

public class PartecipatedForum
{
	/**
	 * returns total number of subscribed forums
	 */
	@PropertyName(name = "total_forums_num")
	private int totalForumsNum;

	@PropertyName(name = "forums")
	private Forum[] forums;

	/**
	 * returns total number of subscribed forums
	 */
	@PropertyName(name = "forum_id")
	private String forumId;

	/**
	 * returns total number of subscribed forums
	 */
	@PropertyName(name = "forum_name")
	private String forumName;

	/**
	 * an image URL to be displayed at the left hand side of the forum in the
	 * app.
	 */
	@PropertyName(name = "logo_url")
	private String logoUrl;

	/**
	 * return true if this forum is a protected forum. Please refer to
	 * "get_forum" for details description.
	 */
	@PropertyName(name = "is_protected")
	private boolean isProtected;

	/**
	 * return true if there is new posts in this forum.
	 */
	@PropertyName(name = "new_post")
	private boolean newPost;

	public int getTotalForumsNum()
	{
		return totalForumsNum;
	}

	public void setTotalForumsNum(int totalForumsNum)
	{
		this.totalForumsNum = totalForumsNum;
	}

	public Forum[] getForums()
	{
		return forums;
	}

	public void setForums(Forum[] forums)
	{
		this.forums = forums;
	}

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

	public String getLogoUrl()
	{
		return logoUrl;
	}

	public void setLogoUrl(String logoUrl)
	{
		this.logoUrl = logoUrl;
	}

	public boolean isProtected()
	{
		return isProtected;
	}

	public void setProtected(boolean isProtected)
	{
		this.isProtected = isProtected;
	}

	public boolean isNewPost()
	{
		return newPost;
	}

	public void setNewPost(boolean newPost)
	{
		this.newPost = newPost;
	}

	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("PartecipatedForum [totalForumsNum=");
		builder.append(totalForumsNum);
		builder.append(", forums=");
		builder.append(Arrays.toString(forums));
		builder.append(", forumId=");
		builder.append(forumId);
		builder.append(", forumName=");
		builder.append(forumName);
		builder.append(", logoUrl=");
		builder.append(logoUrl);
		builder.append(", isProtected=");
		builder.append(isProtected);
		builder.append(", newPost=");
		builder.append(newPost);
		builder.append("]");
		return builder.toString();
	}

}
