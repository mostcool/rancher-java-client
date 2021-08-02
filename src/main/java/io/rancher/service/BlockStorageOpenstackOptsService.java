package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.BlockStorageOpenstackOpts;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface BlockStorageOpenstackOptsService {

    @GET("blockStorageOpenstackOpts")
    Call<TypeCollection<BlockStorageOpenstackOpts>> list();

    @GET("blockStorageOpenstackOpts")
    Call<TypeCollection<BlockStorageOpenstackOpts>> list(@QueryMap Filters filters);

    @GET("blockStorageOpenstackOpts/{id}")
    Call<BlockStorageOpenstackOpts> get(@Path("id") String id);

    @POST("blockStorageOpenstackOpts")
    Call<BlockStorageOpenstackOpts> create(@Body BlockStorageOpenstackOpts blockStorageOpenstackOpts);

    @PUT("blockStorageOpenstackOpts/{id}")
    Call<BlockStorageOpenstackOpts> update(@Path("id") String id, @Body BlockStorageOpenstackOpts blockStorageOpenstackOpts);

    @DELETE("blockStorageOpenstackOpts/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
