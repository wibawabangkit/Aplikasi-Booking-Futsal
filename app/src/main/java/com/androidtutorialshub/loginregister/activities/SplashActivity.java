package com.androidtutorialshub.loginregister.activities;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.androidtutorialshub.loginregister.R;

public class SplashActivity extends BaseActivity {

    @Override protected void onCreate(Bundle savedInstanceState) { super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash); Handler handler = new Handler();
        handler.postDelayed(new Runnable() { @Override public void run() {
            //if (sesi.isLogin()){
            startActivity(new Intent(activity, LoginActivity.class));
            finish();
//}else //startActivity(new Intent(c, MainActivity.class));
            //finish();
        }
        },5000L); }}