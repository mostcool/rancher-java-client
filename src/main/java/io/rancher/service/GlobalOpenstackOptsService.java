package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.GlobalOpenstackOpts;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface GlobalOpenstackOptsService {

    @GET("globalOpenstackOpts")
    Call<TypeCollection<GlobalOpenstackOpts>> list();

    @GET("globalOpenstackOpts")
    Call<TypeCollection<GlobalOpenstackOpts>> list(@QueryMap Filters filters);

    @GET("globalOpenstackOpts/{id}")
    Call<GlobalOpenstackOpts> get(@Path("id") String id);

    @POST("globalOpenstackOpts")
    Call<GlobalOpenstackOpts> create(@Body GlobalOpenstackOpts globalOpenstackOpts);

    @PUT("globalOpenstackOpts/{id}")
    Call<GlobalOpenstackOpts> update(@Path("id") String id, @Body GlobalOpenstackOpts globalOpenstackOpts);

    @DELETE("globalOpenstackOpts/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
