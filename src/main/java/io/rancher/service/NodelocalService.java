package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.Nodelocal;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface NodelocalService {

    @GET("nodelocal")
    Call<TypeCollection<Nodelocal>> list();

    @GET("nodelocal")
    Call<TypeCollection<Nodelocal>> list(@QueryMap Filters filters);

    @GET("nodelocal/{id}")
    Call<Nodelocal> get(@Path("id") String id);

    @POST("nodelocal")
    Call<Nodelocal> create(@Body Nodelocal nodelocal);

    @PUT("nodelocal/{id}")
    Call<Nodelocal> update(@Path("id") String id, @Body Nodelocal nodelocal);

    @DELETE("nodelocal/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
