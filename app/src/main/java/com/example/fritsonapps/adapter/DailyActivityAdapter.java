package com.example.fritsonapps.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.fritsonapps.model.DailyActivityModel;
import com.example.fritsonapps.R;

import java.util.List;

/*
 Nama : Fritson Agung Julians Ayomi
 NIM  : 10116076
 Kelas: AKB-2
 Tanggal Pengerjaan : 29 April 2019
 */

public class DailyActivityAdapter extends RecyclerView.Adapter<DailyActivityAdapter.ViewHolder> {


    private List<DailyActivityModel> activities;

    public DailyActivityAdapter(List<DailyActivityModel> activities) {
        this.activities = activities;
    }

    @NonNull
    @Override
    public DailyActivityAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.daily_activity_view_list, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull DailyActivityAdapter.ViewHolder holder, int position) {
        DailyActivityModel activity = activities.get(position);
        holder.imageViewIcon.setImageResource(activity.getIcon());
        holder.textViewNama.setText(activity.getNamaActivity());
        holder.textViewWaktu.setText(activity.getWaktuActivity());
    }


    @Override
    public int getItemCount() {
        return activities.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageViewIcon;
        private TextView textViewNama;
        private TextView textViewWaktu;

        public ViewHolder(View ItemView) {
            super(ItemView);

            imageViewIcon = (ImageView) ItemView.findViewById(R.id.icon_activity_image_view);
            textViewNama = (TextView) ItemView.findViewById(R.id.name_activity_text);
            textViewWaktu = (TextView) ItemView.findViewById(R.id.time_activity_text);

        }
    }

}
