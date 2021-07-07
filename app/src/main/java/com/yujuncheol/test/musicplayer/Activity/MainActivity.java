package com.yujuncheol.test.musicplayer.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.yujuncheol.test.musicplayer.Model.Service.MusicService;
import com.yujuncheol.test.musicplayer.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private MediaPlayer mediaPlayer;
    private Button btn_play;
    private ArrayList<Integer> musicList = new ArrayList<>();
    private MusicService musicService;

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
                playMusic();
                // Toast.makeText(getApplicationContext(),"button",Toast.LENGTH_SHORT).show();
                break;
        }
    }

    public void playMusic() {
        if(mediaPlayer != null && mediaPlayer.isPlaying()) {
            mediaPlayer.reset(); // 기존의 mediaplayer 를 초기화 (mediaplayer.stop, mediaplayer = null 과정 포함)
            btn_play.setText("PLAY");
        }
        else {
            mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.music);
            mediaPlayer.start(); // 재생
            mediaPlayer.setLooping(true); // 반복 여부1
            btn_play.setText("STOP");
        }
    }

    public void stop() {
        if(mediaPlayer.isPlaying()) {
            mediaPlayer.release();
        }
    }

}