package com.yujuncheol.test.musicplayer.Model.Service;

import android.app.Activity;
import android.content.Context;
import android.media.MediaPlayer;

import com.yujuncheol.test.musicplayer.Activity.MainActivity;
import com.yujuncheol.test.musicplayer.R;

import java.util.ArrayList;

/*
* 음악 실행, 중지, 다음, 이전, 등록, 수정, 삭제 기능을 수행하는 클래스.
*
* */

public class MusicService {

    public void MusicService() {

    }

    public MediaPlayer playMusic(Activity activity) {
        MediaPlayer mediaPlayer = MediaPlayer.create( activity.getApplicationContext() , R.raw.iu);
        mediaPlayer.start();
        return  mediaPlayer;

    }

}
