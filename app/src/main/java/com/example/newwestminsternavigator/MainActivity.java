package com.example.newwestminsternavigator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startMap(View v) throws Exception {
//        //try {
//            JSONObject obj = new JSONObject(JsonLoader.loadJSONFromAsset(this));
//            JSONArray m_jArry = obj.getJSONArray("features");
//            ArrayList<ArrayList<Double>> arrayList = new ArrayList<ArrayList<Double>>();
//
//            for (int i = 0; i < m_jArry.length(); i++) {
//                JSONObject jo_inside = m_jArry.getJSONObject(i);
//                JSONObject geometry = jo_inside.getJSONObject("geometry");
//                JSONArray coordinates = geometry.getJSONArray("coordinates");
//                coordinates.getDouble(0);
//                coordinates.getDouble(1);
//                Log.d("ASL", Double.toString(coordinates.getDouble(0)));
//            }
////        } catch (JSONException e) {
////            e.printStackTrace();
////        }
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