package it.fmuia.apps.tapatalkapi.bean;

import it.fmuia.apps.tapatalkapi.PropertyName;

public class BoardStat
{
	@PropertyName(name = "total_threads")
	private int totalThreads;

	@PropertyName(name = "total_posts")
	private int totalPosts;

	@PropertyName(name = "total_posts")
	private int totalMembers;

	@PropertyName(name = "active_members")
	private int activeMembers;

	@PropertyName(name = "total_online")
	private int totalOnline;

	@PropertyName(name = "guest_online")
	private int guestOnline;

	public int getTotalThreads()
	{
		return totalThreads;
	}

	public void setTotalThreads(int totalThreads)
	{
		this.totalThreads = totalThreads;
	}

	public int getTotalPosts()
	{
		return totalPosts;
	}

	public void setTotalPosts(int totalPosts)
	{
		this.totalPosts = totalPosts;
	}

	public int getTotalMembers()
	{
		return totalMembers;
	}

	public void setTotalMembers(int totalMembers)
	{
		this.totalMembers = totalMembers;
	}

	public int getActiveMembers()
	{
		return activeMembers;
	}

	public void setActiveMembers(int activeMembers)
	{
		this.activeMembers = activeMembers;
	}

	public int getTotalOnline()
	{
		return totalOnline;
	}

	public void setTotalOnline(int totalOnline)
	{
		this.totalOnline = totalOnline;
	}

	public int getGuestOnline()
	{
		return guestOnline;
	}

	public void setGuestOnline(int guestOnline)
	{
		this.guestOnline = guestOnline;
	}

	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("BoardStat [totalThreads=");
		builder.append(totalThreads);
		builder.append(", totalPosts=");
		builder.append(totalPosts);
		builder.append(", totalMembers=");
		builder.append(totalMembers);
		builder.append(", activeMembers=");
		builder.append(activeMembers);
		builder.append(", totalOnline=");
		builder.append(totalOnline);
		builder.append(", guestOnline=");
		builder.append(guestOnline);
		builder.append("]");
		return builder.toString();
	}
}
