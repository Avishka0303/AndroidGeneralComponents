package com.example.predatorx21.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListViewActivity extends AppCompatActivity {

    private ListView list_view;
    private static String names[]=new String[]{"ASUS","HP","DELL","MSI","GIGABYTE","ALIENWARE"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        setList_view();
    }

    public void setList_view(){
        list_view=(ListView)findViewById(R.id.listv);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,R.layout.name_list,names);
        list_view.setAdapter(adapter);

        list_view.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        String value=(String)list_view.getItemAtPosition(i);
                        Toast.makeText(ListViewActivity.this , "You clicked "+" "+value , Toast.LENGTH_SHORT ).show();
                    }
                }
        );
    }


}
