package com.sinbugs.tips.logging;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

public class HelloLogger {

	private static Logger log = LoggerFactory.getLogger(HelloLogger.class);
	
	public static void main(String[] args) throws UnknownHostException {
		// Se agrega información contextual (MDC):
		long id = Math.round( Math.random() * 100.0 );
		MDC.put("requestId", String.valueOf(id)); // Un Id de transaccion ficticio y aleatorio (lo mejor es usar UUID)
		
		String ip = InetAddress.getLocalHost().getHostAddress();
		MDC.put("clientIp", ip);		
		
		log.trace("Hello Logger! (trace level)");
		log.debug("Hello Logger! (debug level)");
		log.info("Hello Logger! (info level)");
		log.warn("Hello Logger! (warn level)");
		log.error("Hello Logger! (error level)");
	}

}
