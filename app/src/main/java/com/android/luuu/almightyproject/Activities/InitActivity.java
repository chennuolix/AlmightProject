package com.android.luuu.almightyproject.Activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.android.luuu.almightyproject.AppInit.InitManager;


/**
 * Created by luuu on 2018/1/27.
 */

public class InitActivity extends Activity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        InitManager.setAppInitListener(new InitManager.AppInitListener() {
            @Override
            public void initSuccess() {
                startActivity(new Intent(InitActivity.this, MainActivity.class));
                finish();
            }

            @Override
            public void initFail(String failStr) {

            }
        });
        InitManager.init(this);
    }

}
