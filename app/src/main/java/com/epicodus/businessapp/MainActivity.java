package com.epicodus.businessapp;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private TextView mAppNameTextView;
    private Button mExploreAdxButton;
//    @Bind(R.id.appNameTextView) TextView mAppNameTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAppNameTextView = (TextView) findViewById(R.id.appNameTextView);
        Typeface old_stamper = Typeface.createFromAsset(getAssets(), "fonts/old_stamper.ttf");
        mAppNameTextView.setTypeface(old_stamper);


            mExploreAdxButton = (Button) findViewById(R.id.exploreAdxButton);
            mExploreAdxButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this, AboutActivity.class);
                    startActivity(intent);
                }

            });

        }

    }

