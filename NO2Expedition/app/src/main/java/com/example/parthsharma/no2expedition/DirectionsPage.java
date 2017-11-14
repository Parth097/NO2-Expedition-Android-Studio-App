package com.example.parthsharma.no2expedition;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


/**
 * Created by parthsharma on 06/02/2017.
 */
public class DirectionsPage extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_directions_page);

        Button button = (Button) findViewById(R.id.directionsButton);
        button.setOnClickListener (new View.OnClickListener(){
            public void onClick(View v) {
                Intent directions = new Intent(getApplicationContext(),MapsActivity.class);
                startActivity(directions);
            }
        });

    }




}
