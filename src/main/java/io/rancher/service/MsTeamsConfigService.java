package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.MsTeamsConfig;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface MsTeamsConfigService {

    @GET("msTeamsConfig")
    Call<TypeCollection<MsTeamsConfig>> list();

    @GET("msTeamsConfig")
    Call<TypeCollection<MsTeamsConfig>> list(@QueryMap Filters filters);

    @GET("msTeamsConfig/{id}")
    Call<MsTeamsConfig> get(@Path("id") String id);

    @POST("msTeamsConfig")
    Call<MsTeamsConfig> create(@Body MsTeamsConfig msTeamsConfig);

    @PUT("msTeamsConfig/{id}")
    Call<MsTeamsConfig> update(@Path("id") String id, @Body MsTeamsConfig msTeamsConfig);

    @DELETE("msTeamsConfig/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
