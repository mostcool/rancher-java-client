package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.TimeSeries;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface TimeSeriesService {

    @GET("timeSeries")
    Call<TypeCollection<TimeSeries>> list();

    @GET("timeSeries")
    Call<TypeCollection<TimeSeries>> list(@QueryMap Filters filters);

    @GET("timeSeries/{id}")
    Call<TimeSeries> get(@Path("id") String id);

    @POST("timeSeries")
    Call<TimeSeries> create(@Body TimeSeries timeSeries);

    @PUT("timeSeries/{id}")
    Call<TimeSeries> update(@Path("id") String id, @Body TimeSeries timeSeries);

    @DELETE("timeSeries/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
