package com.yujuncheol.test.musicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private MediaPlayer mediaPlayer;
    private Button btn_play;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_play = findViewById(R.id.button_play);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_play:
                Toast.makeText(getApplicationContext(),"button",Toast.LENGTH_SHORT).show();
                break;
        }
    }
}