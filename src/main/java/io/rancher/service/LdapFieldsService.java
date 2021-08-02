package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.LdapFields;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface LdapFieldsService {

    @GET("ldapFields")
    Call<TypeCollection<LdapFields>> list();

    @GET("ldapFields")
    Call<TypeCollection<LdapFields>> list(@QueryMap Filters filters);

    @GET("ldapFields/{id}")
    Call<LdapFields> get(@Path("id") String id);

    @POST("ldapFields")
    Call<LdapFields> create(@Body LdapFields ldapFields);

    @PUT("ldapFields/{id}")
    Call<LdapFields> update(@Path("id") String id, @Body LdapFields ldapFields);

    @DELETE("ldapFields/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
