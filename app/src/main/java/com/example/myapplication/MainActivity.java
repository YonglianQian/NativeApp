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

public class MainActivity extends AppCompatActivity {

    // Used to load the 'native-lib' library on application startup.


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        AppCenter.start(getApplication(), "e7b84169-0750-412e-834f-eeccf1ce9b54", Analytics.class, Crashes.class, Distribute.class);
        AppCenter.setLogLevel(Log.VERBOSE);
        //Crashes.generateTestCrash();
        TextView tv=new TextView(this);
        tv.setText("Hello, World");
        setContentView(tv);
    }


}
