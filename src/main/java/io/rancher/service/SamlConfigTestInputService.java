package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.SamlConfigTestInput;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface SamlConfigTestInputService {

    @GET("samlConfigTestInput")
    Call<TypeCollection<SamlConfigTestInput>> list();

    @GET("samlConfigTestInput")
    Call<TypeCollection<SamlConfigTestInput>> list(@QueryMap Filters filters);

    @GET("samlConfigTestInput/{id}")
    Call<SamlConfigTestInput> get(@Path("id") String id);

    @POST("samlConfigTestInput")
    Call<SamlConfigTestInput> create(@Body SamlConfigTestInput samlConfigTestInput);

    @PUT("samlConfigTestInput/{id}")
    Call<SamlConfigTestInput> update(@Path("id") String id, @Body SamlConfigTestInput samlConfigTestInput);

    @DELETE("samlConfigTestInput/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
