package com.example.aiocalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void Openactivity(View v){
        Toast.makeText(this, " Opening Calculator 2/2", Toast.LENGTH_SHORT).show();
        Intent intent=new Intent(this,MainActivity2.class);
        startActivity(intent);
        }
        public void openactivity(View v){
            Toast.makeText(this, " Opening Calculator 1/2", Toast.LENGTH_SHORT).show();
            Intent intent1=new Intent(this,MainActivity3.class);
            startActivity(intent1);
        }
}