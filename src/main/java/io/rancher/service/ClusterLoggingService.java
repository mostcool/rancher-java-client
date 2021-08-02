package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ClusterLogging;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface ClusterLoggingService {

    @GET("clusterLogging")
    Call<TypeCollection<ClusterLogging>> list();

    @GET("clusterLogging")
    Call<TypeCollection<ClusterLogging>> list(@QueryMap Filters filters);

    @GET("clusterLogging/{id}")
    Call<ClusterLogging> get(@Path("id") String id);

    @POST("clusterLogging")
    Call<ClusterLogging> create(@Body ClusterLogging clusterLogging);

    @PUT("clusterLogging/{id}")
    Call<ClusterLogging> update(@Path("id") String id, @Body ClusterLogging clusterLogging);

    @DELETE("clusterLogging/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
