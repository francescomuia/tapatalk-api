package it.fmuia.apps.tapatalkapi.bean;

import java.util.ArrayList;
import java.util.List;

public class Smilies
{
	private List<Smilie> smilies;

	private String category;
	
	public Smilies(){}
	
	public Smilies(String category)
	{
		this.category = category;
		this.smilies = new ArrayList<Smilie>();
	}
	
	public List<Smilie> getSmilies()
	{
		return smilies;
	}

	public void setSmilies(List<Smilie> smilies)
	{
		this.smilies = smilies;
	}

	public String getCategory()
	{
		return category;
	}

	public void setCategory(String category)
	{
		this.category = category;
	}

	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("Smilies [smilies=");
		builder.append(smilies);
		builder.append(", category=");
		builder.append(category);
		builder.append("]");
		return builder.toString();
	}
}
