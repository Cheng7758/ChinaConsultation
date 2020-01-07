package com.example.chinaconsultation.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.chinaconsultation.MVP.M.IModel;
import com.example.chinaconsultation.MVP.P.CommonPresenter;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by 爸爸 on 2019/3/31.
 */

public abstract class Basefragment extends Fragment {

    private Unbinder mBind;
    public CommonPresenter mPresenter;
    public IModel mModel;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(getfragment(), null);
        mBind = ButterKnife.bind(this, view);
        mPresenter = getPresenter();
        mModel = getModel();

        intoView(view);

        return view;
    }


    protected abstract IModel getModel();

    protected abstract CommonPresenter getPresenter();


    protected abstract void intoView(View view);

    protected abstract int getfragment();



    @Override
    public void onDestroyView() {
        super.onDestroyView();
        mBind.unbind();
        if (mPresenter!=null){
            mPresenter.deach();
            mPresenter=null;
        }
    }
}
