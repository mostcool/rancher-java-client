package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.Values;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface ValuesService {

    @GET("values")
    Call<TypeCollection<Values>> list();

    @GET("values")
    Call<TypeCollection<Values>> list(@QueryMap Filters filters);

    @GET("values/{id}")
    Call<Values> get(@Path("id") String id);

    @POST("values")
    Call<Values> create(@Body Values values);

    @PUT("values/{id}")
    Call<Values> update(@Path("id") String id, @Body Values values);

    @DELETE("values/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
