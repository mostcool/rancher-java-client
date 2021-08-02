package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.CisScanConfig;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface CisScanConfigService {

    @GET("cisScanConfig")
    Call<TypeCollection<CisScanConfig>> list();

    @GET("cisScanConfig")
    Call<TypeCollection<CisScanConfig>> list(@QueryMap Filters filters);

    @GET("cisScanConfig/{id}")
    Call<CisScanConfig> get(@Path("id") String id);

    @POST("cisScanConfig")
    Call<CisScanConfig> create(@Body CisScanConfig cisScanConfig);

    @PUT("cisScanConfig/{id}")
    Call<CisScanConfig> update(@Path("id") String id, @Body CisScanConfig cisScanConfig);

    @DELETE("cisScanConfig/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
