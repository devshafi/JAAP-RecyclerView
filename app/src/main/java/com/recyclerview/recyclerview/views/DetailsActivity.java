package com.recyclerview.recyclerview.views;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatTextView;
import android.util.Log;

import com.recyclerview.recyclerview.R;

public class DetailsActivity extends AppCompatActivity {

    AppCompatTextView tvName;
    AppCompatTextView tvMobile;
    AppCompatTextView tvAge;

    private static final String TAG = "DetailsActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        tvName = findViewById(R.id.tvName);
        tvMobile = findViewById(R.id.tvMobile);
        tvAge = findViewById(R.id.tvAge);

        String name = getIntent().getStringExtra("name");
        String mobile = getIntent().getStringExtra("mobile");
        String age = getIntent().getStringExtra("age");

        Log.d(TAG, "onCreate Userdata debug: "+name+" "+mobile+" "+age);

        tvName.setText(name);
        tvMobile.setText(mobile);
        tvAge.setText(age);


    }


}
