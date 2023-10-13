package com.devapp.counterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button click_me;
    TextView counter_view;

    int counter_number = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        click_me = findViewById(R.id.click_me_btn);
        counter_view = findViewById(R.id.counter_view);

        click_me.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter_view.setText("" +increase());
            }
        });


    }

    private int increase(){
        return ++counter_number;
    }
}