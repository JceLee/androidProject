package com.example.newwestminsternavigator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startMap(View v) {
        Intent intent = new Intent(getApplicationContext(), MapsActivity.class);
        this.startActivity(intent);
    }

    public void openSettings(View v) {
        Intent intent = new Intent(getApplicationContext(), SettingsActivity.class);
        this.startActivity(intent);
    }

    public void exitApp(View v) {
        finish();
        System.exit(0);
    }


}
