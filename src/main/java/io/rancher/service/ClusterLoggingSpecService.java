package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ClusterLoggingSpec;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface ClusterLoggingSpecService {

    @GET("clusterLoggingSpec")
    Call<TypeCollection<ClusterLoggingSpec>> list();

    @GET("clusterLoggingSpec")
    Call<TypeCollection<ClusterLoggingSpec>> list(@QueryMap Filters filters);

    @GET("clusterLoggingSpec/{id}")
    Call<ClusterLoggingSpec> get(@Path("id") String id);

    @POST("clusterLoggingSpec")
    Call<ClusterLoggingSpec> create(@Body ClusterLoggingSpec clusterLoggingSpec);

    @PUT("clusterLoggingSpec/{id}")
    Call<ClusterLoggingSpec> update(@Path("id") String id, @Body ClusterLoggingSpec clusterLoggingSpec);

    @DELETE("clusterLoggingSpec/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
