package com.example.nguyenhuongit.welcomelogin;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SignUpActivity extends AppCompatActivity implements View.OnClickListener {

    //Khai báo đối tượng
    Button btn_sign_up;
    TextView txt_unhide_create_pwd, txt_unhide_confirm_pwd, txt_sign_in_now;
    EditText edt_signup_fullname, edt_signup_email, edt_signup_phone, edt_signup_create_pwd, edt_signup_confirm_pwd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        //ẩn thanh trạng thái
        HideActionBar();
        //ánh xạ
        Mapping();
        //kiểm soát sự kiện click
        ControlClick();
    }

    private void Mapping() {
        btn_sign_up = (Button) findViewById(R.id.btn_sign_up);
        txt_unhide_create_pwd = (TextView) findViewById(R.id.txt_unhide_create_pwd);
        txt_unhide_confirm_pwd = (TextView) findViewById(R.id.txt_unhide_confirm_pwd);
        txt_sign_in_now = (TextView) findViewById(R.id.txt_sign_in_now);
        edt_signup_fullname = (EditText) findViewById(R.id.edt_signup_fullname);
        edt_signup_email = (EditText) findViewById(R.id.edt_signup_email);
        edt_signup_phone = (EditText) findViewById(R.id.edt_signup_phone);
        edt_signup_create_pwd = (EditText) findViewById(R.id.edt_signup_create_pwd);
        edt_signup_confirm_pwd = (EditText) findViewById(R.id.edt_signup_confirm_pwd);
       }

    private void ControlClick() {
        btn_sign_up.setOnClickListener(this);
        txt_unhide_create_pwd.setOnClickListener(this);
        txt_unhide_confirm_pwd.setOnClickListener(this);
        txt_sign_in_now.setOnClickListener(this);
    }

    private void HideActionBar() {
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_sign_up:
                Intent intent = new Intent(SignUpActivity.this, MainActivity.class);
                startActivity(intent);
                break;
            case R.id.txt_unhide_create_pwd:
                Toast.makeText(this, "create password", Toast.LENGTH_SHORT).show();
                break;
            case R.id.txt_unhide_confirm_pwd:
                Toast.makeText(this, "confirm password", Toast.LENGTH_SHORT).show();
                break;
                case R.id.txt_sign_in_now:
                    Intent intent1 = new Intent(SignUpActivity.this, SignInActivity.class);
                    startActivity(intent1);
                    finish();
                break;
        }
    }
}
