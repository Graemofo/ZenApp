package com.nci.graeme.zenapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.storage.StorageReference;

import java.io.IOException;

public class GuidedActivity extends AppCompatActivity {

    private StorageReference mStorageRef;
    private static MediaPlayer med1, med2, med3, med4, med5, med6, med7;


    public void guided_anxiety(View v){
        if(med1 == null){
            med1 = new MediaPlayer();
            try {
                med1.setDataSource("https://firebasestorage.googleapis.com/v0/b/zenapp-8b655.appspot.com/o/guided_anxiety.mp3?alt=media&token=3a26a7c7-2af7-4770-9528-d9798502bda5");
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

    public void guided_stress(View v){
        if(med2 == null){
            med2 = new MediaPlayer();
            try {
                med2.setDataSource("https://firebasestorage.googleapis.com/v0/b/zenapp-8b655.appspot.com/o/guided_stress.mp3?alt=media&token=7d217e49-c119-454b-8ce3-0688f196f347");
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

    public void guided_sleep(View v){
        if(med3 == null){
            med3 = new MediaPlayer();
            try {
                med3.setDataSource("https://firebasestorage.googleapis.com/v0/b/zenapp-8b655.appspot.com/o/guided_sleep.mp3?alt=media&token=32405a21-bd4a-44d8-aa1b-ab0739e949ea");
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

    public void guided_depression(View v){
        if(med4 == null){
            med4 = new MediaPlayer();
            try {
                med4.setDataSource("https://firebasestorage.googleapis.com/v0/b/zenapp-8b655.appspot.com/o/guided_depression.mp3?alt=media&token=98c84f60-0b28-4a8b-8ff9-ac6a335894d9");
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

    public void guided_confidence(View v){
        if(med5 == null){
            med5 = new MediaPlayer();
            try {
                med5.setDataSource("https://firebasestorage.googleapis.com/v0/b/zenapp-8b655.appspot.com/o/guided_confidence.mp3?alt=media&token=9c497e76-ca87-43b4-ac37-76b8c96f3cde");
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



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guided);

        buttonSounds();
        buttonBreathing();
    }

    private void buttonSounds(){
        Button soundsButton = (Button) findViewById(R.id.soundsButton);
        soundsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(GuidedActivity.this, MainActivity.class));
            }
        });
    }

    private void buttonBreathing(){
        Button breathingButton = (Button) findViewById(R.id.breathingButton);
        breathingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(GuidedActivity.this, BreathingActivity.class));
            }
        });
    }
}
