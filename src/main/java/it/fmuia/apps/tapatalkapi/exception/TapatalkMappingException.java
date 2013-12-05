package it.fmuia.apps.tapatalkapi.exception;

public class TapatalkMappingException extends Exception
{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5550293555358499067L;

	public TapatalkMappingException(Exception e)
	{
		super("Si è verificato un errore durante il mapping del risultato", e);
	}

}
