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
import com.example.fritsonapps.adapter.VideoFavoriteAdapter;
import com.example.fritsonapps.model.VideoFavoriteModel;

import java.util.Vector;


/*
 Nama : Fritson Agung Julians Ayomi
 NIM  : 10116076
 Kelas: AKB-2
 Tanggal Pengerjaan : 03 Mei 2019
 */

public class VideoFavoriteFragment extends Fragment {

    public View v;
    private RecyclerView recyclerVideo;
    Vector<VideoFavoriteModel> videos = new Vector<VideoFavoriteModel>();
    private VideoFavoriteAdapter videoFavoriteAdapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.video_favorite_fragment, container, false);

        recyclerVideo= (RecyclerView) v.findViewById(R.id.recycler_view_video);
        recyclerVideo.setHasFixedSize(true);
        recyclerVideo.setLayoutManager( new LinearLayoutManager(this.getContext()));

        videos.add( new VideoFavoriteModel("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/aAhPaiajwDY\" frameborder=\"0\" allowfullscreen></iframe>") );
        videos.add( new VideoFavoriteModel("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/oJ09xdxzIJQ\" frameborder=\"0\" allowfullscreen></iframe>") );


        videoFavoriteAdapter = new VideoFavoriteAdapter(videos);

        recyclerVideo.setAdapter(videoFavoriteAdapter);

        return v;
    }
}
