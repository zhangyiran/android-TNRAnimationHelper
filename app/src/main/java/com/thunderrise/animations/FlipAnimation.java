package com.thunderrise.animations;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.LinearInterpolator;

public class FlipAnimation {

    public FlipAnimation with(@NonNull View view){
        this.view = view;
        return this;
    }

    public static FlipAnimation create(){
        return new FlipAnimation();
    }

    public void start(){

        if (view == null) throw new NullPointerException("View cant be null!");

        final ObjectAnimator animation = ObjectAnimator.ofFloat(view, "rotationY", 0.0f, 360f);
        animation.setDuration(duration);
        animation.setRepeatCount(repeatCount);
        animation.setInterpolator(new AccelerateDecelerateInterpolator());
        animation.start();

    }

    private int duration = 3600;
    private int repeatCount = INFINITE;
    private View view;

    public static final int RESTART = 1;
    public static final int REVERSE = 2;
    public static final int INFINITE = -1;

    public FlipAnimation setDuration(int duration){
        this.duration = duration;
        return this;
    }

    public FlipAnimation setRepeatCount(int repeatCount){
        this.repeatCount = repeatCount;
        return this;
    }
}
