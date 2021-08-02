package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ComposeConfig;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface ComposeConfigService {

    @GET("composeConfig")
    Call<TypeCollection<ComposeConfig>> list();

    @GET("composeConfig")
    Call<TypeCollection<ComposeConfig>> list(@QueryMap Filters filters);

    @GET("composeConfig/{id}")
    Call<ComposeConfig> get(@Path("id") String id);

    @POST("composeConfig")
    Call<ComposeConfig> create(@Body ComposeConfig composeConfig);

    @PUT("composeConfig/{id}")
    Call<ComposeConfig> update(@Path("id") String id, @Body ComposeConfig composeConfig);

    @DELETE("composeConfig/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
