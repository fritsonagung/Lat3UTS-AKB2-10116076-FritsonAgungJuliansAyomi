package com.example.fritsonapps.adapter;


/*
 Nama : Fritson Agung Julians Ayomi
 NIM  : 10116076
 Kelas: AKB-2
 Tanggal Pengerjaan : 03 Mei 2019
 */


import android.annotation.SuppressLint;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

import com.example.fritsonapps.R;
import com.example.fritsonapps.model.VideoFavoriteModel;

import java.util.List;

public class VideoFavoriteAdapter extends RecyclerView.Adapter<VideoFavoriteAdapter.ViewHolder> {

    private List<VideoFavoriteModel> videos;


    public VideoFavoriteAdapter(List<VideoFavoriteModel> videos) {
        this.videos = videos;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from( parent.getContext()).inflate(R.layout.video_favorite_view_list, parent, false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.videoWebView.loadData( videos.get(position).getVideoURL(), "text/html" , "utf-8" );

    }


    @Override
    public int getItemCount() {
        return videos.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        WebView videoWebView;

        @SuppressLint("SetJavaScriptEnabled")
        public ViewHolder(View itemView) {
            super(itemView);

            videoWebView = (WebView) itemView.findViewById(R.id.video_web_view);

            videoWebView.getSettings().setJavaScriptEnabled(true);
            videoWebView.setBackgroundColor(Color.TRANSPARENT);
            videoWebView.setWebChromeClient(new WebChromeClient() {
            } );

        }

    }

}
