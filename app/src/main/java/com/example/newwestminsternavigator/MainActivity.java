package com.example.newwestminsternavigator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONStringer;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startMap(View v)  {
//        try {
//            JSONObject obj = new JSONObject(JsonLoader.loadJSONFromAsset(this));
//            JSONArray m_jArray = obj.getJSONArray("features");
//            ArrayList<ArrayList<Double>> arrayList = new ArrayList<ArrayList<Double>>();
//
//            for (int i = 0; i < m_jArray.length(); i++) {
//                JSONObject jo_inside = m_jArray.getJSONObject(i);
//                JSONObject geometry = jo_inside.getJSONObject("geometry");
//                JSONArray coordinates = geometry.getJSONArray("coordinates");
//                coordinates.getDouble(0);
//                coordinates.getDouble(1);
//                JSONObject properties = jo_inside.getJSONObject("properties");
//                String speed = properties.getString("Speed");
//                arrayList.add(speed); EDIT THIS AND ADD TO ARRAY
//
//                Log.d("ASL", Double.toString(coordinates.getDouble(0)));
//            }
//        } catch (JSONException e) {
//            e.printStackTrace();
//        }

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