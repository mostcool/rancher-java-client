package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.FluentServer;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface FluentServerService {

    @GET("fluentServer")
    Call<TypeCollection<FluentServer>> list();

    @GET("fluentServer")
    Call<TypeCollection<FluentServer>> list(@QueryMap Filters filters);

    @GET("fluentServer/{id}")
    Call<FluentServer> get(@Path("id") String id);

    @POST("fluentServer")
    Call<FluentServer> create(@Body FluentServer fluentServer);

    @PUT("fluentServer/{id}")
    Call<FluentServer> update(@Path("id") String id, @Body FluentServer fluentServer);

    @DELETE("fluentServer/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
