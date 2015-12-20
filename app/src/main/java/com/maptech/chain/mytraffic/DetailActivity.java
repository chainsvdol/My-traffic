package com.maptech.chain.mytraffic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    // Explicit
    private TextView headTextView,detailTextView;
    private ImageView trafficImageView;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // Bind Widget
        bindWidget();
            // Show view
        showView();



    }   // Main method


    private void showView() {

        // Show Head
        String strHead = getIntent().getStringExtra("Head");
        headTextView.setText(strHead);

        // Show image

        int intImage = getIntent().getIntExtra("Image1", R.drawable.traffic_01);
        trafficImageView.setImageResource(intImage);

        // Show detail

        int intIndex = getIntent().getIntExtra("Index", 0);
        String[] strDetail = getResources().getStringArray(R.array.detail);
        detailTextView.setText(strDetail[intIndex]);






    }  // ShowView
    private void bindWidget() {

        headTextView = (TextView) findViewById(R.id.textView2);
        detailTextView = (TextView) findViewById(R.id.textView3);
        trafficImageView = (ImageView) findViewById(R.id.imageView);



    }  // bindWidget


}  //  Main Class
