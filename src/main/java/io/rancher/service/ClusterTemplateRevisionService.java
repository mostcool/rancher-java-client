package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ClusterTemplateRevision;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface ClusterTemplateRevisionService {

    @GET("clusterTemplateRevision")
    Call<TypeCollection<ClusterTemplateRevision>> list();

    @GET("clusterTemplateRevision")
    Call<TypeCollection<ClusterTemplateRevision>> list(@QueryMap Filters filters);

    @GET("clusterTemplateRevision/{id}")
    Call<ClusterTemplateRevision> get(@Path("id") String id);

    @POST("clusterTemplateRevision")
    Call<ClusterTemplateRevision> create(@Body ClusterTemplateRevision clusterTemplateRevision);

    @PUT("clusterTemplateRevision/{id}")
    Call<ClusterTemplateRevision> update(@Path("id") String id, @Body ClusterTemplateRevision clusterTemplateRevision);

    @DELETE("clusterTemplateRevision/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
