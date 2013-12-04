package it.fmuia.apps.tapatalkapi.exception;

public class UnsupportedFunction extends Exception
{
	public UnsupportedFunction()
	{
		super("Questa funzione non è supportato dal forum");
	}
}
