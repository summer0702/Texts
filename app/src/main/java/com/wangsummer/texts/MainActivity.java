package com.wangsummer.texts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    Button third;
    Button fourth;
    TextView tv2;
    TextView tv3;
    Integer textcount = 0;
    Integer modded = 0;
    EditText name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String[] thingstosay = getResources().getStringArray(R.array.thingsdisplayed);

        tv2 = findViewById(R.id.thetext2);
        third = findViewById(R.id.clickButton3);
        third.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textcount++;
                modded = textcount % 3;
                tv2.setText(thingstosay[modded]);
            }
        });

        fourth = findViewById(R.id.clickButton4);
        tv3 = findViewById(R.id.thetext3);
        name = findViewById(R.id.entername);
        fourth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String namein = name.getText().toString();
                tv3.setText("Hi " +  namein);
            }
        });


    }


}