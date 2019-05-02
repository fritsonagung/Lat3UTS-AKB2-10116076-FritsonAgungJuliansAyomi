package com.example.fritsonapps.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.fritsonapps.R;
import com.example.fritsonapps.model.GalleryModel;

import java.util.List;

public class GalleryAdapter extends RecyclerView.Adapter<GalleryAdapter.ViewHolder> {

    private List<GalleryModel> pictures;
    private OnCallbackListener listener;


    public GalleryAdapter(List<GalleryModel> pictures) {
        this.pictures = pictures;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.gallery_grid_view_list, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        GalleryModel picture = pictures.get(position);
        holder.imageViewPicture.setImageResource(picture.getPicture());
        holder.textViewPicTitle.setText(picture.getPicTitle());
    }

    @Override
    public int getItemCount() {
        return pictures.size();
    }

    public void setOnCallbackListener(OnCallbackListener listener) {
        this.listener = listener;
    }

    class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        ImageView imageViewPicture;
        TextView textViewPicTitle;

        public ViewHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);

            imageViewPicture = itemView.findViewById(R.id.image_view_gallery);
            textViewPicTitle = itemView.findViewById(R.id.gallery_pict_title_text);
        }

        @Override
        public void onClick(View v) {
            if (listener != null) {
                listener.onClick(pictures.get(getAdapterPosition()));
            }
        }
    }

    public interface OnCallbackListener {

        void onClick(GalleryModel clicks);
    }
}
