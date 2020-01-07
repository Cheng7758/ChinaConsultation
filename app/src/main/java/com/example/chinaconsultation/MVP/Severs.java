package com.example.chinaconsultation.MVP;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Url;

/**
 * Created by 爸爸 on 2019/4/1.
 */

public interface Severs {


    @GET
    Observable<String> getFrsterUrl(@Url String url);
//    @GET
//    Observable<String> getZhiBannerUrl(@Url String url);
//  @GET
//    Observable<String> getZhiBoUrl(@Url String url);
//  @GET
//    Observable<String> getZhANLanbannerUrl(@Url String url);
//  @GET
//    Observable<String> getZhANLanRvUrl(@Url String url);
//  @GET
//    Observable<String> getKeChengBannerUrl(@Url String url);
}
