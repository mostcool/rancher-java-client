package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.OwnerReference;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface OwnerReferenceService {

    @GET("ownerReference")
    Call<TypeCollection<OwnerReference>> list();

    @GET("ownerReference")
    Call<TypeCollection<OwnerReference>> list(@QueryMap Filters filters);

    @GET("ownerReference/{id}")
    Call<OwnerReference> get(@Path("id") String id);

    @POST("ownerReference")
    Call<OwnerReference> create(@Body OwnerReference ownerReference);

    @PUT("ownerReference/{id}")
    Call<OwnerReference> update(@Path("id") String id, @Body OwnerReference ownerReference);

    @DELETE("ownerReference/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
