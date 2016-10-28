package com.thunderrise.demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.thunderrise.animations.FlipAnimation;
import com.thunderrise.animations.PulseAnimation;
import com.thunderrise.animations.RotateAnimation;
import com.thunderrise.animations.ShakeAnimation;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initRotation();
        initFlip();
        initPulse();
        initShake();
    }

    private void initShake(){

        final ImageView shakeImage = (ImageView)findViewById(R.id.shake);

        ShakeAnimation.create().with(shakeImage)
                .setDuration(2000)
                .setRepeatMode(ShakeAnimation.RESTART)
                .setRepeatCount(ShakeAnimation.INFINITE)
                .start();
    }

    private void initRotation(){

        final ImageView rotationImage = (ImageView)findViewById(R.id.rotation);

        RotateAnimation.create().with(rotationImage)
                .setRepeatCount(RotateAnimation.INFINITE)
                .setRepeatMode(RotateAnimation.RESTART)
                .setDuration(2000)
                .start();
    }

    private void initPulse(){

        final ImageView pulseImage = (ImageView)findViewById(R.id.pulse);

        PulseAnimation.create().with(pulseImage)
                .setDuration(310)
                .setRepeatCount(PulseAnimation.INFINITE)
                .setRepeatMode(PulseAnimation.REVERSE)
                .start();
    }

    private void initFlip(){

        final ImageView flipImage = (ImageView)findViewById(R.id.flip);

        FlipAnimation.create().with(flipImage)
                .setDuration(3600)
                .setRepeatCount(FlipAnimation.INFINITE)
                .start();

    }
}
