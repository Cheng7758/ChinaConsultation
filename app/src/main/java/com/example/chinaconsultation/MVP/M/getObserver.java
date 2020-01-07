package com.example.chinaconsultation.MVP.M;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/**
 * Created by 爸爸 on 2019/4/1.
 */

public abstract class getObserver implements Observer {
    @Override
    public void onSubscribe(Disposable d) {

    }

    @Override
    public void onNext(Object value) {
    onNexter(value);
    }

    protected abstract void onNexter(Object value);

    @Override
    public void onError(Throwable e) {
    onErrorer(e);
    }

    protected abstract void onErrorer(Throwable e);

    @Override
    public void onComplete() {

    }
}
