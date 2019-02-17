package com.example.predatorx21.loginapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText user_name;
    private EditText password;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();
    }

    public void addListenerOnButton(){
        user_name=(EditText)findViewById(R.id.editText);
        password=(EditText)findViewById(R.id.editText2);
        btn=(Button)findViewById(R.id.button);

        btn.setOnClickListener(
            new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                if(String.valueOf(user_name.getText()).equals("user") && String.valueOf(password.getText()).equals("pass")){
                    Intent in=new Intent(".UserActivity");
                    startActivity(in);
                }
                }
            }
        );
    }
}
