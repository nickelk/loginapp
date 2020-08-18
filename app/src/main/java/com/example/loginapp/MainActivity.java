package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView img;
    private Button btn;
    private EditText email, pass;

    private static final String email_txt = "example@gmail.com";
    private static final String pass_txt = "123";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login();
    }

    public void login(){
        img = (ImageView)findViewById(R.id.imageView2);
        btn = (Button)findViewById(R.id.button);
        email = (EditText)findViewById(R.id.editTextEmailAddress);
        pass = (EditText)findViewById(R.id.editTextPassword);

        btn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (email_txt.equals(String.valueOf(email.getText())) && pass_txt.equals(String.valueOf(pass.getText())))
                            img.setImageResource(R.drawable.right);
                        else
                            img.setImageResource(R.drawable.wrong);
                    }
                }
        );
    }
}