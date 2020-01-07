package com.example.chinaconsultation.MVP.M;


import com.example.chinaconsultation.MVP.V.IView;

/**
 * Created by 爸爸 on 2019/3/31.
 */

public interface IModel<T> {
    void getData(IView view, int whichApi, T... t);
}
