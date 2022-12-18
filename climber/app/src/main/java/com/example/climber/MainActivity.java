package com.example.climber;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Criteria;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Spinner sp;
    String[] cities;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cities =getResources().getStringArray(R.array.city);
        sp =findViewById(R.id.spinner);
        ArrayAdapter <String> a1 = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_dropdown_item,cities);
        sp.setAdapter(a1);
    }

    public void BTCM(View view){
        String city = sp.getSelectedItem().toString();
        TextView output = findViewById(R.id.Output);
        output.setText(city+":\n  降雨量:"+ "\n  風速:"+"\n  氣溫:"+"\n  相對濕度:");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater =getMenuInflater();
        inflater.inflate(R.menu.menu_main,menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
        case R.id.weather:
        Intent intent =
                new Intent(this,equipment.class);
        startActivity(intent);

    }
        return  super.onOptionsItemSelected(item);
    }

}