package com.example.fritsonapps.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatDialog;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.fritsonapps.R;
import com.example.fritsonapps.adapter.GalleryAdapter;
import com.example.fritsonapps.model.GalleryModel;
import com.example.fritsonapps.presenter.GalleryPresenter;
import com.example.fritsonapps.presenter.GalleryPresenterImpl;
import com.example.fritsonapps.view.GalleryView;


import java.util.ArrayList;
import java.util.List;

/*
 Nama : Fritson Agung Julians Ayomi
 NIM  : 10116076
 Kelas: AKB-2
 Tanggal Pengerjaan : 01 Mei 2019
 */

public class GalleryFragment extends Fragment implements GalleryView{

    private View v;
    private RecyclerView recyclerGallery;
    private List<GalleryModel> pictures = new ArrayList<>();
    private GalleryAdapter galleryAdapter;
    private GalleryPresenter galleryPresenter;
    private int numberOfColumns = 2;
    private AppCompatDialog dialog;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.gallery_fragment, container, false);

        galleryPresenter = new GalleryPresenterImpl(this);

        recyclerGallery = v.findViewById(R.id.recycler_view_gallery);
        recyclerGallery.setLayoutManager(new GridLayoutManager(getActivity(),numberOfColumns));

        galleryAdapter = new GalleryAdapter(pictures);

        recyclerGallery.setAdapter(galleryAdapter);

        galleryPresenter.load();

        galleryAdapter.setOnCallbackListener(new GalleryAdapter.OnCallbackListener() {
            @Override
            public void onClick(GalleryModel picture) {
                showDialog(picture);
            }
        });

        return v;
    }

    @Override
    public void onLoad(List<GalleryModel> picture) {
        pictures.clear();
        pictures.addAll(picture);

        galleryAdapter.notifyDataSetChanged();
    }


    public void showDialog(final GalleryModel picture) {
        dialog = new AppCompatDialog(getActivity());
        dialog.setContentView(R.layout.gallery_fragment_activity);

        final ImageView imageViewPicture = dialog.findViewById(R.id.picture_dialog_image_view);
        final TextView textViewPicTitle = dialog.findViewById(R.id.title_dialog_text);

        imageViewPicture.setImageResource(picture.getPicture());
        textViewPicTitle.setText(picture.getPicTitle());

        if (!dialog.isShowing()) {
            dialog.show();
        }

    }

}
