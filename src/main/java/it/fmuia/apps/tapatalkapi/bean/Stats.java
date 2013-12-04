package it.fmuia.apps.tapatalkapi.bean;

public class Stats
{
	private int topic;
	
	private int post;
	
	private int user;

	public int getTopic()
	{
		return topic;
	}

	public void setTopic(int topic)
	{
		this.topic = topic;
	}

	public int getPost()
	{
		return post;
	}

	public void setPost(int post)
	{
		this.post = post;
	}

	public int getUser()
	{
		return user;
	}

	public void setUser(int user)
	{
		this.user = user;
	}

	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("Stats [topic=");
		builder.append(topic);
		builder.append(", post=");
		builder.append(post);
		builder.append(", user=");
		builder.append(user);
		builder.append("]");
		return builder.toString();
	}
}
