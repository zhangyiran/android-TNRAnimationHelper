package com.thunderrise.animations;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.animation.LinearInterpolator;

public class ShakeAnimation {

    public ShakeAnimation with(@NonNull View view){
        this.view = view;
        return this;
    }

    public static ShakeAnimation create(){
        return new ShakeAnimation();
    }

    public void start(){

        if (view == null) throw new NullPointerException("View cant be null!");

        final ObjectAnimator imageViewObjectAnimator = ObjectAnimator.ofFloat(view, "translationX", 0, 25, -25, 25, -25,15, -15, 6, -6, 0);

        imageViewObjectAnimator.setDuration(duration);
        imageViewObjectAnimator.setRepeatMode(repeatMode);
        imageViewObjectAnimator.setRepeatCount(repeatCount);
        imageViewObjectAnimator.setInterpolator(new LinearInterpolator());
        imageViewObjectAnimator.start();
    }

    private int duration = 2000;
    private int repeatMode = ValueAnimator.RESTART;
    private int repeatCount = INFINITE;
    private View view;

    public static final int RESTART = 1;
    public static final int REVERSE = 2;
    public static final int INFINITE = -1;

    public ShakeAnimation setDuration(int duration){
        this.duration = duration;
        return this;
    }

    public ShakeAnimation setRepeatMode(int repeatMode){
        this.repeatMode = repeatMode;
        return this;
    }

    public ShakeAnimation setRepeatCount(int repeatCount){
        this.repeatCount = repeatCount;
        return this;
    }
}
