package com.example.fritsonapps.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fritsonapps.R;
import com.example.fritsonapps.adapter.MusicFavoriteAdapter;
import com.example.fritsonapps.model.MusicFavoriteModel;
import com.example.fritsonapps.presenter.MusicFavoritePresenter;
import com.example.fritsonapps.presenter.MusicFavoritePresenterImpl;
import com.example.fritsonapps.view.MusicFavoriteView;

import java.util.ArrayList;
import java.util.List;


/*
 Nama : Fritson Agung Julians Ayomi
 NIM  : 10116076
 Kelas: AKB-2
 Tanggal Pengerjaan : 24 April 2019
 */

public class MusicFavoriteFragment extends Fragment implements MusicFavoriteView {

    public View v;
    private RecyclerView recyclerSong;
    private List<MusicFavoriteModel> songs = new ArrayList<>();
    private MusicFavoriteAdapter musicFavoriteAdapter;
    private MusicFavoritePresenter musicFavoritePresenter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.music_favorite_fragment, container, false);

        musicFavoritePresenter = new MusicFavoritePresenterImpl(this);

        recyclerSong = v.findViewById(R.id.recycler_view_music);
        recyclerSong.setLayoutManager(new LinearLayoutManager(this.getContext()));

        musicFavoriteAdapter = new MusicFavoriteAdapter(songs);

        recyclerSong.setAdapter(musicFavoriteAdapter);

        musicFavoritePresenter.load();

        return v;
    }


    @Override
    public void onLoad(List<MusicFavoriteModel> song) {
        songs.clear();
        songs.addAll(song);

        musicFavoriteAdapter.notifyDataSetChanged();
    }

}
