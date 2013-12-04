package it.fmuia.apps.tapatalkapi.bean;

import it.fmuia.apps.tapatalkapi.PropertyName;

public class PushType
{
	@PropertyName(name = "name")
	private String name;

	@PropertyName(name = "value")
	private boolean value;

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public boolean isValue()
	{
		return value;
	}

	public void setValue(boolean value)
	{
		this.value = value;
	}

	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("PushType [name=");
		builder.append(name);
		builder.append(", value=");
		builder.append(value);
		builder.append("]");
		return builder.toString();
	}
}
