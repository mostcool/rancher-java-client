package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.PodDNSConfig;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface PodDNSConfigService {

    @GET("podDNSConfig")
    Call<TypeCollection<PodDNSConfig>> list();

    @GET("podDNSConfig")
    Call<TypeCollection<PodDNSConfig>> list(@QueryMap Filters filters);

    @GET("podDNSConfig/{id}")
    Call<PodDNSConfig> get(@Path("id") String id);

    @POST("podDNSConfig")
    Call<PodDNSConfig> create(@Body PodDNSConfig podDNSConfig);

    @PUT("podDNSConfig/{id}")
    Call<PodDNSConfig> update(@Path("id") String id, @Body PodDNSConfig podDNSConfig);

    @DELETE("podDNSConfig/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
