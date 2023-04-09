package com.example.contactapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {


    private TextView x;
    private Button restart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        x = findViewById(R.id.msg);
        restart = findViewById(R.id.restart);
        Intent i=getIntent();
        String msg =  i.getStringExtra("win1Str");
        x.setText(msg);
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
        restart.setOnClickListener(view ->{
                startActivity(new Intent(this,MainActivity.class));
        });
    }
}