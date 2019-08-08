package com.lau.jsonresponsedemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.efortunetech.JSONResponse;

import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    private TextView test;
    private String TAG = "tag";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        test = findViewById(R.id.test);
        String url = "https://api.github.com/users/crayonxiaoxin";

        new JSONResponse(MainActivity.this, url, new JSONResponse.JSONResponseComplete() {
            @Override
            public void onComplete(JSONObject json, boolean netError) {
                Log.i(TAG, "onComplete: " + json.toString());
                if (netError) {
                    Toast.makeText(MainActivity.this, "connection error", Toast.LENGTH_SHORT).show();
                } else {
                    test.setText(json.toString());
                }
            }
        });

    }
}
