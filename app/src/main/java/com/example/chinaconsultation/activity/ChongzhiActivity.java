package com.example.chinaconsultation.activity;

import android.view.View;
import android.widget.ImageView;

import com.example.chinaconsultation.MVP.P.CommonPresenter;
import com.example.chinaconsultation.MVP.model.TestIModel;
import com.example.chinaconsultation.R;

/**
 * Created by 爸爸 on 2019/12/29.
 */

public class ChongzhiActivity extends BaseActivity implements View.OnClickListener {

    private ImageView mChongzhiBreak;

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
        return R.layout.chongzhi_activity;
    }

    @Override
    protected void initView() {
        mChongzhiBreak = findViewById(R.id.chongzhi_break);
        mChongzhiBreak.setOnClickListener(this);
    }

    @Override
    protected void activityRunUi() {

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.chongzhi_break:
                finish();
                break;
        }
    }
}
