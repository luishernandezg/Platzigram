package com.example.luishernandez.platzigram.adapter;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.luishernandez.platzigram.R;
import com.example.luishernandez.platzigram.model.Picture;

import java.util.ArrayList;

/**
 * Created by luis on 02/01/2018.
 */

public class PictureAdapterRecyclerView extends RecyclerView.Adapter<PictureAdapterRecyclerView.PictureViewHolder>{

    private ArrayList<Picture> pictures;
    private  int resource;
    private Activity activity;

    public PictureAdapterRecyclerView(ArrayList<Picture> pictures, int resource, Activity activity) {
        this.pictures = pictures;
        this.resource = resource;
        this.activity = activity;
    }

    @Override
    public PictureViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(resource,parent,false);
        return new PictureViewHolder(view);
    }

    @Override
    public void onBindViewHolder(PictureViewHolder holder, int position) {
        Picture picture = pictures.get(position);
        holder.userNameCard.setText(picture.getUserName());
        holder.likeNumberCard.setText(picture.getLikeNumber());
        holder.timeCard.setText(picture.getTime());
    }

    @Override
    public int getItemCount() {
        return pictures.size();
    }

    class PictureViewHolder extends RecyclerView.ViewHolder{

        private ImageView pictureCard;
        private TextView  userNameCard;
        private TextView  timeCard;
        private TextView  likeNumberCard;


        public PictureViewHolder(View itemView) {
            super(itemView);

            pictureCard    = (ImageView) itemView.findViewById(R.id.pictureCard);
            userNameCard   = (TextView)  itemView.findViewById(R.id.username_card);
            timeCard       = (TextView)  itemView.findViewById(R.id.dateCard);
            likeNumberCard = (TextView)  itemView.findViewById(R.id.likeNumberCard);

        }


    }
}
