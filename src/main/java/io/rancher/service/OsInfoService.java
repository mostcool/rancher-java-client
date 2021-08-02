package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.OsInfo;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface OsInfoService {

    @GET("osInfo")
    Call<TypeCollection<OsInfo>> list();

    @GET("osInfo")
    Call<TypeCollection<OsInfo>> list(@QueryMap Filters filters);

    @GET("osInfo/{id}")
    Call<OsInfo> get(@Path("id") String id);

    @POST("osInfo")
    Call<OsInfo> create(@Body OsInfo osInfo);

    @PUT("osInfo/{id}")
    Call<OsInfo> update(@Path("id") String id, @Body OsInfo osInfo);

    @DELETE("osInfo/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
