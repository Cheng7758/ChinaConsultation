package com.example.chinaconsultation.MVP.P;

import android.util.Log;

import com.example.chinaconsultation.MVP.V.IView;


/**
 * Created by 爸爸 on 2019/4/1.
 */

public class CommonPresenter extends BaseIPrenter implements IPrenter,IView {
    @Override
    public void getData(int whichApi, Object... t) {
    if (getModel()!=null){
        getModel().getData(this,whichApi,t);
    }else {
        Log.e("net error","found error when excute netWork to used getModel():"+whichApi);
    }
    }

    @Override
    public void onSuccess(int whichApi, Object[] t) {
    if (getView()!=null){
        getView().onSuccess(whichApi,t);
    }else {
        Log.e("onResponse error","getView() found error when onResponse :"+whichApi);
    }
    }

    @Override
    public void onError(Throwable e) {
    getView().onError(e);
    }


}
