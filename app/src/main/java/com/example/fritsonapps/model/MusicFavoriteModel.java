package com.example.fritsonapps.model;

/*
 Nama : Fritson Agung Julians Ayomi
 NIM  : 10116076
 Kelas: AKB-2
 Tanggal Pengerjaan : 03 Mei 2019
 */

public class MusicFavoriteModel {

    private int song;
    private int artwork;
    private String songTitle;
    private String songGenre;

    public int getArtwork() {
        return artwork;
    }
    public void setArtwork(int artwork) {
        this.artwork = artwork;
    }
    public String getSongTitle() {
        return songTitle;
    }
    public void setSongTitle(String songTitle) {
        this.songTitle = songTitle;
    }
    public String getSongGenre() {
        return songGenre;
    }
    public void setSongGenre(String songGenre) {
        this.songGenre = songGenre;
    }
    public int getSong() {
        return song;
    }
    public void setSong(int song) {
        this.song = song;
    }

}
