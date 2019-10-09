package com.capgemini.myloggerapplication;

import android.os.Environment;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import java.io.File;

import de.mindpipe.android.logging.log4j.LogConfigurator;



public class Log4jHelper {

/*    public static final LogConfigurator  logConfigurator = new LogConfigurator();

    static {
        configureLog4j();
    }

    public static void configureLog4j() {
        String fileName = Environment.getExternalStorageDirectory() + "/" + "log4j.log";
        String filePattern = "%d - [%c] - %p : %m%n";
        int maxBackupSize = 10;
        long maxFileSize = 1024 * 1024;

        configure( fileName, filePattern, maxBackupSize, maxFileSize );
    }

    private static void configure( String fileName, String filePattern, int maxBackupSize, long maxFileSize ) {
        logConfigurator.setFileName( fileName );
        logConfigurator.setMaxFileSize( maxFileSize );
        logConfigurator.setFilePattern(filePattern);
        logConfigurator.setMaxBackupSize(maxBackupSize);
        logConfigurator.setUseLogCatAppender(true);
        logConfigurator.configure();

    }

    public static org.apache.log4j.Logger getLogger( String name ) {
        org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger( name );
        return logger;
    }*/


    public static Logger getLogger(String className) {

        LogConfigurator logConfigurator = new LogConfigurator();

        logConfigurator.setFileName(Environment.getExternalStorageDirectory() + File.separator + System.currentTimeMillis() + ".log");

        logConfigurator.setRootLevel(Level.ALL);

        logConfigurator.setLevel("org.apache", Level.ALL);

        logConfigurator.setUseFileAppender(true);

        logConfigurator.setFilePattern("%d - [%c] - %p : %m%n");

        logConfigurator.setMaxFileSize(1024 * 1024 * 5);

        logConfigurator.setImmediateFlush(true);

        logConfigurator.configure();

        Logger logger = Logger.getLogger(className);

        return logger;
    }
}
