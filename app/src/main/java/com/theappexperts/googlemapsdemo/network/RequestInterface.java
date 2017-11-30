package com.theappexperts.googlemapsdemo.network;

import com.theappexperts.googlemapsdemo.network.restaurantspojo.Example;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

/**
 * Created by TheAppExperts on 29/11/2017.
 */

public interface RequestInterface {

    @Headers({
            ApiConstants.HEADER1,
            ApiConstants.HEADER2,
            ApiConstants.HEADER3,
            ApiConstants.HEADER4
    })
    @GET(ApiConstants.RESTAURANTS)
    Observable<Example> getList(@Query("q") String postcode);
}
