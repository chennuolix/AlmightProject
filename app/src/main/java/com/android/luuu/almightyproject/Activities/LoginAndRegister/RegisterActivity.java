package com.android.luuu.almightyproject.Activities.LoginAndRegister;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.android.luuu.almightyproject.R;
import com.luuu.commodule.FormatCheckUtil;
import com.luuu.commodule.ToastManager;
import com.qmuiteam.qmui.widget.QMUILoadingView;
import com.qmuiteam.qmui.widget.QMUIProgressBar;
import com.qmuiteam.qmui.widget.dialog.QMUITipDialog;

import java.util.logging.Logger;

/**
 * Created by luuu on 2018/2/12.
 */

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText etUserName;
    private EditText etPwd;
    private EditText etConfirmPwd;
    private Button btnRegister;

    private String userName;
    private String userPwd;
    private String userConfirmPwd;

    private QMUILoadingView loadingView;
    private QMUITipDialog tipDialog;

    private FormatCheckUtil formatCheckUtil;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        initViews();
        formatCheckUtil = FormatCheckUtil.getInstance(this);
    }

    private void initViews() {
        etUserName = findViewById(R.id.et_user_name);
        etPwd = findViewById(R.id.et_pwd);
        etConfirmPwd = findViewById(R.id.et_confirm_pwd);
        btnRegister = findViewById(R.id.btn_register);
        btnRegister.setOnClickListener(this);
        loadingView = new QMUILoadingView(this);
        tipDialog = new QMUITipDialog.Builder(this).setIconType(QMUITipDialog.Builder.ICON_TYPE_LOADING).setTipWord("正在注册").create();

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_register:
                userName = etUserName.getText().toString();
                userPwd = etPwd.getText().toString();
                userConfirmPwd = etConfirmPwd.getText().toString();
                if (tipDialog.isShowing()) {
                    tipDialog.dismiss();
                } else {
                    tipDialog.show();
                }
                if (userPwd.equals(userConfirmPwd)) {
                    if (formatCheckUtil.check("NAME", userName) && formatCheckUtil.check("PWD", userPwd)) {
                        ToastManager.showShortTip(this, "注册成功");
                    }
                } else {
                    ToastManager.showShortTip(this, getResources().getString(R.string.pwd_tip));
                }
                break;
            default:
                break;
        }
    }
}