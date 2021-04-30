package com.example.aiocalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

    public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {
        private Button button2;
        private Button button4;
        private Button button5;
        private Button button6;
        private Button button7;
        private Button button8;
        private Button button9;
        private EditText num1;
        private EditText num2;
        private TextView ans;
        private Button button1;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        button2=findViewById(R.id.button2);
        button4=findViewById(R.id.button4);
        button5=findViewById(R.id.button5);
        button6=findViewById(R.id.button6);
        button7=findViewById(R.id.button7);
        button8=findViewById(R.id.button8);
        button9=findViewById(R.id.button9);
        num1=findViewById(R.id.num1);
        num2=findViewById(R.id.num2);
        ans=findViewById(R.id.ans);
        button1=findViewById(R.id.button1);

        button2.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        button1.setOnClickListener(this);

        SharedPreferences sp=getSharedPreferences("Mypref",MODE_PRIVATE);
        String editval=sp.getString("name","No value is selected ");
        ans.setText(editval);


    }


        @Override
        public void onClick(View v) {
        switch (v.getId()){
            case R.id.button2:
                String a=num1.getText().toString();
                String b=num2.getText().toString();
                double par=Double.parseDouble(a);
                double par1=Double.parseDouble(b);
                double c= par+par1;
                String val=Double.toString(c);
                ans.setText("The answer is: "+val);
                SharedPreferences sp=getSharedPreferences("Mypref",MODE_PRIVATE);
                SharedPreferences.Editor edit=sp.edit();
                edit.putString("name","The answer is: "+val);
                edit.apply();
                break;
            case R.id.button4:
                String a1=num1.getText().toString();
                String b1=num2.getText().toString();
                double par2=Double.parseDouble(a1);
                double par3=Double.parseDouble(b1);
                double c1= par2-par3;
                String val1=Double.toString(c1);
                ans.setText("The answer is: "+val1);
                SharedPreferences sp1=getSharedPreferences("Mypref",MODE_PRIVATE);
                SharedPreferences.Editor edit1=sp1.edit();
                edit1.putString("name","The answer is: "+val1);
                edit1.apply();
                break;
            case R.id.button5:
                String a4=num1.getText().toString();
                String b4=num2.getText().toString();
                double par8=Double.parseDouble(a4);
                double par9=Double.parseDouble(b4);
                double c4= par8/par9;
                String val4=Double.toString(c4);
                SharedPreferences sp4=getSharedPreferences("Mypref",MODE_PRIVATE);
                SharedPreferences.Editor edit4=sp4.edit();
                edit4.putString("name","The answer is: "+val4);
                edit4.apply();
                ans.setText("The answer is: "+val4);
                break;
            case R.id.button6:
                String a2=num1.getText().toString();
                String b2=num2.getText().toString();
                double par4=Double.parseDouble(a2);
                double par5=Double.parseDouble(b2);
                double c2= par4*par5;
                String val2=Double.toString(c2);
                SharedPreferences sp2=getSharedPreferences("Mypref",MODE_PRIVATE);
                SharedPreferences.Editor edit2=sp2.edit();
                edit2.putString("name","The answer is: "+val2);
                edit2.apply();
                ans.setText("The answer is: "+val2);
                break;
            case R.id.button7:
                String a6=num1.getText().toString();
                String b6=num2.getText().toString();
                double par12=Double.parseDouble(a6);
                double par13=Double.parseDouble(b6);
                double c6= Math.pow(par12,1/par13);
                String val6=Double.toString(c6);
                SharedPreferences sp6=getSharedPreferences("Mypref",MODE_PRIVATE);
                SharedPreferences.Editor edit6=sp6.edit();
                edit6.putString("name","The answer is: "+val6);
                edit6.apply();
                ans.setText("The answer is: "+val6);
                break;
            case R.id.button8:
                String a5=num1.getText().toString();
                String b5=num2.getText().toString();
                double par10=Double.parseDouble(a5);
                double par11=Double.parseDouble(b5);
                double c5= Math.pow(par10,par11);
                String val5=Double.toString(c5);
                SharedPreferences sp5=getSharedPreferences("Mypref",MODE_PRIVATE);
                SharedPreferences.Editor edit5=sp5.edit();
                edit5.putString("name","The answer is: "+val5);
                edit5.apply();
                ans.setText("The answer is: "+val5);
                break;
            case R.id.button9:
                String a7=num1.getText().toString();
                String b7=num2.getText().toString();
                double par14=Double.parseDouble(a7);
                double par15=Double.parseDouble(b7);
                double c7= par14*(par15/100);
                String val7=Double.toString(c7);
                SharedPreferences sp7=getSharedPreferences("Mypref",MODE_PRIVATE);
                SharedPreferences.Editor edit7=sp7.edit();
                edit7.putString("name","The answer is: "+val7);
                edit7.apply();
                ans.setText("The answer is: "+val7);
                break;
            case R.id.button1:
                num1.getText().clear();
                num2.getText().clear();

        }

        }
        public void activity4(View V){
            Toast.makeText(this, "Help ?", Toast.LENGTH_SHORT).show();
        Intent intent=new Intent(this,MainActivity4.class);
        startActivity(intent);
        }
    }
