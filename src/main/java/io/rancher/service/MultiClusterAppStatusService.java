package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.MultiClusterAppStatus;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface MultiClusterAppStatusService {

    @GET("multiClusterAppStatus")
    Call<TypeCollection<MultiClusterAppStatus>> list();

    @GET("multiClusterAppStatus")
    Call<TypeCollection<MultiClusterAppStatus>> list(@QueryMap Filters filters);

    @GET("multiClusterAppStatus/{id}")
    Call<MultiClusterAppStatus> get(@Path("id") String id);

    @POST("multiClusterAppStatus")
    Call<MultiClusterAppStatus> create(@Body MultiClusterAppStatus multiClusterAppStatus);

    @PUT("multiClusterAppStatus/{id}")
    Call<MultiClusterAppStatus> update(@Path("id") String id, @Body MultiClusterAppStatus multiClusterAppStatus);

    @DELETE("multiClusterAppStatus/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
