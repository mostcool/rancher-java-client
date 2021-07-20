package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.CisBenchmarkVersionInfo;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface CisBenchmarkVersionInfoService {

    @GET("cisBenchmarkVersionInfo")
    Call<TypeCollection<CisBenchmarkVersionInfo>> list();

    @GET("cisBenchmarkVersionInfo")
    Call<TypeCollection<CisBenchmarkVersionInfo>> list(@QueryMap Filters filters);

    @GET("cisBenchmarkVersionInfo/{id}")
    Call<CisBenchmarkVersionInfo> get(@Path("id") String id);

    @POST("cisBenchmarkVersionInfo")
    Call<CisBenchmarkVersionInfo> create(@Body CisBenchmarkVersionInfo cisBenchmarkVersionInfo);

    @PUT("cisBenchmarkVersionInfo/{id}")
    Call<CisBenchmarkVersionInfo> update(@Path("id") String id, @Body CisBenchmarkVersionInfo cisBenchmarkVersionInfo);

    @DELETE("cisBenchmarkVersionInfo/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
