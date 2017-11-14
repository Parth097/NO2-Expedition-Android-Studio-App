package com.example.parthsharma.no2expedition;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashActivity extends AppCompatActivity {
private long Splash_Time = 2000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_splash);


     Thread SplashThread = new Thread(){
         @Override
         public void run(){
             try {
                 sleep(Splash_Time);
                 Intent splash_intent = new Intent(getApplicationContext(), MainActivity.class);
                 startActivity(splash_intent);
                 finish();
             } catch(InterruptedException e){
                 e.printStackTrace();

             }
         }
     };

        SplashThread.start();



        final ImageView iv = (ImageView) findViewById(R.id.logo);
        final Animation an = AnimationUtils.loadAnimation(getBaseContext(), R.anim.rotate);

        iv.startAnimation(an);
        an.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                finish();

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
    }
}