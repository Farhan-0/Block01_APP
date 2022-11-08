package com.example.block01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button buttonFirst,buttonSecond;
    //part 1
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonFirst = findViewById(R.id.buttonFirst);
        buttonFirst.setOnClickListener(this);
        buttonSecond = new Button(getApplicationContext());
        buttonSecond.setTextColor(Color.BLUE);
        buttonSecond.setBackgroundColor(Color.parseColor("#FD9BF3"));
        buttonSecond.setText("The Pink Panther's To Do List");
        RelativeLayout cl_mainScreen = (RelativeLayout) findViewById(R.id.relative_layout_mainScreen);
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );
        params.addRule(RelativeLayout.BELOW, buttonFirst.getId());
        cl_mainScreen.addView(buttonSecond, params);
        buttonSecond.setOnClickListener(this);
    }

    public void toDo(View v) {
        if(v.equals(buttonFirst)){
            v.setVisibility(View.INVISIBLE);
        }
        if(v.equals(buttonSecond)){
            Toast.makeText(getApplicationContext(),"...to do to do to do...", Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public void onClick(View view) {
        toDo(view);
    }
}

// Farhan jkr test branch

// Farhan jkr commit

// **********************

