package com.example.memoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MemoDetails extends AppCompatActivity {
    TextView memoTitle;
    TextView memoDescription;
    TextView memoData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memo_details);

        memoTitle = (TextView) findViewById(R.id.title);
        memoDescription = (TextView) findViewById(R.id.description);
        memoData = (TextView) findViewById(R.id.details);

        Bundle mBundle = getIntent().getExtras();

        if (mBundle != null) {
            memoTitle.setText(mBundle.getString("Title"));
            memoDescription.setText(mBundle.getString("Description"));
            memoData.setText(mBundle.getString("Details"));
        }
    }
}