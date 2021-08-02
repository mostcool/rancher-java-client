package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.SamlToken;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface SamlTokenService {

    @GET("samlToken")
    Call<TypeCollection<SamlToken>> list();

    @GET("samlToken")
    Call<TypeCollection<SamlToken>> list(@QueryMap Filters filters);

    @GET("samlToken/{id}")
    Call<SamlToken> get(@Path("id") String id);

    @POST("samlToken")
    Call<SamlToken> create(@Body SamlToken samlToken);

    @PUT("samlToken/{id}")
    Call<SamlToken> update(@Path("id") String id, @Body SamlToken samlToken);

    @DELETE("samlToken/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
