package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.MemoryInfo;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface MemoryInfoService {

    @GET("memoryInfo")
    Call<TypeCollection<MemoryInfo>> list();

    @GET("memoryInfo")
    Call<TypeCollection<MemoryInfo>> list(@QueryMap Filters filters);

    @GET("memoryInfo/{id}")
    Call<MemoryInfo> get(@Path("id") String id);

    @POST("memoryInfo")
    Call<MemoryInfo> create(@Body MemoryInfo memoryInfo);

    @PUT("memoryInfo/{id}")
    Call<MemoryInfo> update(@Path("id") String id, @Body MemoryInfo memoryInfo);

    @DELETE("memoryInfo/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
