package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.KontainerDriver;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface KontainerDriverService {

    @GET("kontainerDriver")
    Call<TypeCollection<KontainerDriver>> list();

    @GET("kontainerDriver")
    Call<TypeCollection<KontainerDriver>> list(@QueryMap Filters filters);

    @GET("kontainerDriver/{id}")
    Call<KontainerDriver> get(@Path("id") String id);

    @POST("kontainerDriver")
    Call<KontainerDriver> create(@Body KontainerDriver kontainerDriver);

    @PUT("kontainerDriver/{id}")
    Call<KontainerDriver> update(@Path("id") String id, @Body KontainerDriver kontainerDriver);

    @DELETE("kontainerDriver/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
