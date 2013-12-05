package it.fmuia.apps.tapatalkapi.exception;

public class TapatalkApiException extends Exception
{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2333114015656676664L;

	public TapatalkApiException(String errorMessage)
	{
		super(errorMessage);
	}

}
