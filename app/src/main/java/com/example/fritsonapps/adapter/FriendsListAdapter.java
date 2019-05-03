package com.example.fritsonapps.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.fritsonapps.R;
import com.example.fritsonapps.model.FriendsListModel;

import java.util.List;


/*
 Nama : Fritson Agung Julians Ayomi
 NIM  : 10116076
 Kelas: AKB-2
 Tanggal Pengerjaan : 02 Mei 2019
 */

public class FriendsListAdapter extends RecyclerView.Adapter<FriendsListAdapter.ViewHolder> {

    private static List<FriendsListModel> pictures;
    private static FriendsListAdapter.OnCallbackListener listener;


    public FriendsListAdapter(List<FriendsListModel> pictures) {
        this.pictures = pictures;
    }

    @NonNull
    @Override
    public FriendsListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new FriendsListAdapter.ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.friends_list_grid_view_list, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull FriendsListAdapter.ViewHolder holder, int position) {
        FriendsListModel picture = pictures.get(position);
        holder.imageViewPicture.setImageResource(picture.getPicture());
        holder.textViewFriendsName.setText(picture.getFriendsName());
    }

    @Override
    public int getItemCount() {
        return pictures.size();
    }

    public void setOnCallbackListener(FriendsListAdapter.OnCallbackListener listener) {
        this.listener = listener;
    }

    static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        ImageView imageViewPicture;
        TextView textViewFriendsName;

        public ViewHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);

            imageViewPicture = itemView.findViewById(R.id.image_view_friends);
            textViewFriendsName = itemView.findViewById(R.id.friends_text_view);
        }

        @Override
        public void onClick(View v) {
            if (listener != null) {
                listener.onClick(pictures.get(getAdapterPosition()));
            }
        }
    }

    public interface OnCallbackListener {

        void onClick(FriendsListModel user);
    }

}
