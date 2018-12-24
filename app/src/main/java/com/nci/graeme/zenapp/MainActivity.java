package com.nci.graeme.zenapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {


    private StorageReference mStorageRef;
    private static MediaPlayer med1, med2, med3, med4, med5, med6, med7;

    public void play_forest(View v){
        if(med1 == null){
            med1 = new MediaPlayer();
            try {
                med1.setDataSource("https://firebasestorage.googleapis.com/v0/b/zenapp-8b655.appspot.com/o/forest_river_mp3.mp3?alt=media&token=aeb06dcc-fa5e-453f-a8ad-7d0452778c94");
                med1.prepare();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        if(med1.isPlaying()){
            med1.pause();
        }
        else{
            med1.start();
        }
    }

    public void play_night(View v){
        if(med2 == null){
            med2 = new MediaPlayer();
            try {
                med2.setDataSource("https://firebasestorage.googleapis.com/v0/b/zenapp-8b655.appspot.com/o/night_sounds_mp3.mp3?alt=media&token=24fe2a43-59da-49c9-8cae-eb326ea4bbb9");
                med2.prepare();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        if(med2.isPlaying()){
            med2.pause();
        }
        else{
            med2.start();
        }
    }

    public void play_campfire(View v){
        if(med3 == null){
            med3 = new MediaPlayer();
            try {
                med3.setDataSource("https://firebasestorage.googleapis.com/v0/b/zenapp-8b655.appspot.com/o/cut_campfire.mp3?alt=media&token=52f99b5d-eb16-4e73-b796-ebe54505e7ed");
                med3.prepare();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        if(med3.isPlaying()){
            med3.pause();
        }
        else{
            med3.start();
        }
    }

    public void play_winter(View v){
        if(med4 == null){
            med4 = new MediaPlayer();
            try {
                med4.setDataSource("https://firebasestorage.googleapis.com/v0/b/zenapp-8b655.appspot.com/o/snow_sounds.mp3?alt=media&token=805048f3-753f-4753-9a01-df254e9b2477");
                med4.prepare();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        if(med4.isPlaying()){
            med4.pause();
        }
        else{
            med4.start();
        }
    }

    public void play_rain(View v){
        if(med5 == null){
            med5 = new MediaPlayer();
            try {
                med5.setDataSource("https://firebasestorage.googleapis.com/v0/b/zenapp-8b655.appspot.com/o/rain_sounds.mp3?alt=media&token=ac72fd1f-8265-4db3-a981-da22f19301ed");
                med5.prepare();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        if(med5.isPlaying()){
            med5.pause();
        }
        else{
            med5.start();
        }
    }

    public void play_city(View v){
        if(med6 == null){
            med6 = new MediaPlayer();
            try {
                med6.setDataSource("https://firebasestorage.googleapis.com/v0/b/zenapp-8b655.appspot.com/o/city_sounds.mp3?alt=media&token=99d14cee-85b3-4e22-916f-32a57c39f710");
                med6.prepare();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        if(med6.isPlaying()){
            med6.pause();
        }
        else{
            med6.start();
        }
    }

    public void play_beach(View v){
        if(med7 == null){
            med7 = new MediaPlayer();
            try {
                med7.setDataSource("https://firebasestorage.googleapis.com/v0/b/zenapp-8b655.appspot.com/o/beach_sounds_mp3.mp3?alt=media&token=4304f06e-23f3-4cc6-ae42-6c10a9ca08bc");
                med7.prepare();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        if(med7.isPlaying()){
            med7.pause();
        }
        else{
            med7.start();
        }
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        mStorageRef = FirebaseStorage.getInstance().getReference();


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


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

