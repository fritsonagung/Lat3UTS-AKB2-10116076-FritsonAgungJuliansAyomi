package com.example.fritsonapps.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.fritsonapps.R;

/*
 Nama : Fritson Agung Julians Ayomi
 NIM  : 10116076
 Kelas: AKB-2
 Tanggal Pengerjaan : 29 April 2019
 */

public class ProfileDescFragment extends Fragment {

    View v;
    TextView nama, jk, umur, gol_darah, desc_self;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.profile_desc_fragment,container,false);

        nama = v.findViewById(R.id.fullname);
        jk = v.findViewById(R.id.jenis_kelamin);
        umur = v.findViewById(R.id.umur);
        gol_darah = v.findViewById(R.id.gol_darah);
        desc_self = v.findViewById(R.id.desc_self);

        nama.setText("Fritson Agung Julians A");
        jk.setText("Jenis Kelamin : Laki-Laki ");
        umur.setText("Umur : 20 tahun ");
        gol_darah.setText("Gol Darah : O ");
        desc_self.setText("Saya adalah anak pertama dari 3 bersaudara. Lahir pada tanggal 28 Juli 1998 di Ujung Pandang, Sulawesi Selatan. " +
                "Saya berasal dari Kota Luwuk, Banggai, Sulawesi Tengah. Sekarang saya tinggal di Bandung bersama adik perempuan saya. " +
                "Sekarang saya sedang menempuh pendidikan di perguruan tinggi Universitas Komputer Indonesia, Jurusan Teknik Informatika.");

        return v;
    }
}
