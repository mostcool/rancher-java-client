package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.CpuInfo;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface CpuInfoService {

    @GET("cpuInfo")
    Call<TypeCollection<CpuInfo>> list();

    @GET("cpuInfo")
    Call<TypeCollection<CpuInfo>> list(@QueryMap Filters filters);

    @GET("cpuInfo/{id}")
    Call<CpuInfo> get(@Path("id") String id);

    @POST("cpuInfo")
    Call<CpuInfo> create(@Body CpuInfo cpuInfo);

    @PUT("cpuInfo/{id}")
    Call<CpuInfo> update(@Path("id") String id, @Body CpuInfo cpuInfo);

    @DELETE("cpuInfo/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
