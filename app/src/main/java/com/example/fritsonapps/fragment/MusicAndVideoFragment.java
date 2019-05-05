package com.example.fritsonapps.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fritsonapps.R;
import com.example.fritsonapps.adapter.SubMenuPagerAdapter;

/*
 Nama : Fritson Agung Julians Ayomi
 NIM  : 10116076
 Kelas: AKB-2
 Tanggal Pengerjaan : 03 Mei 2019
 */

public class MusicAndVideoFragment extends Fragment {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private SubMenuPagerAdapter adapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.music_and_video_fragment, container, false);

        viewPager = v.findViewById(R.id.music_and_video_view_pager);
        setupViewPager(viewPager);

        tabLayout = v.findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

        return v;
    }

    private void setupViewPager(ViewPager viewPager) {
        adapter = new SubMenuPagerAdapter(getChildFragmentManager());
        ((SubMenuPagerAdapter) adapter).addFragment(new MusicFavoriteFragment(), "Favorite Music");
        ((SubMenuPagerAdapter) adapter).addFragment(new VideoFavoriteFragment(), "Favorite Video");
        viewPager.setAdapter((PagerAdapter) adapter);
    }

}
