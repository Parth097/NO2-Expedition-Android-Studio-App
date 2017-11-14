package com.example.parthsharma.no2expedition;


import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.ImageButton;


/**
 * Created by parthsharma on 07/02/2017.
 */
public class CompaniesPage extends MainActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_companies_page);

        ImageButton fordButton = (ImageButton) findViewById(R.id.fordButton);
        fordButton.setOnClickListener(new View.OnClickListener() {;

            @Override
            public void onClick(View v) {
                Intent ford = new Intent(getApplicationContext(), FordPage.class);
                startActivity(ford);
            }
        }
        );

        ImageButton bugattiButton = (ImageButton) findViewById(R.id.bugattibutton);
        bugattiButton.setOnClickListener(new View.OnClickListener() {;

            @Override
            public void onClick(View v) {
                Intent bugatti = new Intent(getApplicationContext(), BugattiPage.class);
                startActivity(bugatti);
            }
        }
        );

        ImageButton lamborghiniButton = (ImageButton) findViewById(R.id.lamborghinibutton);
        lamborghiniButton.setOnClickListener(new View.OnClickListener() {;

            @Override
            public void onClick(View v) {
                Intent lamborghini = new Intent(getApplicationContext(), LamborghiniPage.class);
                startActivity(lamborghini);
            }
        }
        );

        ImageButton rollsroyceButton = (ImageButton) findViewById(R.id.rollsroyceButton);
        rollsroyceButton.setOnClickListener(new View.OnClickListener() {;

            @Override
            public void onClick(View v) {
                Intent rollsroyce = new Intent(getApplicationContext(), RollsRoycePage.class);
                startActivity(rollsroyce);
            }
        }
        );

}}






