package com.example.myapplication;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.util.Date;


public class MainActivity extends AppCompatActivity
    implements RadioGroup.OnCheckedChangeListener{
        private ImageView image;
        private ImageView image2;
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm");
        Date curDate = new Date(System.currentTimeMillis());
        String str = formatter.format(curDate);




        @Override
        protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image = (ImageView) findViewById(R.id.imageView);
        image.setImageResource(R.mipmap.sunny2);
        image2 = (ImageView) findViewById(R.id.imgOutput);
        TextView time = (TextView) findViewById(R.id.timeOutput);
        RadioGroup rg = findViewById(R.id.rgType);
        rg.setOnCheckedChangeListener((RadioGroup.OnCheckedChangeListener) this);
             time = findViewById(R.id.timeOutput);
            @SuppressLint("SimpleDateFormat")
            SimpleDateFormat formatter = new SimpleDateFormat("HH:mm");
            Date curDate = new Date(System.currentTimeMillis());
            String str = formatter.format(curDate);
            time.setText(str);

    }


    public void onCheckedChanged (RadioGroup radioGroup,int i){
        switch (i) {
            case R.id.rdbWeather:
                image2.setImageResource(R.mipmap.weather);
                break;


            case R.id.rdbWind:
                image2.setImageResource(R.mipmap.wind);
                break;
        }
    }

}