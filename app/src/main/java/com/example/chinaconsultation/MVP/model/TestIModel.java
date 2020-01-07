package com.example.chinaconsultation.MVP.model;


import com.example.chinaconsultation.MVP.M.IModel;
import com.example.chinaconsultation.MVP.M.Manger;
import com.example.chinaconsultation.MVP.V.IView;

import io.reactivex.Observable;

/**
 * Created by 爸爸 on 2019/4/1.
 */

public class TestIModel implements IModel {

    private int mI;
    private String mURL;
    private Observable<String> mUrl;

    @Override
    public void getData(IView view, int whichApi, Object[] t) {
//        switch (whichApi) {
//            case Apiconfig.TESTAPI_1:
                mI = (int) t[0];
                mURL = (String) t[1];
//                Log.i("tag", "getData: ====="+URL);
                mUrl = Manger.getManger().getSever().getFrsterUrl(mURL);
                Manger.getManger().netMethod(mUrl, view, whichApi, mI);
//                break;
//            case Apiconfig.TESTAPI_2:
//                mI = (int) t[0];
//                mURL = (String) t[1];
//                mUrl = Manger.getManger().getSever().getZhiBannerUrl(mURL);
//                Manger.getManger().netMethod(mUrl, view, whichApi, mI);
//                break;
//            case Apiconfig.TESTAPI_3:
//                mI = (int) t[0];
//                mURL = (String) t[1];
//                mUrl = Manger.getManger().getSever().getZhiBoUrl(mURL);
//                Manger.getManger().netMethod(mUrl, view, whichApi, mI);
//                break;
//            case Apiconfig.TESTAPI_4:
//                mI = (int) t[0];
//                mURL = (String) t[1];
//                mUrl = Manger.getManger().getSever().getZhANLanbannerUrl(mURL);
//                Manger.getManger().netMethod(mUrl, view, whichApi, mI);
//                break;
//            case Apiconfig.TESTAPI_5:
//                mI = (int) t[0];
//                mURL = (String) t[1];
//                mUrl = Manger.getManger().getSever().getZhANLanRvUrl(mURL);
//                Manger.getManger().netMethod(mUrl, view, whichApi, mI);
//                break;
//            case Apiconfig.TESTAPI_6:
//                mI = (int) t[0];
//                mURL = (String) t[1];
//                mUrl = Manger.getManger().getSever().getKeChengBannerUrl(mURL);
//                Manger.getManger().netMethod(mUrl, view, whichApi, mI);
//                break;
//         case Apiconfig.TESTAPI_7:
//                mI = (int) t[0];
//                mURL = (String) t[1];
//             mUrl = Manger.getManger().getSever().getKeChengBannerUrl(mURL);
//                Manger.getManger().netMethod(mUrl, view, whichApi, mI);
//                break;
//        }
    }
}
