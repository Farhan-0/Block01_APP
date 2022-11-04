package com.example.block01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button buttonFirst,buttonSecond;
    //part 1
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonFirst = findViewById(R.id.buttonFirst);
        buttonSecond = findViewById(R.id.buttonSecond);
    }

    public void toDo(View v) {
        if(v.equals(buttonFirst)){
            v.setVisibility(View.INVISIBLE);
        }
        if(v.equals(buttonSecond)){
            Toast.makeText(getApplicationContext(),"...to do to do to do...", Toast.LENGTH_LONG).show();
        }
    }
}