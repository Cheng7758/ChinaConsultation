package com.example.chinaconsultation.adapter;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by 爸爸 on 2019/12/29.
 */

public class TwoTabadapter extends FragmentPagerAdapter {
    private ArrayList<Fragment> mFragments;
    private ArrayList<String> mList;

    public TwoTabadapter(FragmentManager fm, ArrayList<Fragment> fragments, ArrayList<String> list) {
        super(fm);
        mFragments = fragments;
        mList = list;
    }

    @Override
    public Fragment getItem(int position) {
        return mFragments.get(position);
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mList.get(position);
    }
}
