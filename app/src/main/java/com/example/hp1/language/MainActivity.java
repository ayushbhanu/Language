package com.example.hp1.language;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // listner for numbers

        TextView tv= (TextView) findViewById(R.id.numbers);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Numbers.class);
                startActivity(i);
            }
        });

        //listner for colors


        TextView co= (TextView) findViewById(R.id.colors);
        co.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c = new Intent(MainActivity.this, Colors.class);
                startActivity(c);
            }
        });


        //listner for family



        TextView fa= (TextView) findViewById(R.id.Family);
        fa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent f = new Intent(MainActivity.this, Family.class);
                startActivity(f);
            }
        });




        //listner for phrases


        TextView ph= (TextView) findViewById(R.id.phrases);
        ph.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p = new Intent(MainActivity.this,Phrases.class);
                startActivity(p);
            }
        });







    }



}
