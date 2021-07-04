package com.yujuncheol.test.musicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private MediaPlayer mediaPlayer;
    private Button btn_play;
    private ArrayList<Integer> musicList = new ArrayList<>();;


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

    public ArrayList<Integer> setMusic() {
        // 첫번쨰 주소를 입력 후 R.raw. 가 비어있지 않을때 까지 추가한다.
        if (musicList.size() == 0) {
            int i = R.raw.mariin5;
                if(MediaPlayer.create(getApplicationContext(),i) != null) {
                    Toast.makeText(getApplicationContext(), "안비었음",Toast.LENGTH_SHORT).show();
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), i);
                    mediaPlayer.start();
                    // i++;
                }


        }
        return musicList;
    }

    public void playMusic() {
        setMusic();
        // mediaPlayer = MediaPlayer.create(getApplicationContext(),musicList.get(0));
        // mediaPlayer = MediaPlayer.create(getApplicationContext(),R.raw.mariin5);
        //  mediaPlayer.start();
    }
}