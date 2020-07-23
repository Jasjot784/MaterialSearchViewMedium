package com.jasjotsingh.materialsearchview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.jasjotsingh.materialsearchview.mylibrary.MaterialSearchView;


public class MainActivity extends AppCompatActivity {
    MaterialSearchView searchView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        searchView = (MaterialSearchView) findViewById(R.id.search_view);
        searchView.setSuggestions(getResources().getStringArray(R.array.query_suggestions));
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);

        MenuItem item = menu.findItem(R.id.action_search);
        searchView.setMenuItem(item);

        return true;
    }
}