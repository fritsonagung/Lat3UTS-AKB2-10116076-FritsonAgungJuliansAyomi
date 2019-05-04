package com.example.fritsonapps.fragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.fritsonapps.R;


/*
 Nama : Fritson Agung Julians Ayomi
 NIM  : 10116076
 Kelas: AKB-2
 Tanggal Pengerjaan : 24 April 2019
 */

public class ContactFragment extends Fragment {
    View v;

    ImageView telp_icon, mail_icon, facebook_icon;
    TextView no_telp, email, facebook;
    CardView telp_card, email_card, facebook_card;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.contact_fragment, container, false);

        telp_icon = v.findViewById(R.id.icon_telp);
        no_telp = v.findViewById(R.id.no_telp_text);
        mail_icon = v.findViewById(R.id.icon_email);
        email = v.findViewById(R.id.email_text);
        facebook_icon = v.findViewById(R.id.icon_facebook);
        facebook = v.findViewById(R.id.facebook_text);

        telp_icon.setImageResource(R.drawable.ic_call);
        no_telp.setText("+6285145021717");
        mail_icon.setImageResource(R.drawable.ic_mail);
        email.setText("agungfritson@gmail.com");
        facebook_icon.setImageResource(R.drawable.ic_facebook);
        facebook.setText("Fritson Agung Julians Ayomi");

        telp_card = v.findViewById(R.id.notelpCard);
        email_card = v.findViewById(R.id.emailCard);
        facebook_card = v.findViewById(R.id.facebookCard);

        telp_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:085145021717"));
                startActivity(intent);
            }
        });

        email_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:agungfritson@gmail.com"));
                startActivity(intent);
            }
        });

        facebook_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("fb://profile/fritsonagung"));
                    startActivity(intent);
                } catch (Exception e) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/fritsonagung")));
                }
            }
        });


        return v;

    }
}
