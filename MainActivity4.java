package com.example.aiocalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {
    private TextView mtextView;
    private Button next;
    private Button prev;
    private ImageView imageView;
    int count=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        next=findViewById(R.id.next);
        prev=findViewById(R.id.prev);
        imageView=findViewById(R.id.imageView);
        String[] textviewer=new String[]{
                "Please Follow The Small Instruction To avoid Any Confusion!!!!!\n"+"You need not to do anything just click the button to calculate\n",
                "For calculating the values involving powers use 'First Number' for the number (x) and 'Second Number' for the corresponding power(y) \n",
                " Simlarly to find the values of roots or values involving expressions like (x)^1/y follow the above procedure.\n" +
                        "Just place 2 in the 'Second Number' for square root as simple as that!!!!\n",
                "And Most Important!!!\n" +
                        "'Second Number' is less than the 'First Number' so while subtrating you will get an negative value \n" +
                        "If your first number is less than the second number\n" ,
                "For percentage calculation use 'First number' for the number and 'Second Number' for the percent\n"+
                        "Thanks for reading the above steps and using the app please review your ideas if you have any\n"

        };
        int[]  draw=new int[]{
                R.drawable.add,
                R.drawable.mul,
                R.drawable.root,
                R.drawable.sub,

        };
       mtextView=findViewById(R.id.mtextView);
       mtextView.setText("Please Follow The Small Instruction To avoid Any Confusion!!!!!\n"+"You need not to do anything just click the button to calculate\n");
       next.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               count++;
               mtextView.setText(textviewer[count]);
               imageView.setImageResource(draw[count]);



           }
       });

       prev.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               count--;
               mtextView.setText(textviewer[count]);
               imageView.setImageResource(draw[count]);


           }
       });
    }
}