package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.CloudCredential;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface CloudCredentialService {

    @GET("cloudCredential")
    Call<TypeCollection<CloudCredential>> list();

    @GET("cloudCredential")
    Call<TypeCollection<CloudCredential>> list(@QueryMap Filters filters);

    @GET("cloudCredential/{id}")
    Call<CloudCredential> get(@Path("id") String id);

    @POST("cloudCredential")
    Call<CloudCredential> create(@Body CloudCredential cloudCredential);

    @PUT("cloudCredential/{id}")
    Call<CloudCredential> update(@Path("id") String id, @Body CloudCredential cloudCredential);

    @DELETE("cloudCredential/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
