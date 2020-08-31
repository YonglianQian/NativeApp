package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.microsoft.appcenter.AppCenter;
import com.microsoft.appcenter.analytics.Analytics;
import com.microsoft.appcenter.crashes.Crashes;
import com.microsoft.appcenter.distribute.Distribute;
import com.microsoft.appcenter.utils.async.AppCenterConsumer;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

static {
System.loadLibrary("mylib");
}


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AppCenter.setLogLevel(Log.VERBOSE);
        AppCenter.start(getApplication(), "e7b84169-0750-412e-834f-eeccf1ce9b54", Analytics.class, Crashes.class, Distribute.class);


SimpleDateFormat sdf=new SimpleDateFormat();
sdf.applyPattern("yyyy-MM-dd HH:mm:ss a");
Date d=new Date();
Analytics.trackEvent("button is clicked at "+sdf.format(d));


        TextView tv=new TextView(this);
        tv.setText(stringFromJNI());
        setContentView(tv);
    }

public native String stringFromJNI();
}
