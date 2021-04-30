package com.example.aiocalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity5 extends AppCompatActivity {

    private TextView textView2;
    private ImageView img;
    private Button next1;
    private Button prev1;
    int count1=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        textView2=findViewById(R.id.textView2);
        img=findViewById(R.id.img);
        prev1=findViewById(R.id.prev1);
        next1=findViewById(R.id.next1);

        String[] content=new String[]{
                "Please Follow The Small Instruction To avoid Any Confusion!!!!!\n"+"You need not to do anything just click the button to calculate\n"+ "For calculating values of trignometric functions just type the angle in the blank place and then click the desired trignometric functions",
                "To get inverse value for the functions just check the 'Apply inverse trignometry' then click the function.\n"+ "Thanks for reading the above steps and using the app please review your ideas if you have any\n"
        };

        int [] drawable1 = new int[]{
                R.drawable.sin,
                R.drawable.inver

        };
       textView2.setText("Please Follow The Small Instruction To avoid Any Confusion!!!!!\n"+"You need not to do anything just click the button to calculate\n"+
                "For calculating values of trignometric functions just type the angle in the blank place and then click the desired trignometric functions");
        next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count1++;
                textView2.setText(content[count1]);
                img.setImageResource(drawable1[count1]);


            }
        });
        prev1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count1--;
                textView2.setText(content[count1]);
                img.setImageResource(drawable1[count1]);
            }
        });


    }
}