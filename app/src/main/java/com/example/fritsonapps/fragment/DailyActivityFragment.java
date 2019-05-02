package com.example.fritsonapps.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fritsonapps.R;
import com.example.fritsonapps.adapter.DailyActivityAdapter;
import com.example.fritsonapps.adapter.SubMenuPagerAdapter;
import com.example.fritsonapps.model.DailyActivityModel;
import com.example.fritsonapps.presenter.DailyActivityPresenter;
import com.example.fritsonapps.presenter.DailyActivityPresenterImpl;
import com.example.fritsonapps.view.DailyActivityView;

import java.util.ArrayList;
import java.util.List;

/*
 Nama : Fritson Agung Julians Ayomi
 NIM  : 10116076
 Kelas: AKB-2
 Tanggal Pengerjaan : 01 Mei 2019
 */


public class DailyActivityFragment extends Fragment {

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
        View v = inflater.inflate(R.layout.daily_activity_fragment, container, false);

        viewPager = v.findViewById(R.id.daily_view_pager);
        setupViewPager(viewPager);

        tabLayout = v.findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

        return v;
    }

    private void setupViewPager(ViewPager viewPager) {
        adapter = new SubMenuPagerAdapter(getChildFragmentManager());
        ((SubMenuPagerAdapter) adapter).addFragment(new DailyActivitySubFragment(), "Daily Activity");
        ((SubMenuPagerAdapter) adapter).addFragment(new FriendsListFragment(), "Friends List");
        viewPager.setAdapter((PagerAdapter) adapter);
    }

}
