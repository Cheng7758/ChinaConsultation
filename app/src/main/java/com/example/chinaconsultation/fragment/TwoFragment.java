package com.example.chinaconsultation.fragment;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.View;

import com.example.chinaconsultation.MVP.M.IModel;
import com.example.chinaconsultation.MVP.P.CommonPresenter;
import com.example.chinaconsultation.R;
import com.example.chinaconsultation.adapter.TwoTabadapter;

import java.util.ArrayList;

/**
 * Created by 爸爸 on 2019/12/27.
 */

public class TwoFragment extends Basefragment {

    private TabLayout mTwoTablayout;
    private ViewPager mTwoViewpager;

    @Override
    protected IModel getModel() {
        return null;
    }

    @Override
    protected CommonPresenter getPresenter() {
        return null;
    }

    @Override
    protected void intoView(View view) {
        mTwoTablayout = view.findViewById(R.id.two_tablayout);
        mTwoViewpager = view.findViewById(R.id.two_viewpager);
        ArrayList<String> list = new ArrayList<>();

        list.add("推荐");
        list.add("制度必读");
        list.add("制度治理");
        list.add("制度创新");
        list.add("视频讲座");
        ArrayList<Fragment> fragments = new ArrayList<>();
        fragments.add(new TuiJianfragment());
        fragments.add(new TuiJianfragment());
        fragments.add(new TuiJianfragment());
        fragments.add(new TuiJianfragment());
        fragments.add(new TuiJianfragment());
        TwoTabadapter twoTabadapter = new TwoTabadapter(getFragmentManager(), fragments, list);
        mTwoViewpager.setAdapter(twoTabadapter);
        mTwoTablayout.setupWithViewPager(mTwoViewpager);
    }

    @Override
    protected int getfragment() {
        return R.layout.two_fragment;
    }
}
