package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.FsGroupStrategyOptions;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface FsGroupStrategyOptionsService {

    @GET("fsGroupStrategyOptions")
    Call<TypeCollection<FsGroupStrategyOptions>> list();

    @GET("fsGroupStrategyOptions")
    Call<TypeCollection<FsGroupStrategyOptions>> list(@QueryMap Filters filters);

    @GET("fsGroupStrategyOptions/{id}")
    Call<FsGroupStrategyOptions> get(@Path("id") String id);

    @POST("fsGroupStrategyOptions")
    Call<FsGroupStrategyOptions> create(@Body FsGroupStrategyOptions fsGroupStrategyOptions);

    @PUT("fsGroupStrategyOptions/{id}")
    Call<FsGroupStrategyOptions> update(@Path("id") String id, @Body FsGroupStrategyOptions fsGroupStrategyOptions);

    @DELETE("fsGroupStrategyOptions/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
