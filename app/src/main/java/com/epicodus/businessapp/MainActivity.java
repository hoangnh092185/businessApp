package com.epicodus.businessapp;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;


public class MainActivity extends AppCompatActivity {
    @Bind(R.id.appNameTextView) TextView mAppNameTextView;
    @Bind(R.id.exploreAdxButton) Button mExploreAdxButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


        Typeface old_stamper = Typeface.createFromAsset(getAssets(), "fonts/old_stamper.ttf");
        mAppNameTextView.setTypeface(old_stamper);

        mExploreAdxButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(intent);
            }

        });
    }

}