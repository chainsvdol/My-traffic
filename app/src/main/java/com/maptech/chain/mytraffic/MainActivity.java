package com.maptech.chain.mytraffic;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import static com.maptech.chain.mytraffic.R.id.button;

public class MainActivity extends AppCompatActivity {

    //Explicit
    private ListView trafficListView;
    private Button aboutMeButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Bind Widdget
        bindWidget();

        //Button Controller

        buttonController();

        // ListView Controller

        listViewController();


    }       // Main Method

    private void listViewController() {

        // Setup Array #1
        int[] intIcon = {R.drawable.traffic_01, R.drawable.traffic_02,
                R.drawable.traffic_03, R.drawable.traffic_04, R.drawable.traffic_05,
                R.drawable.traffic_06, R.drawable.traffic_07, R.drawable.traffic_08,
                R.drawable.traffic_09, R.drawable.traffic_10, R.drawable.traffic_11,
                R.drawable.traffic_12, R.drawable.traffic_13, R.drawable.traffic_14,
                R.drawable.traffic_15, R.drawable.traffic_16, R.drawable.traffic_17,
                R.drawable.traffic_18, R.drawable.traffic_19, R.drawable.traffic_20};

        // Setup Array #2
        String[] titlestrings = new String[20];
        titlestrings[0] = "หัวข้อที่ 1";
        titlestrings[1] = "หัวข้อที่ 2";
        titlestrings[2] = "หัวข้อที่ 3";
        titlestrings[3] = "หัวข้อที่ 4";
        titlestrings[4] = "หัวข้อที่ 5";
        titlestrings[5] = "หัวข้อที่ 6";
        titlestrings[6] = "หัวข้อที่ 7";
        titlestrings[7] = "หัวข้อที่ 8";
        titlestrings[8] = "หัวข้อที่ 9";
        titlestrings[9] = "หัวข้อที่ 10";
        titlestrings[10] = "หัวข้อที่ 11";
        titlestrings[11] = "หัวข้อที่ 12";
        titlestrings[12] = "หัวข้อที่ 13";
        titlestrings[13] = "หัวข้อที่ 14";
        titlestrings[14] = "หัวข้อที่ 15";
        titlestrings[15] = "หัวข้อที่ 16";
        titlestrings[16] = "หัวข้อที่ 17";
        titlestrings[17] = "หัวข้อที่ 18";
        titlestrings[18] = "หัวข้อที่ 19";
        titlestrings[19] = "หัวข้อที่ 20";

            // Setup Array #3
        String[] strTitle2 =getResources().getStringArray(R.array.title2);

        MyAdapter objMyAdapter =new MyAdapter(MainActivity.this,titlestrings,strTitle2,intIcon);
        trafficListView.setAdapter(objMyAdapter);


    }      // ListViewController

    private void buttonController() {

        aboutMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer buttonMediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.effect_btn_long);
                buttonMediaPlayer.start();

                //Intent to web

                Intent objIntent = new Intent(Intent.ACTION_VIEW);
                objIntent.setData(Uri.parse("https://youtu.be/5LiD09JMqH8"));
                startActivity(objIntent);

            }
        });

    }


    private void bindWidget() {

        trafficListView = (ListView) findViewById(R.id.listView);
        aboutMeButton = (Button) findViewById(R.id.button);


    }


}       // Main Class
