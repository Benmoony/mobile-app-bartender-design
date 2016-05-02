package com.example.benjamin.bartender;

import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ToDo: Find view by ID of imageview
        ImageView buttonsys = (ImageView) findViewById(R.id.CentralButton);
        //ToDo: then create the onclick event handler
        buttonsys.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //ToDo: get coordinates of where touched/ get colour
                int clickx = (int) v.getX();
                int clicky = (int) v.getY();

                int color = getColour(clickx,clicky);
                //ToDo: Execute activity Dependant on Color


                Intent menuIntent;
                if(color == -9301727) {

                    menuIntent = new Intent(getApplicationContext(), Recipies.class);

                }
                else{
                    menuIntent = new Intent(getApplicationContext(), LoginActivity.class);
                }

                startActivity(menuIntent);

            }
        });
    }

    private int getColour(int x, int y)
    {
        ImageView img =(ImageView) findViewById(R.id.CentralButton);
        img.setDrawingCacheEnabled(true);
        Bitmap hotspots=Bitmap.createBitmap(img.getDrawingCache());
        img.setDrawingCacheEnabled(false);
        return hotspots.getPixel(x, y);
    }


}
