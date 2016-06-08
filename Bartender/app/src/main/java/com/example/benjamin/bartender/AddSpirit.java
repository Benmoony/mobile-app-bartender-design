package com.example.benjamin.bartender;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Benjamin on 6/8/2016.
 */
public class AddSpirit extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_layout);
    }
    public void addSpirit(View view)
    {
        Intent intent = new Intent(AddSpirit.this, Bourbon.class);
        startActivity(intent);
    }
}
