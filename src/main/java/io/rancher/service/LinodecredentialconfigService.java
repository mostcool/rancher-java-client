package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.Linodecredentialconfig;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface LinodecredentialconfigService {

    @GET("linodecredentialconfig")
    Call<TypeCollection<Linodecredentialconfig>> list();

    @GET("linodecredentialconfig")
    Call<TypeCollection<Linodecredentialconfig>> list(@QueryMap Filters filters);

    @GET("linodecredentialconfig/{id}")
    Call<Linodecredentialconfig> get(@Path("id") String id);

    @POST("linodecredentialconfig")
    Call<Linodecredentialconfig> create(@Body Linodecredentialconfig linodecredentialconfig);

    @PUT("linodecredentialconfig/{id}")
    Call<Linodecredentialconfig> update(@Path("id") String id, @Body Linodecredentialconfig linodecredentialconfig);

    @DELETE("linodecredentialconfig/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
