package com.example.mohang.myapplication;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;

public class MoveUpwardBehavior extends CoordinatorLayout.Behavior<RecyclerView> {

    public static final String TAG=MoveUpwardBehavior.class.getSimpleName();

    public MoveUpwardBehavior(){
        //super();
    }

    public MoveUpwardBehavior(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onDependentViewChanged(CoordinatorLayout parent, RecyclerView child, View dependency) {
        Log.d(TAG, "onDependentViewChanged: ");

        float translationY = Math.min(0, dependency.getTranslationY() - dependency.getHeight());
        child.setTranslationY(translationY);
        return true;
    }

    @Override
    public boolean layoutDependsOn(CoordinatorLayout parent, RecyclerView child, View dependency) {
        Log.d(TAG, "layoutDependsOn: "+(dependency instanceof RelativeLayout));

        return dependency instanceof RecyclerView;
    }

    @Override
    public void onDependentViewRemoved(CoordinatorLayout parent, RecyclerView child, View dependency) {
        super.onDependentViewRemoved(parent, child, dependency);
        child.setTranslationY(0);
    }
}