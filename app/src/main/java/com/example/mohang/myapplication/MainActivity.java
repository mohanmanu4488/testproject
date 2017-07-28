package com.example.mohang.myapplication;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.databinding.DataBindingUtil;
import android.databinding.ObservableArrayList;
import android.databinding.ObservableList;
import android.support.v4.view.ScrollingView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import com.example.mohang.myapplication.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public ObservableList<String> observableList=new ObservableArrayList<>();

    public static final String TAG=MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       /* final ActivityMainBinding activityMainBinding=DataBindingUtil.setContentView(this,R.layout.activity_main);
        activityMainBinding.setObservableList(observableList);*/
        setContentView(R.layout.detail_layout);

  /*      activityMainBinding.recyclerview.addOnScrollListener(new RecyclerView.OnScrollListener() {

            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);


                Log.d(TAG, "onScrolled: "+activityMainBinding.matter.getY());

                if(dy>0){


                    Object object=activityMainBinding.matter.getTag();

                    if(object==null){

                        Log.d(TAG, "onScrolled: "+activityMainBinding.matter.getHeight());
                        activityMainBinding.matter.animate().yBy(activityMainBinding.matter.getHeight()).start();
                        activityMainBinding.matter.setTag("object");
                        Log.d(TAG, "onScrolled: ///////// down");


                    }
                    *//*if(recyclerView.getScrollState()==recyclerView.SCROLL_STATE_DRAGGING){
                        Log.d(TAG, "onScrolled: executed /// here");

                    }*//*

                    //.setTranslationY(activityMainBinding.matter.getY());
                   // activityMainBinding.matter.setVisibility(View.GONE);
                }else {

                    Object object=activityMainBinding.matter.getTag();
                    if(object!=null){
                        Log.d(TAG, "onScrolled: "+activityMainBinding.matter.getHeight());
                        activityMainBinding.matter.animate().yBy(-activityMainBinding.matter.getHeight()).start();
                        activityMainBinding.matter.setTag(null);
                        Log.d(TAG, "onScrolled: ////// up ");
                    }

                   // activityMainBinding.matter.animate().alpha(1).setDuration(50).start();
                   // activityMainBinding.matter.setVisibility(View.VISIBLE);
                }


            }
        });


        List<String> list=new ArrayList<>();
        for (int i = 0; i < 35; i++) {
            list.add("name "+i);
        }
        observableList.addAll(list);*/



    }
}