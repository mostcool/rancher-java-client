package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.File;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface FileService {

    @GET("file")
    Call<TypeCollection<File>> list();

    @GET("file")
    Call<TypeCollection<File>> list(@QueryMap Filters filters);

    @GET("file/{id}")
    Call<File> get(@Path("id") String id);

    @POST("file")
    Call<File> create(@Body File file);

    @PUT("file/{id}")
    Call<File> update(@Path("id") String id, @Body File file);

    @DELETE("file/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
