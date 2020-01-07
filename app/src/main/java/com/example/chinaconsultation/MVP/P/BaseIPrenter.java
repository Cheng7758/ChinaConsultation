package com.example.chinaconsultation.MVP.P;


import com.example.chinaconsultation.MVP.M.IModel;
import com.example.chinaconsultation.MVP.V.IView;

import java.lang.ref.WeakReference;

/**
 * Created by 爸爸 on 2019/4/1.
 */

public class BaseIPrenter<V extends IView, M extends IModel> {
    private WeakReference<V> view;
    private WeakReference<M> model;

    public void attach(V view, M model) {
        this.view = new WeakReference<V>(view);
        this.model = new WeakReference<M>(model);
    }

    public void deach() {
        if (view != null) {
            view.clear();
            this.view = null;
        }
        if (model != null) {
            model.clear();
            this.model = null;
        }
    }

    public V getView() {
        return view != null ? view.get() : null;
    }

    public M getModel() {
        return model != null ? model.get() : null;
    }

}
