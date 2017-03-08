package com.adamzfc.router.activityrouter;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

import com.adamzfc.router.ActivityRouter;
import com.adamzfc.router.annotation.Extra;
import com.adamzfc.router.annotation.Router;
import com.adamzfc.router.annotation.SceneTransition;

@Router("second")
public class SecondActivity extends AppCompatActivity {
    @Extra("tttt")
    public String t;
    @SceneTransition("te")
    public ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        image = (ImageView) findViewById(R.id.image);
        ActivityRouter.bind(this);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, t, Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}
