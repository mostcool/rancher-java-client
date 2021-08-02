package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.SplunkConfig;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface SplunkConfigService {

    @GET("splunkConfig")
    Call<TypeCollection<SplunkConfig>> list();

    @GET("splunkConfig")
    Call<TypeCollection<SplunkConfig>> list(@QueryMap Filters filters);

    @GET("splunkConfig/{id}")
    Call<SplunkConfig> get(@Path("id") String id);

    @POST("splunkConfig")
    Call<SplunkConfig> create(@Body SplunkConfig splunkConfig);

    @PUT("splunkConfig/{id}")
    Call<SplunkConfig> update(@Path("id") String id, @Body SplunkConfig splunkConfig);

    @DELETE("splunkConfig/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
