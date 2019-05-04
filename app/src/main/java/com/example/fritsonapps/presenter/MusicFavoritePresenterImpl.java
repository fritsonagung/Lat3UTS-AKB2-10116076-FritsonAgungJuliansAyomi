package com.example.fritsonapps.presenter;

/*
 Nama : Fritson Agung Julians Ayomi
 NIM  : 10116076
 Kelas: AKB-2
 Tanggal Pengerjaan : 24 April 2019
 */

import com.example.fritsonapps.R;
import com.example.fritsonapps.model.DailyActivityModel;
import com.example.fritsonapps.model.MusicFavoriteModel;
import com.example.fritsonapps.view.MusicFavoriteView;


import java.util.ArrayList;
import java.util.List;

public class MusicFavoritePresenterImpl implements MusicFavoritePresenter {

    private MusicFavoriteView musicFavoriteView;

    private List<MusicFavoriteModel> songs = new ArrayList<>();

    public MusicFavoritePresenterImpl(MusicFavoriteView musicFavoriteView) {
        this.musicFavoriteView = musicFavoriteView;
        setData();
    }

    private void setData() {
        MusicFavoriteModel song = new MusicFavoriteModel();
        song.setArtwork(R.drawable.song_1);
        song.setSongTitle("Hey, Soul Sister - Train");
        song.setSongGenre("Pop rock, Folk rock");
        songs.add(song);

        MusicFavoriteModel song1 = new MusicFavoriteModel();
        song1.setArtwork(R.drawable.song_2);
        song1.setSongTitle("Clock Strike - One Ok Rock");
        song1.setSongGenre("Alternative rock, Power pop, Pop punk");
        songs.add(song1);
    }

    @Override
    public void load() {
        musicFavoriteView.onLoad(songs);
    }
}
