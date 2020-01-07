package com.example.chinaconsultation.fragment;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.chinaconsultation.MVP.M.IModel;
import com.example.chinaconsultation.MVP.P.CommonPresenter;
import com.example.chinaconsultation.MVP.V.IView;
import com.example.chinaconsultation.MVP.model.TestIModel;
import com.example.chinaconsultation.R;
import com.example.chinaconsultation.bean.ShouYeLanMuBean;
import com.example.chinaconsultation.config.Apiconfig;
import com.example.chinaconsultation.config.NetConfig;
import com.example.chinaconsultation.config.contents;
import com.google.gson.Gson;
import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;
import com.youth.banner.loader.ImageLoader;

import java.time.Instant;
import java.util.ArrayList;

/**
 * Created by 爸爸 on 2019/12/27.
 */

public class OneFragment extends Basefragment implements IView {

    private Banner mOneBanner;

    @Override
    protected IModel getModel() {
        return new TestIModel();
    }

    @Override
    protected CommonPresenter getPresenter() {
        return new CommonPresenter();
    }

    @Override
    protected void intoView(View view) {
        mOneBanner = view.findViewById(R.id.one_banner);
        ArrayList<Integer> list_path = new ArrayList<>();
        list_path.add(R.drawable.bannner);
        list_path.add(R.drawable.bannner);
        list_path.add(R.drawable.bannner);
        list_path.add(R.drawable.bannner);
        mOneBanner.setBannerStyle(BannerConfig.CIRCLE_INDICATOR);
        mOneBanner.setImages(list_path);
        mOneBanner.setImageLoader(new ImageLoader() {
            @Override
            public void displayImage(Context context, Object path, ImageView imageView) {
                Glide.with(context).load(path).into(imageView);
            }
        }).setDelayTime(3000).isAutoPlay(true).setIndicatorGravity(BannerConfig.CENTER).start();
        mPresenter.attach(this, getModel());
        mPresenter.getData(Apiconfig.SHOUYELANMU, Apiconfig.SHOUYELANMU, contents.SHOUYELANMUURL);
    }

    @Override
    protected int getfragment() {
        return R.layout.one_fragment;
    }

    @Override
    public void onSuccess(int whichApi, Object[] t) {
        String o = (String) t[0];
        int i = (int) t[1];
        Gson gson = new Gson();
        switch (i) {
    case Apiconfig.SHOUYELANMU:
        ShouYeLanMuBean   shouyeLanMubean = gson.fromJson(o, ShouYeLanMuBean.class);  
//        Toast.makeText(getContext(),shouyeLanMubean.getData().get(0).getTitle(),Toast.LENGTH_SHORT).show();
            break;
        }
    }

    @Override
    public void onError(Throwable e) {

    }
}

