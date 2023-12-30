package com.example.bookshopapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;

public class mixHome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mix_home);
        ViewPager viewPager = findViewById(R.id.viewPager);
        TabLayout tabLayout = findViewById(R.id.tabLayout);
        MyPagerAdapter adapter = new MyPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new FragmentPage1(), "Page 1");
        adapter.addFragment(new FragmentPage2(), "Page 2");
        adapter.addFragment(new FragmentPage3(), "Page 3");
        viewPager.setAdapter(adapter);

        // Connect the ViewPager to the TabLayout
        tabLayout.setupWithViewPager(viewPager);
    }
}