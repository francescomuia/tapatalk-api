package it.fmuia.apps.tapatalkapi.bean;

import it.fmuia.apps.tapatalkapi.PropertyName;

public class OnlineUser
{
	@PropertyName(name = "user_id")
	private String user_id;

	/**
	 * required in API level 4 as display name, if no display name, return login
	 * name
	 */
	@PropertyName(name = "username")
	private String username;

	/**
	 * user avatar full url
	 */
	@PropertyName(name = "icon_url")
	private String iconUrl;

	/**
	 * Will be replaced by key 'username' in API level 4
	 */
	@PropertyName(name = "user_name")
	private String userName;

	/**
	 * free text to be displayed under the user name in the online list. E.g. in
	 * vBulletin it can display what the user is currently doing. In API Leve 4,
	 * it can also returns [TOPIC] BBCode: this is to support clickable topic
	 * the user is currently reviewing.
	 */
	@PropertyName(name = "display_text")
	private String displayText;

	/**
	 * Required if [TOPIC] BBCode is presented in the display_text above.
	 */
	@PropertyName(name = "topic_id")
	private String topicId;

	/**
	 * Indicate where is this user browsing from. Valid data:
	 * browser/mobile/tapatalk/byo. Default as browser. 'byo' means user was on
	 * tapatalk 'build your own' app.
	 */
	@PropertyName(name = "from")
	private String from;

	public String getUser_id()
	{
		return user_id;
	}

	public void setUser_id(String user_id)
	{
		this.user_id = user_id;
	}

	public String getUsername()
	{
		return username;
	}

	public void setUsername(String username)
	{
		this.username = username;
	}

	public String getIconUrl()
	{
		return iconUrl;
	}

	public void setIconUrl(String iconUrl)
	{
		this.iconUrl = iconUrl;
	}

	public String getUserName()
	{
		return userName;
	}

	public void setUserName(String userName)
	{
		this.userName = userName;
	}

	public String getDisplayText()
	{
		return displayText;
	}

	public void setDisplayText(String displayText)
	{
		this.displayText = displayText;
	}

	public String getTopicId()
	{
		return topicId;
	}

	public void setTopicId(String topicId)
	{
		this.topicId = topicId;
	}

	public String getFrom()
	{
		return from;
	}

	public void setFrom(String from)
	{
		this.from = from;
	}

	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("OnlineUser [user_id=");
		builder.append(user_id);
		builder.append(", username=");
		builder.append(username);
		builder.append(", iconUrl=");
		builder.append(iconUrl);
		builder.append(", userName=");
		builder.append(userName);
		builder.append(", displayText=");
		builder.append(displayText);
		builder.append(", topicId=");
		builder.append(topicId);
		builder.append(", from=");
		builder.append(from);
		builder.append("]");
		return builder.toString();
	}
}
