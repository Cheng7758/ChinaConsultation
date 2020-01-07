package com.example.chinaconsultation.fragment;

import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.chinaconsultation.MVP.M.IModel;
import com.example.chinaconsultation.MVP.P.CommonPresenter;
import com.example.chinaconsultation.R;
import com.example.chinaconsultation.activity.BianjiActivity;
import com.example.chinaconsultation.activity.ChongZhiJiLuActivity;
import com.example.chinaconsultation.activity.ChongzhiActivity;
import com.example.chinaconsultation.activity.YiJianFanKuiActivity;

/**
 * Created by 爸爸 on 2019/12/27.
 */

public class TreeFragment extends Basefragment implements View.OnClickListener {

    private ImageView mMyBianji;
    private ImageView mChongzhi;
    private TextView mChongzhijilu;
    private LinearLayout mYijianfankui;

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
        mMyBianji = view.findViewById(R.id.my_bianji);
        mMyBianji.setOnClickListener(this);
        mChongzhi = view.findViewById(R.id.chongzhi);
        mChongzhi.setOnClickListener(this);
        mChongzhijilu = view.findViewById(R.id.chongzhijilu);
        mChongzhijilu.setOnClickListener(this);
        mYijianfankui = view.findViewById(R.id.yijianfankui);
        mYijianfankui.setOnClickListener(this);
    }

    @Override
    protected int getfragment() {
        return R.layout.tree_fragment;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.my_bianji:
                Intent intent = new Intent(getActivity(), BianjiActivity.class);
                startActivity(intent);
                break;
            case R.id.chongzhi:
                Intent intent2 = new Intent(getActivity(), ChongzhiActivity.class);
                startActivity(intent2);
                break;
            case R.id.chongzhijilu:
                Intent chongzhijiluintent = new Intent(getActivity(), ChongZhiJiLuActivity.class);
                startActivity(chongzhijiluintent);
                break;
            case R.id.yijianfankui:
                Intent yijianfankuiintent = new Intent(getActivity(), YiJianFanKuiActivity.class);
                startActivity(yijianfankuiintent);
                break;
        }
    }
}
