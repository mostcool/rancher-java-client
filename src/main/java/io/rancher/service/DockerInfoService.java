package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.DockerInfo;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface DockerInfoService {

    @GET("dockerInfo")
    Call<TypeCollection<DockerInfo>> list();

    @GET("dockerInfo")
    Call<TypeCollection<DockerInfo>> list(@QueryMap Filters filters);

    @GET("dockerInfo/{id}")
    Call<DockerInfo> get(@Path("id") String id);

    @POST("dockerInfo")
    Call<DockerInfo> create(@Body DockerInfo dockerInfo);

    @PUT("dockerInfo/{id}")
    Call<DockerInfo> update(@Path("id") String id, @Body DockerInfo dockerInfo);

    @DELETE("dockerInfo/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
