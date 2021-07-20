package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.PodAntiAffinity;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface PodAntiAffinityService {

    @GET("podAntiAffinity")
    Call<TypeCollection<PodAntiAffinity>> list();

    @GET("podAntiAffinity")
    Call<TypeCollection<PodAntiAffinity>> list(@QueryMap Filters filters);

    @GET("podAntiAffinity/{id}")
    Call<PodAntiAffinity> get(@Path("id") String id);

    @POST("podAntiAffinity")
    Call<PodAntiAffinity> create(@Body PodAntiAffinity podAntiAffinity);

    @PUT("podAntiAffinity/{id}")
    Call<PodAntiAffinity> update(@Path("id") String id, @Body PodAntiAffinity podAntiAffinity);

    @DELETE("podAntiAffinity/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
