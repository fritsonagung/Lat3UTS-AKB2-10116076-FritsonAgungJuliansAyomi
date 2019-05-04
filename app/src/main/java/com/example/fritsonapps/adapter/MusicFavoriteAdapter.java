package com.example.fritsonapps.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.fritsonapps.R;
import com.example.fritsonapps.model.MusicFavoriteModel;

import java.util.List;




/*
 Nama : Fritson Agung Julians Ayomi
 NIM  : 10116076
 Kelas: AKB-2
 Tanggal Pengerjaan : 24 April 2019
 */

public class MusicFavoriteAdapter extends RecyclerView.Adapter<MusicFavoriteAdapter.ViewHolder> {

    private List<MusicFavoriteModel> songs;


    public MusicFavoriteAdapter(List<MusicFavoriteModel> songs) {
        this.songs = songs;
    }

    @NonNull
    @Override
    public MusicFavoriteAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.music_favorite_view_list, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MusicFavoriteAdapter.ViewHolder holder, int position) {
        MusicFavoriteModel song = songs.get(position);
        holder.imageViewArtwork.setImageResource(song.getArtwork());
        holder.textViewTitle.setText(song.getSongTitle());
        holder.textViewGenre.setText(song.getSongGenre());
    }


    @Override
    public int getItemCount() {
        return songs.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageViewArtwork;
        private TextView textViewTitle;
        private TextView textViewGenre;

        public ViewHolder(View ItemView) {
            super(ItemView);

            imageViewArtwork = (ImageView) ItemView.findViewById(R.id.song_artwork);
            textViewTitle = (TextView) ItemView.findViewById(R.id.song_title_and_artist_text);
            textViewGenre = (TextView) ItemView.findViewById(R.id.song_genre_text);


        }
    }
}
