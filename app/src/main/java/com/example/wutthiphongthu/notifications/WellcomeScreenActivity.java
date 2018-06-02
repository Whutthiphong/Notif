package com.example.wutthiphongthu.notifications;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class WellcomeScreenActivity extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 3000;
    ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_wellcome_screen);
        iv = findViewById(R.id.imageView2);
//        Animation anime = AnimationUtils.loadAnimation(this,R.anim.mytransition);
//        iv.setAnimation(anime);
//        final Intent intent = new Intent(getApplicationContext(), LoginActivity.class);

        Thread tr = new Thread() {
            public void run() {
                try {

                    sleep(SPLASH_TIME_OUT);
                } catch (InterruptedException iex) {

                } finally {
                    //  animationDrawable.stop();
//                    startActivity(intent);
                    finish();
                }
            }
        };


        tr.start();

    }
}
