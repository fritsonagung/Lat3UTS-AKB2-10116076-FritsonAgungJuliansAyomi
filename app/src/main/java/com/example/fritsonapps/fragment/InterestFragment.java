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
 Tanggal Pengerjaan : 24 April 2019
 */

public class InterestFragment extends Fragment {

    View v;
    TextView interest, hobby, makes, mikes, cita_cita;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.interest_fragment, null);

        interest = v.findViewById(R.id.desc_interest);
        hobby = v.findViewById(R.id.desc_hobby);
        makes = v.findViewById(R.id.desc_makes);
        mikes = v.findViewById(R.id.desc_mikes);
        cita_cita = v.findViewById(R.id.desc_cita_cita);

        interest.setText("Interest : " +
                "Jaringan Komputer, Pengembangan UI/UX, & Pengembangan Video Game");
        hobby.setText("Hobby : " +
                "Mendengarkan Musik, Bermain Game, & Membaca Komik");
        makes.setText("Makes : " +
                "Bakso, Nasi goreng, & Sop Ayam");
        mikes.setText("Mikes : " +
                "Es Teh Manis , Susu Kedelai, & Sprite");
        cita_cita.setText("Cita-Cita : " +
                "Ingin mengembangkan sebuah video game sendiri");


        return v;
    }
}
