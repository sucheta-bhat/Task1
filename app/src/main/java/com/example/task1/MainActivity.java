package com.example.task1;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.autofill.AutofillValue;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import static com.example.task1.R.color.colorPrimary;

public class MainActivity extends AppCompatActivity {

    @SuppressLint({"ResourceAsColor", "ResourceType"})
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         String[] textArray = {"One", "Two", "Three", "Four"};
        LinearLayout RLayout = new LinearLayout(this);
        setContentView(RLayout);

         RLayout.setOrientation(LinearLayout.VERTICAL);
        for (int i = 0; i < textArray.length; i++) {
            TextView textView = new TextView(this);
            textView.setText(textArray[i]);
            RLayout.addView(textView);

        }
    }


    }



