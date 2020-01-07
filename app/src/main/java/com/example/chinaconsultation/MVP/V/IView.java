package com.example.chinaconsultation.MVP.V;

/**
 * Created by 爸爸 on 2019/3/31.
 */

public interface IView<T> {
    void onSuccess(int whichApi, T... t);
    void onError(Throwable e);
}
