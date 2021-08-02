package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.CisBenchmarkVersionInfo;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

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
    Call<ResponseBody> delete(@Path("id") String id);
}
