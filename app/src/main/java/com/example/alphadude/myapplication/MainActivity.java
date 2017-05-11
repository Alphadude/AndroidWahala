package com.example.alphadude.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void opencal(View view) {
        Intent open = new Intent(MainActivity.this,Calculator.class);
        startActivity(open);
    }

    public void openflag(View view) {
        Intent open = new Intent(MainActivity.this,FlagGame.class);
        startActivity(open);
    }
}
