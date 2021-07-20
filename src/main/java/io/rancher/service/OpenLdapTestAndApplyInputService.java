package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.OpenLdapTestAndApplyInput;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface OpenLdapTestAndApplyInputService {

    @GET("openLdapTestAndApplyInput")
    Call<TypeCollection<OpenLdapTestAndApplyInput>> list();

    @GET("openLdapTestAndApplyInput")
    Call<TypeCollection<OpenLdapTestAndApplyInput>> list(@QueryMap Filters filters);

    @GET("openLdapTestAndApplyInput/{id}")
    Call<OpenLdapTestAndApplyInput> get(@Path("id") String id);

    @POST("openLdapTestAndApplyInput")
    Call<OpenLdapTestAndApplyInput> create(@Body OpenLdapTestAndApplyInput openLdapTestAndApplyInput);

    @PUT("openLdapTestAndApplyInput/{id}")
    Call<OpenLdapTestAndApplyInput> update(@Path("id") String id, @Body OpenLdapTestAndApplyInput openLdapTestAndApplyInput);

    @DELETE("openLdapTestAndApplyInput/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
