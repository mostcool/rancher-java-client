package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.MetadataOpenstackOpts;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface MetadataOpenstackOptsService {

    @GET("metadataOpenstackOpts")
    Call<TypeCollection<MetadataOpenstackOpts>> list();

    @GET("metadataOpenstackOpts")
    Call<TypeCollection<MetadataOpenstackOpts>> list(@QueryMap Filters filters);

    @GET("metadataOpenstackOpts/{id}")
    Call<MetadataOpenstackOpts> get(@Path("id") String id);

    @POST("metadataOpenstackOpts")
    Call<MetadataOpenstackOpts> create(@Body MetadataOpenstackOpts metadataOpenstackOpts);

    @PUT("metadataOpenstackOpts/{id}")
    Call<MetadataOpenstackOpts> update(@Path("id") String id, @Body MetadataOpenstackOpts metadataOpenstackOpts);

    @DELETE("metadataOpenstackOpts/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
