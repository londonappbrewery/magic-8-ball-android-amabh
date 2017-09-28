package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button ask_button = (Button) findViewById(R.id.button2);

        ask_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView Ball = (ImageView) findViewById(R.id.imageView);
                Log.d("test","button is Working");
                int [] answer_all = {R.drawable.a_1,R.drawable.a_2,R.drawable.a_3,
                        R.drawable.a_8,R.drawable.a_4,R.drawable.a_5,R.drawable.a_6,
                        R.drawable.a_7,R.drawable.a_9,R.drawable.a_10,R.drawable.a_11,
                        R.drawable.a_12,R.drawable.a_13,R.drawable.a_14,R.drawable.a_15,
                        R.drawable.a_16,R.drawable.a_17,R.drawable.a_18,R.drawable.a_19};
                Random number = new Random();
                Ball.setImageResource(answer_all[number.nextInt(19)]);
            }
        });
    }
}
