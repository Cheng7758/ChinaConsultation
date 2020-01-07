package com.example.chinaconsultation.fragment;

import android.view.View;

import com.example.chinaconsultation.MVP.M.IModel;
import com.example.chinaconsultation.MVP.P.CommonPresenter;
import com.example.chinaconsultation.R;

/**
 * Created by 爸爸 on 2019/12/29.
 */

public class TuiJianfragment extends Basefragment {
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

    }

    @Override
    protected int getfragment() {
        return R.layout.tuijian_fragment;
    }
}
