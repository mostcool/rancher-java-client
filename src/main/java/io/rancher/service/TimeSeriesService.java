package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.TimeSeries;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

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
    Call<ResponseBody> delete(@Path("id") String id);
}
