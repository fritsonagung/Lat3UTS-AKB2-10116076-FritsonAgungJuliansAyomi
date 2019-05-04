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
 Tanggal Pengerjaan : 24 April 2019
 */

public class ProfileFragment extends Fragment {
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
        View v = inflater.inflate(R.layout.profile_fragment, container, false);

        viewPager = v.findViewById(R.id.profile_view_pager);
        setupViewPager(viewPager);

        tabLayout = v.findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

        return v;
    }

    private void setupViewPager(ViewPager viewPager) {
        adapter = new SubMenuPagerAdapter(getChildFragmentManager());
        ((SubMenuPagerAdapter) adapter).addFragment(new ProfileDescFragment(), "Profile");
        ((SubMenuPagerAdapter) adapter).addFragment(new ContactFragment(), "Contact");
        ((SubMenuPagerAdapter) adapter).addFragment(new FindMeFragment(), "Find Me");
        ((SubMenuPagerAdapter) adapter).addFragment(new AboutFragment(), "About");
        viewPager.setAdapter((PagerAdapter) adapter);
    }
}
