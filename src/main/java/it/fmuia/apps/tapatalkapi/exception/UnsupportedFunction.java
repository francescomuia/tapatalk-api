package it.fmuia.apps.tapatalkapi.exception;

public class UnsupportedFunction extends Exception
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1943298541596132027L;

	public UnsupportedFunction()
	{
		super("Questa funzione non è supportato dal forum");
	}
}
