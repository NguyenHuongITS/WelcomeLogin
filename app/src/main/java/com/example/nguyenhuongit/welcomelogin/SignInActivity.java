package com.example.nguyenhuongit.welcomelogin;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SignInActivity extends AppCompatActivity implements View.OnClickListener {

    //khai báo đối tượng
    Button btn_sign_in;
    TextView txt_login_facebook,txt_login_google, txt_sign_up_now, txt_forgot_password, txt_unhide_password;
    EditText edt_signin_username,edt_signin_password ;
    CheckBox ckc_keep_signin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        //hide action bar
        HideActionBar();
        //ánh xạ
        Mapping();
        //kiểm soát sự kiện click
        ControlClick();
    }

    private void Mapping() {
        btn_sign_in = (Button) findViewById(R.id.btn_sign_in);
        txt_sign_up_now = (TextView) findViewById(R.id.txt_sign_up_now);
        txt_forgot_password = (TextView) findViewById(R.id.txt_forgot_password);
        txt_login_facebook = (TextView) findViewById(R.id.txt_login_facebook);
        txt_login_google = (TextView) findViewById(R.id.txt_login_google);
        txt_unhide_password = (TextView) findViewById(R.id.txt_unhide_password);
        edt_signin_username = (EditText) findViewById(R.id.edt_signin_username);
        edt_signin_password = (EditText) findViewById(R.id.edt_signin_password);
    }

    private void ControlClick() {
        btn_sign_in.setOnClickListener(this);
        txt_sign_up_now.setOnClickListener(this);
        txt_forgot_password.setOnClickListener(this);
        txt_login_facebook.setOnClickListener(this);
        txt_login_google.setOnClickListener(this);
        txt_unhide_password.setOnClickListener(this);
    }

    private void HideActionBar() {
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_sign_in:
                Intent intent = new Intent(SignInActivity.this, MainActivity.class);
                startActivity(intent);
                break;
            case R.id.txt_sign_up_now:
                Intent intent1 = new Intent(SignInActivity.this, SignUpActivity.class);
                startActivity(intent1);
                finish();
                break;
            case R.id.txt_forgot_password:
                Toast.makeText(this, "Forgot password", Toast.LENGTH_SHORT).show();
                break;
            case R.id.txt_login_facebook:
                Toast.makeText(this, "Login facebook", Toast.LENGTH_SHORT).show();
                break;
            case R.id.txt_login_google:
                Toast.makeText(this, "Login google", Toast.LENGTH_SHORT).show();
                break;
            case R.id.txt_unhide_password:
                Toast.makeText(this, "Hide pass", Toast.LENGTH_SHORT).show();
                break;
        }
    }


}
