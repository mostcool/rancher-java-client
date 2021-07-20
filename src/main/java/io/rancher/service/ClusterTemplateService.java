package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ClusterTemplate;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface ClusterTemplateService {

    @GET("clusterTemplate")
    Call<TypeCollection<ClusterTemplate>> list();

    @GET("clusterTemplate")
    Call<TypeCollection<ClusterTemplate>> list(@QueryMap Filters filters);

    @GET("clusterTemplate/{id}")
    Call<ClusterTemplate> get(@Path("id") String id);

    @POST("clusterTemplate")
    Call<ClusterTemplate> create(@Body ClusterTemplate clusterTemplate);

    @PUT("clusterTemplate/{id}")
    Call<ClusterTemplate> update(@Path("id") String id, @Body ClusterTemplate clusterTemplate);

    @DELETE("clusterTemplate/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
