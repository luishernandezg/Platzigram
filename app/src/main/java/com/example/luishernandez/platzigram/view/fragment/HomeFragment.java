package com.example.luishernandez.platzigram.view.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.luishernandez.platzigram.R;
import com.example.luishernandez.platzigram.adapter.PictureAdapterRecyclerView;
import com.example.luishernandez.platzigram.model.Picture;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        RecyclerView picturesRecycler = (RecyclerView) view.findViewById(R.id.pictureRecycler);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        picturesRecycler.setLayoutManager(linearLayoutManager);

        PictureAdapterRecyclerView pictureAdapterRecyclerView = new PictureAdapterRecyclerView(
                buildPictures(),R.layout.cardview_picture,getActivity());

        picturesRecycler.setAdapter(pictureAdapterRecyclerView);
        return view;
    }

    public ArrayList<Picture> buildPictures(){
        ArrayList<Picture> pictures = new ArrayList<>();
        pictures.add(new Picture("Petra Perez"
                ,"https://static.iris.net.co/semana/upload/images/2016/12/23/510460_1.jpg"
                ,"4 dias", "3"));
        pictures.add(new Picture("Pedro Perez"
                ,"https://orientacion.universia.edu.pe/imgs2011/imagenes/shuttersto-2016_09_16_190709.jpg"
                ,"4 dias", "3"));
        pictures.add(new Picture("Lola Lala"
                ,"https://www.solosegurosmedicos.com/wp-content/uploads/2014/09/segurosmedicosprivados5.jpg"
                ,"4 dias", "3"));
        return pictures;
    }

}
