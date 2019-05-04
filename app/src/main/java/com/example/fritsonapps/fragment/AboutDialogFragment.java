package com.example.fritsonapps.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
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

public class AboutDialogFragment extends DialogFragment {

    View v;
    Button ok_button;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.custom_dialog_about, container, false);

        getDialog().setTitle("About Application");

        ok_button = (Button) v.findViewById(R.id.dialog_button_ok);
        ok_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });

        return v;

    }

}
