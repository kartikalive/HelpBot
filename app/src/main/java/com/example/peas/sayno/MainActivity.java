package com.example.peas.sayno;

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
    public void getStartedButton(View v){
        Intent nextPage = new Intent(MainActivity.this, MainMenu.class);
        startActivity(nextPage);
    }

}
