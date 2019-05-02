package com.example.fritsonapps.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class HomePagerAdapter extends FragmentPagerAdapter {

private final List<Fragment> lstFragment = new ArrayList<>();
private final List<String> lstTitle = new ArrayList<>();

    public HomePagerAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    @Override
    public Fragment getItem(int position) {
       return lstFragment.get(position);
    }

    @Override
    public int getCount() {
        return lstTitle.size();
    }

    public CharSequence getPageTitle(int position){
        return lstTitle.get(position);
    }


    public void addFragment (Fragment fragment, String title){
        lstFragment.add(fragment);
        lstTitle.add(title);
    }


}
