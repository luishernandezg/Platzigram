package com.example.luishernandez.platzigram.view;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.luishernandez.platzigram.view.fragment.HomeFragment;
import com.example.luishernandez.platzigram.view.fragment.ProfileFragment;
import com.example.luishernandez.platzigram.view.fragment.SearchFragment;
import com.example.luishernandez.platzigram.view.fragment.TabFamiliares;
import com.example.luishernandez.platzigram.view.fragment.TabUsuario;

/**
 * Created by Luis Hernandez on 22/12/2017.
 */

public  class TabAdapter extends FragmentPagerAdapter {
    public TabAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position){

            case 1:
                 TabUsuario tabUsuario = new TabUsuario();
                return tabUsuario;
            case 2:
                TabFamiliares tabFamiliares = new TabFamiliares();
                return  tabFamiliares;

            default:
                return null;
        }


    }
}

