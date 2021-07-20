package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.AllowedFlexVolume;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface AllowedFlexVolumeService {

    @GET("allowedFlexVolume")
    Call<TypeCollection<AllowedFlexVolume>> list();

    @GET("allowedFlexVolume")
    Call<TypeCollection<AllowedFlexVolume>> list(@QueryMap Filters filters);

    @GET("allowedFlexVolume/{id}")
    Call<AllowedFlexVolume> get(@Path("id") String id);

    @POST("allowedFlexVolume")
    Call<AllowedFlexVolume> create(@Body AllowedFlexVolume allowedFlexVolume);

    @PUT("allowedFlexVolume/{id}")
    Call<AllowedFlexVolume> update(@Path("id") String id, @Body AllowedFlexVolume allowedFlexVolume);

    @DELETE("allowedFlexVolume/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
