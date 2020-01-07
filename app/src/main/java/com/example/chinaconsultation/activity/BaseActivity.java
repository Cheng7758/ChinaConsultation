package com.example.chinaconsultation.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


import com.example.chinaconsultation.MVP.P.CommonPresenter;
import com.example.chinaconsultation.MVP.model.TestIModel;
import com.example.chinaconsultation.utils.StatusBarManager;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by 爸爸 on 2019/4/1.
 */

public abstract class BaseActivity extends AppCompatActivity {

    private Unbinder mBind;
    public CommonPresenter mPresenter;
    public TestIModel mModel;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayout());
        mBind = ButterKnife.bind(this);
        mPresenter = getPresenter();
        mModel = getModel();
        initView();
        activityRunUi();
    }

    protected abstract TestIModel getModel();

    protected abstract CommonPresenter getPresenter();

    protected abstract int getLayout();

    protected abstract void initView();

    protected abstract void activityRunUi();
    public void setStatusBarColor(int color) {
        StatusBarManager.setStatusBarColor(this,color);
//        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
//        StatusBarManager.translucentStatusBarAndImmersive(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mBind.unbind();
        if (mPresenter!=null){
            mPresenter.deach();
            mPresenter=null;
        }
    }
}
