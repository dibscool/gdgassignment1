package com.androiddibya.dibya;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {


    ListView list;
    String[] name={
            "Dibyadarsi Nayak",
            "Mrs. Gayatri Patnaik",
            "Mr. Debadutta Nayak",
            "Mr. Dibyajyoti Nayak",
            "Mrs. Gitarani Naik"
            };
    String[] relation={
            "My Self",
            "Mother",
            "Father",
            "Brother",
            "Aunt",
    };
    Integer[] imageId={
            R.mipmap.ic_launcher,
            R.mipmap.ic_launcher,
            R.mipmap.ic_launcher,
            R.mipmap.ic_launcher,
            R.mipmap.ic_launcher,

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        CustomList adapter = new CustomList(MainActivity.this,name,relation,imageId);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);
    }
}
