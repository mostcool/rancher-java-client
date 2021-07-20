package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.LdapConfig;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface LdapConfigService {

    @GET("ldapConfig")
    Call<TypeCollection<LdapConfig>> list();

    @GET("ldapConfig")
    Call<TypeCollection<LdapConfig>> list(@QueryMap Filters filters);

    @GET("ldapConfig/{id}")
    Call<LdapConfig> get(@Path("id") String id);

    @POST("ldapConfig")
    Call<LdapConfig> create(@Body LdapConfig ldapConfig);

    @PUT("ldapConfig/{id}")
    Call<LdapConfig> update(@Path("id") String id, @Body LdapConfig ldapConfig);

    @DELETE("ldapConfig/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
