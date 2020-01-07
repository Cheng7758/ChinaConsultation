package com.example.chinaconsultation.activity;

import android.view.View;
import android.widget.ImageView;

import com.example.chinaconsultation.MVP.P.CommonPresenter;
import com.example.chinaconsultation.MVP.model.TestIModel;
import com.example.chinaconsultation.R;

/**
 * Created by 爸爸 on 2019/12/27.
 */

public class BianjiActivity extends BaseActivity implements View.OnClickListener {

    private ImageView mBianjiBreak;

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
        return R.layout.bianji_activity;
    }

    @Override
    protected void initView() {
        mBianjiBreak = findViewById(R.id.bianji_break);
        mBianjiBreak.setOnClickListener(this);
    }

    @Override
    protected void activityRunUi() {

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bianji_break:
                finish();
                break;
        }
    }
}
