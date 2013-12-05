package it.fmuia.apps.tapatalkapi.bean;

import it.fmuia.apps.tapatalkapi.PropertyName;

import java.util.Arrays;

public class RecommendedUsers
{
	private int total;

	@PropertyName(name = "list")
	private User[] recommendedUsers;

	public int getTotal()
	{
		return total;
	}

	public void setTotal(int total)
	{
		this.total = total;
	}

	public User[] getRecommendedUsers()
	{
		return recommendedUsers;
	}

	public void setRecommendedUsers(User[] recommendedUsers)
	{
		this.recommendedUsers = recommendedUsers;
	}

	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("RecommendedUsers [total=");
		builder.append(total);
		builder.append(", recommendedUsers=");
		builder.append(Arrays.toString(recommendedUsers));
		builder.append("]");
		return builder.toString();
	}
}
