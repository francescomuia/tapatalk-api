package it.fmuia.apps.tapatalkapi;

public enum Area
{
	FORUM("forum"), TOPIC("topic");
	private String value;

	Area(String value)
	{
		this.value = value;
	}

	public String getValue()
	{
		return value;
	}
}
