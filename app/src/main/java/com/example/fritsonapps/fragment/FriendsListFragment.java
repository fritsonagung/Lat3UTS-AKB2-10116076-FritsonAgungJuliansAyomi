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
import com.example.fritsonapps.adapter.FriendsListAdapter;
import com.example.fritsonapps.model.FriendsListModel;
import com.example.fritsonapps.presenter.FriendsListPresenter;
import com.example.fritsonapps.presenter.FriendsListPresenterImpl;
import com.example.fritsonapps.view.FriendsListView;


import java.util.ArrayList;
import java.util.List;

public class FriendsListFragment extends Fragment implements FriendsListView {

    private View v;
    private RecyclerView recyclerFriendsList;
    private List<FriendsListModel> pictures = new ArrayList<>();
    private FriendsListAdapter friendsListAdapter;
    private FriendsListPresenter friendsListPresenter;
    private int numberOfRows = 4;
    private AppCompatDialog dialog;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.friends_list_fragment, container, false);

        friendsListPresenter = new FriendsListPresenterImpl(this);

        recyclerFriendsList = v.findViewById(R.id.recycler_view_friends);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(),numberOfRows , GridLayoutManager.VERTICAL, false);
        recyclerFriendsList.setLayoutManager(gridLayoutManager);

        friendsListAdapter = new FriendsListAdapter(pictures);

        recyclerFriendsList.setAdapter(friendsListAdapter);

        friendsListPresenter.load();

        friendsListAdapter.setOnCallbackListener(new FriendsListAdapter.OnCallbackListener() {
            @Override
            public void onClick (FriendsListModel picture){
                showDialog(picture);
            }
        });

        return v;
    }

    @Override
    public void onLoad(List<FriendsListModel> picture) {
        pictures.clear();
        pictures.addAll(picture);

        friendsListAdapter.notifyDataSetChanged();
    }


    public void showDialog(final FriendsListModel picture) {
        dialog = new AppCompatDialog(getActivity());
        dialog.setContentView(R.layout.friends_list_activity);

        final ImageView imageViewPicture = dialog.findViewById(R.id.friends_picture_dialog_image_view);
        final TextView textViewPicTitle = dialog.findViewById(R.id.friends_name_dialog_text);

        assert imageViewPicture != null;
        imageViewPicture.setImageResource(picture.getPicture());
        assert textViewPicTitle != null;
        textViewPicTitle.setText(picture.getFriendsName());

        if (!dialog.isShowing()) {
            dialog.show();
        }

    }
}
