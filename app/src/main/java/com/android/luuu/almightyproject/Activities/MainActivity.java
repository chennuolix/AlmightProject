package com.android.luuu.almightyproject.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.android.luuu.almightyproject.Activities.LoginAndRegister.RegisterActivity;
import com.android.luuu.almightyproject.R;
import com.luuu.commodule.ToastManager;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnRegister;
    private Button btnLogin;
    private int curCount = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews() {
        btnRegister = findViewById(R.id.btn_register);
        btnRegister.setOnClickListener(this);
        btnLogin = findViewById(R.id.btn_login);
        btnLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_register:
                startActivity(new Intent(MainActivity.this, RegisterActivity.class));
                break;
            case R.id.btn_login:
                if (curCount % 2 == 0) {
                    ToastManager.showNormalTip(this, "test top gravity", Toast.LENGTH_LONG, Gravity.TOP, 0, 0);
                } else {
                    ToastManager.showLongTip(this, "test normal gravity");
                }
                curCount++;
                break;
        }
    }
}
