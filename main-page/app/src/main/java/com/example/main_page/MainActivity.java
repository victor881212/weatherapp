package com.example.main_page;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.format.Time;
import android.widget.TextView;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Time now = new Time();
        TextView text = (TextView) findViewById(R.id.text1);
        now.setToNow();
        String Time= now.toString();
        int month =now.month;
        int hour = now.hour;
        text.setText("time"+month+'/'+hour);



        String DATE_FORMAT = "yyyy-M-dd'T'hh:mm:ss.SSS'Z'";
        DateFormat df = new SimpleDateFormat(DATE_FORMAT);
        df.setTimeZone(TimeZone.getTimeZone("UTC"));
        Date date = df.parse(respTime);
        df = new SimpleDateFormat("yyyy/MM/dd HH:mm");
        df.setTimeZone(TimeZone.getDefault());
    }


}