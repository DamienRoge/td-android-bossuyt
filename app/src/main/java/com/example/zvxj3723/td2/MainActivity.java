package com.example.zvxj3723.td2;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        String mTitle = "Title";

        getMenuInflater().inflate(R.menu.main, menu);
        //restoreActionBar();
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowTitleEnabled(true);
        actionBar.setTitle(mTitle);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()) {
            case R.id.action_settings:
                Toast toast = Toast.makeText(getApplicationContext(), "Settings", Toast.LENGTH_SHORT);
                toast.show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }


    /* EXERCICES A */
    public void exoA_1(View v) {
        if (v.getId() == R.id.exoA_1) {
            Intent i = new Intent(MainActivity.this, LayoutRelative.class);
            startActivity(i);
        }
    }

    public void exoA_2(View v) {
        if (v.getId() == R.id.exoA_2) {
            Intent i = new Intent(MainActivity.this, GalleryAndroidActivity.class);
            startActivity(i);
        }
    }

    /* EXERCICE B */
    public void numberPicker(View v) {
        if (v.getId() == R.id.numberPicker) {
            Intent i = new Intent(MainActivity.this, NumbPicker.class);
            startActivity(i);
        }
    }
}
