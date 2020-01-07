package com.example.chinaconsultation.MVP.M;


import com.example.chinaconsultation.MVP.Severs;
import com.example.chinaconsultation.MVP.V.IView;
import com.example.chinaconsultation.config.NetConfig;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

/**
 * Created by 爸爸 on 2019/4/1.
 */

public class Manger {
    public static Manger sManger;

    public Manger() {
    }

    public static Manger getManger() {
        if (sManger == null) {
            synchronized (Manger.class) {
                if (sManger == null) {
                    sManger = new Manger();
                }
            }
        }
        return sManger;
    }

    public Severs getSever() {
        return new Retrofit.Builder()
                .baseUrl(NetConfig.BASEURL)
                .addConverterFactory(ScalarsConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(NetInterceptor.getNetInterceptor().getClientWithoutCache())
                .build()
                .create(Severs.class);
    }

    public <T> void netMethod(Observable<T> observable, final IView view, final int whichApi, final int p) {
        observable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new getObserver() {
                    @Override
                    protected void onNexter(Object value) {
                        view.onSuccess(whichApi, value, p);
                    }

                    @Override
                    protected void onErrorer(Throwable e) {
                        view.onError(e);
                    }
                });

    }


}
