package it.fmuia.apps.tapatalkapi.bean;

import java.util.ArrayList;
import java.util.List;

public class Smilies
{
	private String category;

	private List<Smilie> smilies;

	public Smilies()
	{
	}

	public Smilies(String category)
	{

		this.category = category;
		this.smilies = new ArrayList<Smilie>();
	}

	public String getCategory()
	{
		return category;
	}

	public void setCategory(String category)
	{
		this.category = category;
	}

	public List<Smilie> getSmilies()
	{
		return smilies;
	}

	public void setSmilies(List<Smilie> smilies)
	{
		this.smilies = smilies;
	}

	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("Smilies [category=");
		builder.append(category);
		builder.append(", smilies=");
		builder.append(smilies);
		builder.append("]");
		return builder.toString();
	}
}
