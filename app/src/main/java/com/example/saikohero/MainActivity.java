package com.example.saikohero;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    protected Button btnMenu;
    protected ImageView imgLogo;
    protected MediaPlayer FonDJ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMenu=(Button) findViewById(R.id.btnMenu);
        imgLogo=(ImageView) findViewById(R.id.imgLogo);
        Animation a = AnimationUtils.loadAnimation(MainActivity.this,R.anim.menu1);
        btnMenu.startAnimation(a);
        FonDJ=MediaPlayer.create(this,R.raw.menu);
        FonDJ.start();

        btnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0f);
                alphaAnimation.setDuration(600);
                btnMenu.startAnimation(alphaAnimation);
                btnMenu.setVisibility(View.INVISIBLE);
            }
        });
    }
}
