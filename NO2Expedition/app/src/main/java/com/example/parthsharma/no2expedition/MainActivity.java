package com.example.parthsharma.no2expedition;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

/**
 * Created by parthsharma on 05/03/2017.
 */

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_main);
        super.onCreate(savedInstanceState);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();

        inflater.inflate(R.menu.navigation_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();


        if (id == R.id.nav_main_screen) {
            Intent main = new Intent(this, MainActivity.class);
            startActivity(main);
            return true;
        }

        if (id == R.id.nav_companies) {
            Intent main = new Intent(this, CompaniesPage.class);
            startActivity(main);
            return true;
        }

        if (id == R.id.nav_about_us) {
            Intent main = new Intent(this, AboutUsPage.class);
            startActivity(main);
            return true;
        }

        if (id == R.id.nav_contact_us) {
            Intent main = new Intent(this, ContactUsPage.class);
            startActivity(main);
            return true;
        }

        if (id == R.id.nav_directions) {
            Intent main = new Intent(this, DirectionsPage.class);
            startActivity(main);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}





