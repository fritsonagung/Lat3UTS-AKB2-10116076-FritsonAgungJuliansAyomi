package com.example.fritsonapps.presenter;

import com.example.fritsonapps.R;
import com.example.fritsonapps.model.FriendsListModel;
import com.example.fritsonapps.view.FriendsListView;


import java.util.ArrayList;
import java.util.List;

/*
 Nama : Fritson Agung Julians Ayomi
 NIM  : 10116076
 Kelas: AKB-2
 Tanggal Pengerjaan : 24 April 2019
 */

public class FriendsListPresenterImpl implements FriendsListPresenter{

    private FriendsListView friendsListView;

    private List<FriendsListModel> pictures = new ArrayList<>();

    public FriendsListPresenterImpl(FriendsListView friendsListView) {
        this.friendsListView = friendsListView;
        setData();
    }

    private void setData() {
        FriendsListModel picture = new FriendsListModel();
        picture.setPicture(R.drawable.friends_1);
        picture.setFriendsName("Andi Moh. Rizky");
        pictures.add(picture);

        FriendsListModel picture1 = new FriendsListModel();
        picture1.setPicture(R.drawable.friends_2);
        picture1.setFriendsName("Prabowo Adi Perwira");
        pictures.add(picture1);

        FriendsListModel picture2 = new FriendsListModel();
        picture2.setPicture(R.drawable.friends_3);
        picture2.setFriendsName("Aditya Maulana R");
        pictures.add(picture2);

        FriendsListModel picture3 = new FriendsListModel();
        picture3.setPicture(R.drawable.friends_4);
        picture3.setFriendsName("Muh. Rizky Fauzan");
        pictures.add(picture3);

        FriendsListModel picture4 = new FriendsListModel();
        picture4.setPicture(R.drawable.friends_5);
        picture4.setFriendsName("Hangga Adi P");
        pictures.add(picture4);

        FriendsListModel picture5 = new FriendsListModel();
        picture5.setPicture(R.drawable.friends_6);
        picture5.setFriendsName("Muh. Idris K");
        pictures.add(picture5);

    }

    @Override
    public void load() {
        friendsListView.onLoad(pictures);
    }

}
