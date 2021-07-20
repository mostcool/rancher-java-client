package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.PodDNSConfigOption;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface PodDNSConfigOptionService {

    @GET("podDNSConfigOption")
    Call<TypeCollection<PodDNSConfigOption>> list();

    @GET("podDNSConfigOption")
    Call<TypeCollection<PodDNSConfigOption>> list(@QueryMap Filters filters);

    @GET("podDNSConfigOption/{id}")
    Call<PodDNSConfigOption> get(@Path("id") String id);

    @POST("podDNSConfigOption")
    Call<PodDNSConfigOption> create(@Body PodDNSConfigOption podDNSConfigOption);

    @PUT("podDNSConfigOption/{id}")
    Call<PodDNSConfigOption> update(@Path("id") String id, @Body PodDNSConfigOption podDNSConfigOption);

    @DELETE("podDNSConfigOption/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
