package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.StorageSpec;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface StorageSpecService {

    @GET("storageSpec")
    Call<TypeCollection<StorageSpec>> list();

    @GET("storageSpec")
    Call<TypeCollection<StorageSpec>> list(@QueryMap Filters filters);

    @GET("storageSpec/{id}")
    Call<StorageSpec> get(@Path("id") String id);

    @POST("storageSpec")
    Call<StorageSpec> create(@Body StorageSpec storageSpec);

    @PUT("storageSpec/{id}")
    Call<StorageSpec> update(@Path("id") String id, @Body StorageSpec storageSpec);

    @DELETE("storageSpec/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
