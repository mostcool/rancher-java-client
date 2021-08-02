package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.CisConfigParams;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface CisConfigParamsService {

    @GET("cisConfigParams")
    Call<TypeCollection<CisConfigParams>> list();

    @GET("cisConfigParams")
    Call<TypeCollection<CisConfigParams>> list(@QueryMap Filters filters);

    @GET("cisConfigParams/{id}")
    Call<CisConfigParams> get(@Path("id") String id);

    @POST("cisConfigParams")
    Call<CisConfigParams> create(@Body CisConfigParams cisConfigParams);

    @PUT("cisConfigParams/{id}")
    Call<CisConfigParams> update(@Path("id") String id, @Body CisConfigParams cisConfigParams);

    @DELETE("cisConfigParams/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
