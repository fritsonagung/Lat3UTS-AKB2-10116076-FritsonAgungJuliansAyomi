package com.example.fritsonapps.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.fritsonapps.R;

/*
 Nama : Fritson Agung Julians Ayomi
 NIM  : 10116076
 Kelas: AKB-2
 Tanggal Pengerjaan : 24 April 2019
 */

public class AboutFragment extends DialogFragment {

    View v;
    Button about_button;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.about_fragment, container, false);

        final FragmentManager fm = getFragmentManager();
        final AboutDialogFragment dialogFragment = new AboutDialogFragment();

        about_button = (Button) v.findViewById(R.id.about_button);
        about_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogFragment.show(fm,"About Dialog Fragment");

            }
        });

        return v;
    }
}
