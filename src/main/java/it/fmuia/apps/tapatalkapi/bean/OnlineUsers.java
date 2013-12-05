package it.fmuia.apps.tapatalkapi.bean;

import it.fmuia.apps.tapatalkapi.PropertyName;

import java.util.Arrays;

public class OnlineUsers
{
	/**
	 * number of members
	 */
	@PropertyName(name = "member_count")
	private int memberCount;

	/**
	 * number of guest users
	 */
	@PropertyName(name = "guest_count")
	private int guestCount;

	/**
	 * 
	 */
	@PropertyName(name = "list")
	private OnlineUser[] users;

	public int getMemberCount()
	{
		return memberCount;
	}

	public void setMemberCount(int memberCount)
	{
		this.memberCount = memberCount;
	}

	public int getGuestCount()
	{
		return guestCount;
	}

	public void setGuestCount(int guestCount)
	{
		this.guestCount = guestCount;
	}

	public OnlineUser[] getUsers()
	{
		return users;
	}

	public void setUsers(OnlineUser[] users)
	{
		this.users = users;
	}

	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("OnlineUsers [memberCount=");
		builder.append(memberCount);
		builder.append(", guestCount=");
		builder.append(guestCount);
		builder.append(", users=");
		builder.append(Arrays.toString(users));
		builder.append("]");
		return builder.toString();
	}

}
