package com.example.parthsharma.no2expedition;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by parthsharma on 06/02/2017.
 */
public class ContactUsPage extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us_page);
        findViewById(R.id.callButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialContactPhone("07562872419");
            }
        });


        Button email = (Button) findViewById(R.id.emailButton);
        email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent email = new Intent(Intent.ACTION_SEND);
                email.setType("text/plain");
                email.putExtra(Intent.EXTRA_EMAIL, "No2Expedition@email.com");
                email.putExtra(Intent.EXTRA_SUBJECT, "Welcome to No2Expedition");
                email.putExtra(Intent.EXTRA_TEXT, "No2Expedition");
                startActivity(Intent.createChooser(email, "Send email with..."));
            }
        });
    }

    private void dialContactPhone(final String phoneNumber) {

        startActivity(new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phoneNumber, null)));
    }

}
