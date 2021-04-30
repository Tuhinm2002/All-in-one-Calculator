package com.example.aiocalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity implements View.OnClickListener {
    private Button button;
    private Button button11;
    private Button button12;
    private Button button13;
    private Button button14;
    private Button button15;
    private Button button16;
    private TextView textView1;
    private EditText editcon;
    private CheckBox checkBox;
    private Button button17;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        button=findViewById(R.id.button);
        button11=findViewById(R.id.button11);
        button12=findViewById(R.id.button12);
        button13=findViewById(R.id.button13);
        button14=findViewById(R.id.button14);
        button16=findViewById(R.id.button16);
        button15=findViewById(R.id.button15);
        editcon=findViewById(R.id.editcon);
        textView1=findViewById(R.id.textView1);
        checkBox=findViewById(R.id.checkBox);
        button17=findViewById(R.id.button17);


        button.setOnClickListener(this);
        button11.setOnClickListener(this);
        button12.setOnClickListener(this);
        button13.setOnClickListener(this);
        button14.setOnClickListener(this);
        button15.setOnClickListener(this);
        button16.setOnClickListener(this);
        button17.setOnClickListener(this);
        SharedPreferences SP=getSharedPreferences("Mypref",MODE_PRIVATE);
        String editval1=SP.getString("name","No Value Selected");
        textView1.setText(editval1);



    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button:
                String a=editcon.getText().toString();
                double b=Double.parseDouble(a);
                double c=Math.sin(b);
                String s=Double.toString(c);
                SharedPreferences SP=getSharedPreferences("Mypref",MODE_PRIVATE);
                SharedPreferences.Editor EDIT=SP.edit();
                EDIT.putString("name","The answer is: "+s);
                EDIT.apply();
                textView1.setText("The answer is: "+s);
                if( checkBox.isChecked()){
                    String a11=editcon.getText().toString();
                    double b11=Double.parseDouble(a11);
                    double c11=Math.asin(b11);
                    String s11=Double.toString(c11);
                    SharedPreferences SP11=getSharedPreferences("Mypref",MODE_PRIVATE);
                    SharedPreferences.Editor EDIT11=SP11.edit();
                    EDIT11.putString("name","The answer is: "+s11);
                    EDIT11.apply();
                    textView1.setText("The answer is: "+s11);

            }
                break;
            case R.id.button11:
                String a1=editcon.getText().toString();
                double b1=Double.parseDouble(a1);
                double c1=Math.cos(b1);
                String s1=Double.toString(c1);
                SharedPreferences SP1=getSharedPreferences("Mypref",MODE_PRIVATE);
                SharedPreferences.Editor EDIT1=SP1.edit();
                EDIT1.putString("name","The answer is: "+s1);
                EDIT1.apply();
                textView1.setText("The answer is: "+s1);
                if( checkBox.isChecked()){
                    String a11=editcon.getText().toString();
                    double b11=Double.parseDouble(a11);
                    double c11=Math.acos(b11);
                    String s11=Double.toString(c11);
                    SharedPreferences SP11=getSharedPreferences("Mypref",MODE_PRIVATE);
                    SharedPreferences.Editor EDIT11=SP11.edit();
                    EDIT11.putString("name","The answer is: "+s11);
                    EDIT11.apply();
                    textView1.setText("The answer is: "+s11);}

                    break;
            case R.id.button12:
                String a2=editcon.getText().toString();
                double b2=Double.parseDouble(a2);
                double c2=Math.tan(b2);
                String s2=Double.toString(c2);
                SharedPreferences SP2=getSharedPreferences("Mypref",MODE_PRIVATE);
                SharedPreferences.Editor EDIT2=SP2.edit();
                EDIT2.putString("name","The answer is: "+s2);
                EDIT2.apply();
                textView1.setText("The answer is: "+s2);
                if( checkBox.isChecked()) {
                    String a11 = editcon.getText().toString();
                    double b11 = Double.parseDouble(a11);
                    double c11 = Math.atan(b11);
                    String s11 = Double.toString(c11);
                    SharedPreferences SP11 = getSharedPreferences("Mypref", MODE_PRIVATE);
                    SharedPreferences.Editor EDIT11 = SP11.edit();
                    EDIT11.putString("name", "The answer is: " + s11);
                    EDIT11.apply();
                    textView1.setText("The answer is: " + s11);
                }
                    break;
            case R.id.button13:
                String a3=editcon.getText().toString();
                double b3=Double.parseDouble(a3);
                double c3=1/(Math.sin(b3));
                String s3=Double.toString(c3);
                SharedPreferences SP3=getSharedPreferences("Mypref",MODE_PRIVATE);
                SharedPreferences.Editor EDIT3=SP3.edit();
                EDIT3.putString("name","The answer is: "+s3);
                EDIT3.apply();
                textView1.setText("The answer is: "+s3);
                if( checkBox.isChecked()) {
                    String a11 = editcon.getText().toString();
                    double b11 = Double.parseDouble(a11);
                    double c11 = 1/(Math.asin(b11));
                    String s11 = Double.toString(c11);
                    SharedPreferences SP11 = getSharedPreferences("Mypref", MODE_PRIVATE);
                    SharedPreferences.Editor EDIT11 = SP11.edit();
                    EDIT11.putString("name", "The answer is: " + s11);
                    EDIT11.apply();
                    textView1.setText("The answer is: " + s11);
                }
                    break;
            case R.id.button14:
                String a4=editcon.getText().toString();
                double b4=Double.parseDouble(a4);
                double c4=1/(Math.cos(b4));
                String s4=Double.toString(c4);
                SharedPreferences SP4=getSharedPreferences("Mypref",MODE_PRIVATE);
                SharedPreferences.Editor EDIT4=SP4.edit();
                EDIT4.putString("name","The answer is: "+s4);
                EDIT4.apply();
                textView1.setText("The answer is: "+s4);
                if( checkBox.isChecked()) {
                    String a11 = editcon.getText().toString();
                    double b11 = Double.parseDouble(a11);
                    double c11 = 1/(Math.acos(b11));
                    String s11 = Double.toString(c11);
                    SharedPreferences SP11 = getSharedPreferences("Mypref", MODE_PRIVATE);
                    SharedPreferences.Editor EDIT11 = SP11.edit();
                    EDIT11.putString("name", "The answer is: " + s11);
                    EDIT11.apply();
                    textView1.setText("The answer is: " + s11);
                }
                break;
            case R.id.button15:
                String a5=editcon.getText().toString();
                double b5=Double.parseDouble(a5);
                double c5=1/(Math.tan(b5));
                String s5=Double.toString(c5);
                SharedPreferences SP5=getSharedPreferences("Mypref",MODE_PRIVATE);
                SharedPreferences.Editor EDIT5=SP5.edit();
                EDIT5.putString("name","The answer is: "+s5);
                EDIT5.apply();
                textView1.setText("The answer is: "+s5);
                if( checkBox.isChecked()) {
                    String a11 = editcon.getText().toString();
                    double b11 = Double.parseDouble(a11);
                    double c11 = 1/(Math.atan(b11));
                    String s11 = Double.toString(c11);
                    SharedPreferences SP11 = getSharedPreferences("Mypref", MODE_PRIVATE);
                    SharedPreferences.Editor EDIT11 = SP11.edit();
                    EDIT11.putString("name", "The answer is: " + s11);
                    EDIT11.apply();
                    textView1.setText("The answer is: " + s11);
                }
                break;
            case R.id.button16:
                String a6=editcon.getText().toString();
                double b6=Double.parseDouble(a6);
                double c6=Math.log(b6);
                String s6=Double.toString(c6);
                SharedPreferences SP6=getSharedPreferences("Mypref",MODE_PRIVATE);
                SharedPreferences.Editor EDIT6=SP6.edit();
                EDIT6.putString("name","The answer is: "+s6);
                EDIT6.apply();
                textView1.setText("The answer is: "+s6);
                break;
            case R.id.button17:
                editcon.getText().clear();
                break;
        }

    }
    public void openactivity5(View v){
        Toast.makeText(this, "Help ?", Toast.LENGTH_SHORT).show();
        Intent intent2=new Intent(this,MainActivity5.class);
        startActivity(intent2);

    }
}