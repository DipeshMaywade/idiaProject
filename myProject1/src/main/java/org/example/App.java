package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
    private static final Logger LOG = LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
        String message = "Hello World";
        LOG.debug(message + "Debug");
        LOG.info(message + "info");
        LOG.warn(message + "Warn");
        LOG.error(message + "error");
        LOG.fatal(message + "Fatal");
        LOG.info("Append string : {}.", message);
        System.out.println( "Hello World!" );
    }
}
