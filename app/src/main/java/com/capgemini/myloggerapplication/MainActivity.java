package com.capgemini.myloggerapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.util.Log;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.spi.LoggerFactory;


public class MainActivity extends AppCompatActivity {

    public static final String TAG = MainActivity.class.getSimpleName();

    public static final Logger LOGGER = Log4jHelper.getLogger(MainActivity.class.getName());


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        LOGGER.debug("Log4j Log: Inside OnCreateMethod");
        LOGGER.info("Log4j Log: Inside OnCreateMethod");
        LOGGER.error("Log4j Log: Inside OnCreateMethod");

        Log.d(TAG,"Android Log: Inside OnCreateMethod");
        Log.i(TAG,"Android Log: Inside OnCreateMethod");
        Log.e(TAG,"Android Log: Inside OnCreateMethod");
    }
}
