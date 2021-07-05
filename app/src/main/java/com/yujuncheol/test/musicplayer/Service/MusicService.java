package com.yujuncheol.test.musicplayer.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;

/*
* 음악 실행, 중지, 다음, 이전, 등록, 수정, 삭제 기능을 수행하는 클래스.
*
* */

public class MusicService {

    private ArrayList<Integer> musicList;

    public void setMusicList(int num) {
        musicList = new ArrayList<>();

        musicList.add(num);
    }

    public ArrayList<Integer> getMusicList() {

        return musicList;
    }

}
