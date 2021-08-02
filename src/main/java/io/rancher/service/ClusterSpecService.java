package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ClusterSpec;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface ClusterSpecService {

    @GET("clusterSpec")
    Call<TypeCollection<ClusterSpec>> list();

    @GET("clusterSpec")
    Call<TypeCollection<ClusterSpec>> list(@QueryMap Filters filters);

    @GET("clusterSpec/{id}")
    Call<ClusterSpec> get(@Path("id") String id);

    @POST("clusterSpec")
    Call<ClusterSpec> create(@Body ClusterSpec clusterSpec);

    @PUT("clusterSpec/{id}")
    Call<ClusterSpec> update(@Path("id") String id, @Body ClusterSpec clusterSpec);

    @DELETE("clusterSpec/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
