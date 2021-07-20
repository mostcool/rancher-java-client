package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.RkeSystemImages;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface RkeSystemImagesService {

    @GET("rkeSystemImages")
    Call<TypeCollection<RkeSystemImages>> list();

    @GET("rkeSystemImages")
    Call<TypeCollection<RkeSystemImages>> list(@QueryMap Filters filters);

    @GET("rkeSystemImages/{id}")
    Call<RkeSystemImages> get(@Path("id") String id);

    @POST("rkeSystemImages")
    Call<RkeSystemImages> create(@Body RkeSystemImages rkeSystemImages);

    @PUT("rkeSystemImages/{id}")
    Call<RkeSystemImages> update(@Path("id") String id, @Body RkeSystemImages rkeSystemImages);

    @DELETE("rkeSystemImages/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
