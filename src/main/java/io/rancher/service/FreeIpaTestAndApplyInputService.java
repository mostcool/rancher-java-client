package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.FreeIpaTestAndApplyInput;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface FreeIpaTestAndApplyInputService {

    @GET("freeIpaTestAndApplyInput")
    Call<TypeCollection<FreeIpaTestAndApplyInput>> list();

    @GET("freeIpaTestAndApplyInput")
    Call<TypeCollection<FreeIpaTestAndApplyInput>> list(@QueryMap Filters filters);

    @GET("freeIpaTestAndApplyInput/{id}")
    Call<FreeIpaTestAndApplyInput> get(@Path("id") String id);

    @POST("freeIpaTestAndApplyInput")
    Call<FreeIpaTestAndApplyInput> create(@Body FreeIpaTestAndApplyInput freeIpaTestAndApplyInput);

    @PUT("freeIpaTestAndApplyInput/{id}")
    Call<FreeIpaTestAndApplyInput> update(@Path("id") String id, @Body FreeIpaTestAndApplyInput freeIpaTestAndApplyInput);

    @DELETE("freeIpaTestAndApplyInput/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
