package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.PrivateRegistry;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface PrivateRegistryService {

    @GET("privateRegistry")
    Call<TypeCollection<PrivateRegistry>> list();

    @GET("privateRegistry")
    Call<TypeCollection<PrivateRegistry>> list(@QueryMap Filters filters);

    @GET("privateRegistry/{id}")
    Call<PrivateRegistry> get(@Path("id") String id);

    @POST("privateRegistry")
    Call<PrivateRegistry> create(@Body PrivateRegistry privateRegistry);

    @PUT("privateRegistry/{id}")
    Call<PrivateRegistry> update(@Path("id") String id, @Body PrivateRegistry privateRegistry);

    @DELETE("privateRegistry/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
