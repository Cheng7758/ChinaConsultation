package com.example.chinaconsultation;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.chinaconsultation.MVP.P.CommonPresenter;
import com.example.chinaconsultation.MVP.model.TestIModel;
import com.example.chinaconsultation.activity.BaseActivity;
import com.example.chinaconsultation.fragment.Basefragment;
import com.example.chinaconsultation.fragment.OneFragment;
import com.example.chinaconsultation.fragment.TreeFragment;
import com.example.chinaconsultation.fragment.TwoFragment;

public class MainActivity extends BaseActivity implements RadioGroup.OnCheckedChangeListener {


    private LinearLayout mMainLinearlayout;
    /**
     * 首页
     */
    private RadioButton mMainRabOne;
    /**
     * 文库分类
     */
    private RadioButton mMainRabTwo;
    /**
     * 我的
     */
    private RadioButton mMainRabTree;
    private RadioGroup mMainRabGroup;

    @Override
    protected TestIModel getModel() {
        return null;
    }

    @Override
    protected CommonPresenter getPresenter() {
        return null;
    }

    @Override
    protected int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {

        mMainLinearlayout = (LinearLayout) findViewById(R.id.main_linearlayout);
        mMainRabOne = (RadioButton) findViewById(R.id.main_rab_one);
        mMainRabGroup = (RadioGroup) findViewById(R.id.main_rab_group);
        mMainRabTwo = (RadioButton) findViewById(R.id.main_rab_two);
        mMainRabTree = (RadioButton) findViewById(R.id.main_rab_tree);
        replacefragment(new OneFragment());
        mMainRabGroup.setOnCheckedChangeListener(this);
    }

    @Override
    protected void activityRunUi() {

    }


    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        switch (checkedId) {
            case R.id.main_rab_one:
//                getSupportFragmentManager().beginTransaction().replace(faultFragment).commit();
                replacefragment(new OneFragment());
                break;
            case R.id.main_rab_two:
                replacefragment(new TwoFragment());
                break;
            case R.id.main_rab_tree:
                replacefragment(new TreeFragment());
                break;
        }
    }

    private void replacefragment(Basefragment fragment) {
        getSupportFragmentManager().beginTransaction().replace(R.id.main_linearlayout, fragment).commit();
    }
}
