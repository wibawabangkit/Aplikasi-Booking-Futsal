package com.androidtutorialshub.loginregister.activities;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.AlphaAnimation;

public class BaseActivity extends AppCompatActivity {
    protected Context activity;
    public AlphaAnimation btnAnimasi = new AlphaAnimation(1F, 0.5F);
   // protected AQuery aq;
    //protected SessionManager sesi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activity = this;
        //aq = new AQuery(c);
        //sesi = new SessionManager(c);
    }
}