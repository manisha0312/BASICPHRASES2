package com.example.basicphrases;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public void playPhrase(View view){
        Button btn=(Button)view;
        Log.i("button preesed",btn.getTag().toString());
        MediaPlayer mPlayer = MediaPlayer.create(this, getResources().getIdentifier(btn.getTag().toString(), "raw", getPackageName()));// using tag //  play file with variables
        mPlayer.start();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
