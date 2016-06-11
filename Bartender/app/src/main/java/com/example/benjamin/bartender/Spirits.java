package com.example.benjamin.bartender;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;


/**
 * Created by Benjamin on 6/7/2016.
 */
public class Spirits extends AppCompatActivity {
    //creates list of Spirits for user to pull from.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spirits_layout);

        ListView spiritsList= (ListView)findViewById(R.id.listView);

        ArrayAdapter<String> listAdapter = new ArrayAdapter<String>(this,
                R.layout.recipe_list_item,
                R.id.listitemText,
                SpiritsData.List);

        spiritsList.setAdapter(listAdapter);

        spiritsList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent recipeInfo = new Intent(Spirits.this, Bourbon.class);
                startActivity(recipeInfo);
            }
        });
    }
}