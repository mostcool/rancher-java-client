package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.Sysctl;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface SysctlService {

    @GET("sysctl")
    Call<TypeCollection<Sysctl>> list();

    @GET("sysctl")
    Call<TypeCollection<Sysctl>> list(@QueryMap Filters filters);

    @GET("sysctl/{id}")
    Call<Sysctl> get(@Path("id") String id);

    @POST("sysctl")
    Call<Sysctl> create(@Body Sysctl sysctl);

    @PUT("sysctl/{id}")
    Call<Sysctl> update(@Path("id") String id, @Body Sysctl sysctl);

    @DELETE("sysctl/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
