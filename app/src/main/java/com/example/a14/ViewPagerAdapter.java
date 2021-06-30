package com.example.a14;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.a14.fragments.FirstFragment;
import com.example.a14.fragments.SecondFragment;
import com.example.a14.fragments.ThirdFragment;

import java.util.ArrayList;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {


    public ViewPagerAdapter(FragmentManager fm , int behavior){
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0 :{
                return new FirstFragment();
            }
            case 1 : {
                return new SecondFragment();
            }
            case 2 : {
                return new ThirdFragment();
            }
        }
        return new FirstFragment();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0 : {
                return "TITLES";
            }
            case 1 : {
                return "NUMBERS";
            }
            case 2 : {
                return "IMAGES";
            }
        }
        return super.getPageTitle(position);
    }

    @Override
    public int getCount() {
        return 3;
    }
}
