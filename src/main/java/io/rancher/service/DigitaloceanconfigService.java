package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.Digitaloceanconfig;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface DigitaloceanconfigService {

    @GET("digitaloceanconfig")
    Call<TypeCollection<Digitaloceanconfig>> list();

    @GET("digitaloceanconfig")
    Call<TypeCollection<Digitaloceanconfig>> list(@QueryMap Filters filters);

    @GET("digitaloceanconfig/{id}")
    Call<Digitaloceanconfig> get(@Path("id") String id);

    @POST("digitaloceanconfig")
    Call<Digitaloceanconfig> create(@Body Digitaloceanconfig digitaloceanconfig);

    @PUT("digitaloceanconfig/{id}")
    Call<Digitaloceanconfig> update(@Path("id") String id, @Body Digitaloceanconfig digitaloceanconfig);

    @DELETE("digitaloceanconfig/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
