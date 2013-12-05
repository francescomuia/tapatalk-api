package it.fmuia.apps.tapatalkapi;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

import org.apache.log4j.Logger;
import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcStreamTransport;
import org.apache.xmlrpc.client.XmlRpcSunHttpTransport;
import org.apache.xmlrpc.common.XmlRpcStreamRequestConfig;
import org.xml.sax.SAXException;

public class MessageLoggingTransport extends XmlRpcSunHttpTransport
{

	private static final Logger log = Logger.getLogger(MessageLoggingTransport.class.getName());

	/**
	 * Default constructor
	 * 
	 * @see XmlRpcSunHttpTransport#XmlRpcSunHttpTransport(XmlRpcClient)
	 * @param pClient
	 */
	public MessageLoggingTransport(XmlRpcClient pClient)
	{
		super(pClient);
	}

	/**
	 * Dumps outgoing XML-RPC requests to the log
	 */
	@Override
	protected void writeRequest(final XmlRpcStreamTransport.ReqWriter pWriter) throws IOException, XmlRpcException, SAXException
	{
		final ByteArrayOutputStream baos = new ByteArrayOutputStream();
		pWriter.write(baos);
		log.info(baos.toString(Charset.defaultCharset().name()));
		super.writeRequest(pWriter);
	}

	/**
	 * Dumps incoming XML-RPC responses to the log
	 */
	@Override
	protected Object readResponse(XmlRpcStreamRequestConfig pConfig, InputStream pStream) throws XmlRpcException
	{
		final StringBuffer sb = new StringBuffer();

		try
		{
			final BufferedReader reader = new BufferedReader(new InputStreamReader(pStream,Charset.defaultCharset()));
			String line = reader.readLine();
			while (line != null)
			{
				sb.append(line);
				line = reader.readLine();
			}
		}
		catch (final IOException e)
		{
			log.error("While reading server response", e);
		}

		log.info(sb.toString());

		final ByteArrayInputStream bais = new ByteArrayInputStream(sb.toString().getBytes(Charset.defaultCharset()));
		return super.readResponse(pConfig, bais);
	}
}