package com.example.main_page;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.format.Time;
import android.widget.TextView;
import java.text.DateFormat;
 4 import java.text.ParseException;
 5 import java.text.SimpleDateFormat;
 6 import java.util.Calendar;
 7 import java.util.Date;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Time now = new Time();
        TextView text = (TextView) findViewById(R.id.datetext);
        now.setToNow();
        String Time= now.toString();
        int month =now.month;
        int hour = now.hour;
        text.setText("time"+month+'/'+hour); //不知道怎麼更改時區
        TextView time = findViewById(R.id.datetext);
        @SuppressLint("SimpleDateFormat")
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
        Date curDate = new Date(System.currentTimeMillis());
        String str = formatter.format(curDate);
        time.setText(str)
    }


}