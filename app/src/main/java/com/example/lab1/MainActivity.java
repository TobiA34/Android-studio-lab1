package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button redButton = findViewById(R.id.redButton);
        final Button blueButton = findViewById(R.id.blueButton);
        final Button changeTextButton = findViewById(R.id.changeText);
        final TextView newTitle = findViewById(R.id.newHeader);



        redButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeViewRed(v);
                newTitle.setText("Red");
             }
        });


        blueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeViewBlue(v);
                newTitle.setText("Blue");

            }
        });

        changeTextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                  newTitle.setText("Welcome to The first Android Studio Project");
             }
        });




    }



    public void changeViewRed(View v){
        this.getWindow().getDecorView().getRootView().setBackgroundColor(Color.RED);
    }

    public void changeViewBlue(View v){
        this.getWindow().getDecorView().getRootView().setBackgroundColor(Color.BLUE);
    }

}
