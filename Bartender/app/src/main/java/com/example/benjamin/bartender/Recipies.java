package com.example.benjamin.bartender;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Benjamin on 5/2/2016.
 */
public class Recipies extends AppCompatActivity {
    //Creates list of recipes for the user to pull from
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recipies);

        ListView recipeList= (ListView)findViewById(R.id.listView);

        ArrayAdapter<String> listAdapter = new ArrayAdapter<String>(this,
                R.layout.recipe_list_item,
                R.id.listitemText,
                RecipeData.List);

        recipeList.setAdapter(listAdapter);

        recipeList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent recipeInfo = new Intent(Recipies.this, OldFashioned.class);
                startActivity(recipeInfo);
            }
        });





    }
}
