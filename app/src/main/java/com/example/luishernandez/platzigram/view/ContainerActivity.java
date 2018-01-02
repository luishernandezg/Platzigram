package com.example.luishernandez.platzigram.view;

import android.net.Uri;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.example.luishernandez.platzigram.R;
import com.example.luishernandez.platzigram.view.fragment.HomeFragment;
import com.example.luishernandez.platzigram.view.fragment.ProfileFragment;
import com.example.luishernandez.platzigram.view.fragment.SearchFragment;

public class ContainerActivity extends AppCompatActivity {

    private  static final String TAG ="ContainerActivity";
    private SectionsPageAdapter mSectionsPageAdapter;
    private ViewPager mViewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_container);
        setToolbarTab();

        mSectionsPageAdapter = new SectionsPageAdapter(getSupportFragmentManager());

        mViewPager = (ViewPager) findViewById(R.id.pager);
        setupViewPager(mViewPager);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);

    }

    public void setToolbarTab(){

        Toolbar toolbarTab = (Toolbar) findViewById(R.id.toolbarTab);
        setSupportActionBar(toolbarTab);
        getSupportActionBar().setTitle("ConsulMed");

    }

    public void setupViewPager(ViewPager viewPager){
        SectionsPageAdapter adapter = new SectionsPageAdapter(getSupportFragmentManager());
        adapter.addFragment(new HomeFragment(),"Home");
        adapter.addFragment(new ProfileFragment(),"Profile");
        adapter.addFragment(new SearchFragment(),"Search");
        viewPager.setAdapter(adapter);
    }


}
