package com.example.chinaconsultation.MVP.P;

/**
 * Created by 爸爸 on 2019/3/31.
 */

public interface IPrenter<T> {
    void getData(int whichApi, T... t);
}
