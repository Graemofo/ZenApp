package com.nci.graeme.zenapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton r1, r2, r3, r4, r5, r6, r7;
    MediaPlayer mp, mp2, mp3, mp4, mp5, mp6, mp7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       r1 = findViewById(R.id.forestButton);
       r2 = findViewById(R.id.nightButton);
       r3 = findViewById(R.id.fireButton);
       r4 = findViewById(R.id.winterButton);
       r5 = findViewById(R.id.rainButton);
       r6 = findViewById(R.id.cityButton);
       r7 = findViewById(R.id.beachButton);

       mp = MediaPlayer.create(getApplicationContext(),R.raw.forest_river);
       mp2 = MediaPlayer.create(getApplicationContext(),R.raw.night_sounds_two);
       mp3 = MediaPlayer.create(getApplicationContext(),R.raw.campfire_cut);
       mp4 = MediaPlayer.create(getApplicationContext(),R.raw.snow_sounds);
       mp5 = MediaPlayer.create(getApplicationContext(),R.raw.rain_sounds);
       mp6 = MediaPlayer.create(getApplicationContext(),R.raw.city_sounds);
       mp7 = MediaPlayer.create(getApplicationContext(),R.raw.beach_sounds);

        r1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mp.isPlaying()){
                    mp.pause();
                }else{

                    mp.start();
                }
            }
        });
        r2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mp2.isPlaying()){
                    mp2.pause();
                }else{
                    mp2.start();
                }
            }
        });
        r3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mp3.isPlaying()){
                    mp3.pause();
                }else{

                    mp3.start();
                }
            }
        });
        r4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mp4.isPlaying()){
                    mp4.pause();
                }else{

                    mp4.start();
                }
            }
        });
        r5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mp5.isPlaying()){
                    mp5.pause();
                }else{

                    mp5.start();
                }
            }
        });
        r6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mp6.isPlaying()){
                    mp6.pause();
                }else{

                    mp6.start();
                }
            }
        });
        r7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mp7.isPlaying()){
                    mp7.pause();
                }else{

                    mp7.start();
                }
            }
        });



        buttontoguided();
        buttontobreathing();
    }

    private void buttontoguided(){
        Button guidedButton =  findViewById(R.id.guidedButton);
        guidedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, GuidedActivity.class));
            }
        });
    }

    private void buttontobreathing(){
        Button breathingButton =  findViewById(R.id.breathingButton);
        breathingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, BreathingActivity.class));
            }
        });
    }


}

