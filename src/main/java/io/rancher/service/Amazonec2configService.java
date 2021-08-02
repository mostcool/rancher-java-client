package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.Amazonec2config;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface Amazonec2configService {

    @GET("amazonec2config")
    Call<TypeCollection<Amazonec2config>> list();

    @GET("amazonec2config")
    Call<TypeCollection<Amazonec2config>> list(@QueryMap Filters filters);

    @GET("amazonec2config/{id}")
    Call<Amazonec2config> get(@Path("id") String id);

    @POST("amazonec2config")
    Call<Amazonec2config> create(@Body Amazonec2config amazonec2config);

    @PUT("amazonec2config/{id}")
    Call<Amazonec2config> update(@Path("id") String id, @Body Amazonec2config amazonec2config);

    @DELETE("amazonec2config/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
