package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.OpenLdapConfig;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface OpenLdapConfigService {

    @GET("openLdapConfig")
    Call<TypeCollection<OpenLdapConfig>> list();

    @GET("openLdapConfig")
    Call<TypeCollection<OpenLdapConfig>> list(@QueryMap Filters filters);

    @GET("openLdapConfig/{id}")
    Call<OpenLdapConfig> get(@Path("id") String id);

    @POST("openLdapConfig")
    Call<OpenLdapConfig> create(@Body OpenLdapConfig openLdapConfig);

    @PUT("openLdapConfig/{id}")
    Call<OpenLdapConfig> update(@Path("id") String id, @Body OpenLdapConfig openLdapConfig);

    @DELETE("openLdapConfig/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
