package com.example.alphadude.myapplication;

/**
 * Created by alphadude on 5/4/17.
 */


import android.content.Intent;
import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;


public class SplashActivity extends Activity {

        MediaPlayer ourSong;
        @Override
        protected void onCreate(Bundle Ayaosi_Godfrey) {
            super.onCreate(Ayaosi_Godfrey);
            setContentView(R.layout.splashlayout);
            ourSong = MediaPlayer.create(SplashActivity.this,R.raw.turnup);
            ourSong.start();


            Thread timer = new Thread()
            {
                public void run() {
                    try {
                        sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();

                    } finally {
                        Intent open = new Intent(SplashActivity.this,MainActivity.class);
                        startActivity(open);

                    }
                }

            };
            timer.start();
        }

        @Override
        protected void onPause() {
            super.onPause();
            ourSong.release();
            finish();
        }
    }


