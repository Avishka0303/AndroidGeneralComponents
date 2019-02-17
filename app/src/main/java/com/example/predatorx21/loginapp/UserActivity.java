package com.example.predatorx21.loginapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class UserActivity extends AppCompatActivity {

    private ImageView iv;
    private Button btn,list_btn;
    private static int images[]={R.mipmap.asus_img,R.mipmap.asus_mother,R.mipmap.asusround};
    private int i=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        buttonOnClick();
        buttonOnClickList();
    }

    public void buttonOnClick(){
        iv=(ImageView)findViewById(R.id.imageView);
        btn=(Button)findViewById(R.id.btn2);

        btn.setOnClickListener(
            new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    i++;
                    int j=i%3;
                    iv.setImageResource(images[j]);
                }
            }
        );
    }

    public void buttonOnClickList(){
        list_btn=(Button)findViewById(R.id.listbtn);
        list_btn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent=new Intent(".ListViewActivity");
                        startActivity(intent);
                    }
                }
        );
    }
}
