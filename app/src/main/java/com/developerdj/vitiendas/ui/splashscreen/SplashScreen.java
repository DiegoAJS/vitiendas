package com.developerdj.vitiendas.ui.splashscreen;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.developerdj.vitiendas.MainActivity;
import com.developerdj.vitiendas.R;

public class SplashScreen extends AppCompatActivity implements Animation.AnimationListener {

    private LinearLayout linearLayout;

    // Animation
    Animation animFadein;

    // Animation
    Animation animFadeOut;

    public static void createInstance(Context context) {
        Intent intent = getLaunchIntent(context);
        context.startActivity(intent);
    }

    public static Intent getLaunchIntent(Context context) {
        Intent intent = new Intent(context, SplashScreen.class);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        linearLayout=(LinearLayout) findViewById(R.id.ll_splash_screen);
        // load the animation
        animFadein = AnimationUtils.loadAnimation(this,R.anim.fade_in);
        // set animation listener
        animFadein.setAnimationListener(this);

        // load the animation
        animFadeOut = AnimationUtils.loadAnimation(this,R.anim.fade_out);
        // set animation listener
        animFadeOut.setAnimationListener(this);

        linearLayout.startAnimation(animFadein);

    }

    @Override
    public void onAnimationStart(Animation animation) {

    }

    @Override
    public void onAnimationEnd(Animation animation) {

        // check for fade in animation
        if (animation == animFadein){
            linearLayout.startAnimation(animFadeOut);
        }
        //
        if (animation == animFadeOut){
            MainActivity.createInstance(this);
            finish();
        }

    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }
}
