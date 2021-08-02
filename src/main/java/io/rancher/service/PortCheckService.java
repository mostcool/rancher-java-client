package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.PortCheck;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface PortCheckService {

    @GET("portCheck")
    Call<TypeCollection<PortCheck>> list();

    @GET("portCheck")
    Call<TypeCollection<PortCheck>> list(@QueryMap Filters filters);

    @GET("portCheck/{id}")
    Call<PortCheck> get(@Path("id") String id);

    @POST("portCheck")
    Call<PortCheck> create(@Body PortCheck portCheck);

    @PUT("portCheck/{id}")
    Call<PortCheck> update(@Path("id") String id, @Body PortCheck portCheck);

    @DELETE("portCheck/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
