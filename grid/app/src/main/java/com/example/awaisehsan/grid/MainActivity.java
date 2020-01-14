package com.example.awaisehsan.grid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    int Images[]={R.drawable.aq,R.drawable.aw,R.drawable.dsd,R.drawable.fd,R.drawable.gs};
    String values[]={"Images","Images","Images","Images","Images"};
       @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GridView grid=findViewById(R.id.grid);
        gridadoptor gridadoptor=new gridadoptor(this,Images,values);
        grid.setAdapter(gridadoptor);
    }
}
