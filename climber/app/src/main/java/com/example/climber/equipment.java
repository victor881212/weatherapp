package com.example.climber;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class equipment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equipment);
    }
    public void BTC(View view){
        String str ="";
        CheckBox c1 = findViewById(R.id.checkBox);
        if(c1.isChecked()==false)
            str+=c1.getText()+"\n";
        CheckBox c2 = findViewById(R.id.checkBox2);
        if(c2.isChecked()==false)
            str+=c2.getText()+"\n";
        CheckBox c3 = findViewById(R.id.checkBox3);
        if(c3.isChecked()==false)
            str+=c3.getText()+"\n";
        CheckBox c4 = findViewById(R.id.checkBox4);
        if(c4.isChecked()==false)
            str+=c4.getText()+"\n";
        CheckBox c5 = findViewById(R.id.checkBox5);
        if(c5.isChecked()==false)
            str+=c5.getText()+"\n";
        CheckBox c6 = findViewById(R.id.checkBox6);
        if(c6.isChecked()==false)
            str+=c6.getText()+"\n";
        CheckBox c7 = findViewById(R.id.checkBox7);
        if(c7.isChecked()==false)
            str+=c7.getText()+"\n";
        CheckBox c8 = findViewById(R.id.checkBox8);
        if(c8.isChecked()==false)
            str+=c8.getText()+"\n";
        CheckBox c9 = findViewById(R.id.checkBox9);
        if(c9.isChecked()==false)
            str+=c9.getText()+"\n";
        CheckBox c10 = findViewById(R.id.checkBox10);
        if(c10.isChecked()==false)
            str+=c10.getText()+"\n";
        CheckBox c11 = findViewById(R.id.checkBox11);
        if(c11.isChecked()==false)
            str+=c11.getText()+"\n";
        CheckBox c12 = findViewById(R.id.checkBox12);
        if(c12.isChecked()==false)
            str+=c12.getText()+"\n";
        CheckBox c13 = findViewById(R.id.checkBox13);
        if(c13.isChecked()==false)
            str+=c13.getText()+"\n";
        CheckBox c14 = findViewById(R.id.checkBox14);
        if(c14.isChecked()==false)
            str+=c14.getText()+"\n";

        if(str ==""){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("恭喜");
            builder.setMessage("帶齊了");
            builder.setCancelable(true);
            builder.setPositiveButton("好ㄟ",null);
            builder.show();
            finish();
        }else {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("缺少");
            builder.setMessage(str);
            builder.setCancelable(true);
            builder.setPositiveButton("ok",null);
            builder.show();
        }
    }
    public void BTC2 (View view){
        finish();
    }
}