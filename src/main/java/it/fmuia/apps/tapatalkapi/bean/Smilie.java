package it.fmuia.apps.tapatalkapi.bean;

import it.fmuia.apps.tapatalkapi.PropertyName;

public class Smilie
{
	/**
	 * smiley code like ':D'
	 */
	@PropertyName(name = "code")
	private String code;

	/**
	 * smiley url(it may be relative path and need add forum root path to
	 * complete the url)
	 */
	@PropertyName(name = "url")
	private String url;

	/**
	 * smilies title (optional)
	 */
	@PropertyName(name = "title")
	private String title;

	public String getCode()
	{
		return code;
	}

	public void setCode(String code)
	{
		this.code = code;
	}

	public String getUrl()
	{
		return url;
	}

	public void setUrl(String url)
	{
		this.url = url;
	}

	public String getTitle()
	{
		return title;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}

	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("Smilie [code=");
		builder.append(code);
		builder.append(", url=");
		builder.append(url);
		builder.append(", title=");
		builder.append(title);
		builder.append("]");
		return builder.toString();
	}
}
