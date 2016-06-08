package com.example.benjamin.bartender;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

/**
 * Created by Benjamin on 6/8/2016.
 */
public class Bourbon extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bour_layout);

        ListView recipeList= (ListView)findViewById(R.id.listView);

        ArrayAdapter<String> listAdapter = new ArrayAdapter<String>(this,
                R.layout.recipe_list_item,
                R.id.listitemText,
                BourbonData.List);

        recipeList.setAdapter(listAdapter);

        recipeList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent recipeInfo = new Intent(Bourbon.this, OldFashioned.class);
                startActivity(recipeInfo);
            }
        });
    }
    public void addSpirit(View view)
    {
        Intent intent = new Intent(Bourbon.this, AddSpirit.class);
        startActivity(intent);
    }
}

