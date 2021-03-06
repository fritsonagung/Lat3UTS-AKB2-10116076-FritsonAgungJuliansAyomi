package com.example.fritsonapps.presenter;

import com.example.fritsonapps.R;
import com.example.fritsonapps.model.GalleryModel;
import com.example.fritsonapps.view.GalleryView;

import java.util.ArrayList;
import java.util.List;

/*
 Nama : Fritson Agung Julians Ayomi
 NIM  : 10116076
 Kelas: AKB-2
 Tanggal Pengerjaan : 29 April 2019
 */

public class GalleryPresenterImpl implements GalleryPresenter{

    private GalleryView galleryView;

    private List<GalleryModel> pictures = new ArrayList<>();

    public GalleryPresenterImpl(GalleryView galleryView) {
        this.galleryView = galleryView;
        setData();
    }

    private void setData() {
        GalleryModel picture = new GalleryModel();
        picture.setPicture(R.drawable.gallery_1);
        picture.setPicTitle("Foto Diri");
        pictures.add(picture);

        GalleryModel picture1 = new GalleryModel();
        picture1.setPicture(R.drawable.gallery_2);
        picture1.setPicTitle("Jalan - jalan 1");
        pictures.add(picture1);

        GalleryModel picture2 = new GalleryModel();
        picture2.setPicture(R.drawable.gallery_3);
        picture2.setPicTitle("Jalan - jalan 2");
        pictures.add(picture2);

        GalleryModel picture3 = new GalleryModel();
        picture3.setPicture(R.drawable.gallery_4);
        picture3.setPicTitle("Pas Foto");
        pictures.add(picture3);

        GalleryModel picture4 = new GalleryModel();
        picture4.setPicture(R.drawable.gallery_5);
        picture4.setPicTitle("Foto Keluarga 1");
        pictures.add(picture4);

        GalleryModel picture5 = new GalleryModel();
        picture5.setPicture(R.drawable.gallery_6);
        picture5.setPicTitle("Foto Keluarga 2");
        pictures.add(picture5);

    }

    @Override
    public void load() {
        galleryView.onLoad(pictures);
    }

}
