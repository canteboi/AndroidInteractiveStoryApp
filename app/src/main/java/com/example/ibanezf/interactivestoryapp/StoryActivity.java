package com.example.ibanezf.interactivestoryapp;

import android.os.Bundle;
import android.app.Activity;

public class StoryActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);
        getActionBar().show();
//        getActionBar().setDisplayHomeAsUpEnabled(true);

        getIntent().getCharExtra("name")
    }

}
