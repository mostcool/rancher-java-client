package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ActiveDirectoryConfig;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface ActiveDirectoryConfigService {

    @GET("activeDirectoryConfig")
    Call<TypeCollection<ActiveDirectoryConfig>> list();

    @GET("activeDirectoryConfig")
    Call<TypeCollection<ActiveDirectoryConfig>> list(@QueryMap Filters filters);

    @GET("activeDirectoryConfig/{id}")
    Call<ActiveDirectoryConfig> get(@Path("id") String id);

    @POST("activeDirectoryConfig")
    Call<ActiveDirectoryConfig> create(@Body ActiveDirectoryConfig activeDirectoryConfig);

    @PUT("activeDirectoryConfig/{id}")
    Call<ActiveDirectoryConfig> update(@Path("id") String id, @Body ActiveDirectoryConfig activeDirectoryConfig);

    @DELETE("activeDirectoryConfig/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
