package com.example.fritsonapps;

import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.annotation.NonNull;
import android.view.MenuItem;

import com.example.fritsonapps.fragment.DailyActivityFragment;
import com.example.fritsonapps.fragment.GalleryFragment;
import com.example.fritsonapps.fragment.HomeFragment;
import com.example.fritsonapps.fragment.MusicAndVideoFragment;
import com.example.fritsonapps.fragment.ProfileFragment;

/*
 Nama : Fritson Agung Julians Ayomi
 NIM  : 10116076
 Kelas: AKB-2
 Tanggal Pengerjaan : 24 April 2019
 */

public class BottomNavigation extends AppCompatActivity
        implements BottomNavigationView.OnNavigationItemSelectedListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_navigation);

        BottomNavigationView navView = findViewById(R.id.nav_view);
        navView.setOnNavigationItemSelectedListener(this);

        loadFragment(new HomeFragment());
    }

    private boolean loadFragment(Fragment fragment) {
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, fragment).commit();

            return true;
        }
        return false;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

        Fragment fragment = null;

        switch (menuItem.getItemId()) {
            case R.id.navigation_Home:
                fragment = new HomeFragment();
                break;
            case R.id.navigation_DailyActivity:
                fragment = new DailyActivityFragment();
                break;
            case R.id.navigation_Gallery:
                fragment = new GalleryFragment();
                break;
            case R.id.navigation_MusicAndVideo:
                fragment = new MusicAndVideoFragment();
                break;
            case R.id.navigation_Profile:
                fragment = new ProfileFragment();
                break;
        }

        return loadFragment(fragment);
    }
}
