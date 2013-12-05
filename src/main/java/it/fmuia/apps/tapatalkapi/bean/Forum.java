package it.fmuia.apps.tapatalkapi.bean;

import it.fmuia.apps.tapatalkapi.PropertyName;

import java.util.Arrays;

public class Forum
{

	@PropertyName(name = "forum_id")
	private String forumId;

	@PropertyName(name = "forum_name")
	private String forumName;

	/**
	 * Description of the forum. If required_description is set to true.
	 */
	@PropertyName(name = "description")
	private String description;

	/**
	 * parent's forum ID of this forum, returns -1 if this forum is the root
	 * forum
	 */
	@PropertyName(name = "parent_id")
	private String parentId;

	/**
	 * returns the forum logo art-work URL (absolute URL). If any.
	 */
	@PropertyName(name = "logo_url")
	private String logoUrl;

	/**
	 * returns true if this forum contains unread topic
	 */
	@PropertyName(name = "new_post")
	private boolean newPost;

	/**
	 * returns true if this forum is password protected. The app side will call
	 * "login_forum" to get authorization before attempting to call get_topic
	 * the this forum.
	 */
	@PropertyName(name = "is_protected")
	private boolean isProtected;

	/**
	 * returns true if the user has previously subscribed to this forum
	 */
	@PropertyName(name = "is_subscribed")
	private boolean isSubscribed;

	/**
	 * returns false if the subscription feature is turned off
	 */
	@PropertyName(name = "can_subscribe")
	private boolean canSubscribe;

	/**
	 * if it contains a url, it means this forum is just a link to other webpage
	 */
	@PropertyName(name = "url")
	private String url;

	/**
	 * (true/false) identify whether this forum is only a placeholder
	 * ("Category" in vBulletin term) for sub-forums (sub_only = true), or can
	 * contains both topics and forums (sub_only = false)
	 */
	@PropertyName(name = "sub_only")
	private boolean subOnly;

	@PropertyName(name = "child")
	private Forum[] child;

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

	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

	public String getParentId()
	{
		return parentId;
	}

	public void setParentId(String parentId)
	{
		this.parentId = parentId;
	}

	public String getLogoUrl()
	{
		return logoUrl;
	}

	public void setLogoUrl(String logoUrl)
	{
		this.logoUrl = logoUrl;
	}

	public boolean isNewPost()
	{
		return newPost;
	}

	public void setNewPost(boolean newPost)
	{
		this.newPost = newPost;
	}

	public boolean isProtected()
	{
		return isProtected;
	}

	public void setProtected(boolean isProtected)
	{
		this.isProtected = isProtected;
	}

	public boolean isSubscribed()
	{
		return isSubscribed;
	}

	public void setSubscribed(boolean isSubscribed)
	{
		this.isSubscribed = isSubscribed;
	}

	public boolean isCanSubscribe()
	{
		return canSubscribe;
	}

	public void setCanSubscribe(boolean canSubscribe)
	{
		this.canSubscribe = canSubscribe;
	}

	public String getUrl()
	{
		return url;
	}

	public void setUrl(String url)
	{
		this.url = url;
	}

	public boolean isSubOnly()
	{
		return subOnly;
	}

	public void setSubOnly(boolean subOnly)
	{
		this.subOnly = subOnly;
	}

	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("Forum [forumId=");
		builder.append(forumId);
		builder.append(", forumName=");
		// builder.append(Arrays.toString(forumName));
		builder.append(forumName);
		builder.append(", description=");
		builder.append(description);
		builder.append(", parentId=");
		builder.append(parentId);
		builder.append(", logoUrl=");
		builder.append(logoUrl);
		builder.append(", newPost=");
		builder.append(newPost);
		builder.append(", isProtected=");
		builder.append(isProtected);
		builder.append(", isSubscribed=");
		builder.append(isSubscribed);
		builder.append(", canSubscribe=");
		builder.append(canSubscribe);
		builder.append(", url=");
		builder.append(url);
		builder.append(", subOnly=");
		builder.append(subOnly);
		builder.append(", child=");
		builder.append(Arrays.toString(child));
		builder.append("]");
		return builder.toString();
	}

	public Forum[] getChild()
	{
		return child;
	}

	public void setChild(Forum[] child)
	{
		this.child = child;
	}
}
