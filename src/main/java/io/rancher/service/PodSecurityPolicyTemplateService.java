package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.PodSecurityPolicyTemplate;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface PodSecurityPolicyTemplateService {

    @GET("podSecurityPolicyTemplate")
    Call<TypeCollection<PodSecurityPolicyTemplate>> list();

    @GET("podSecurityPolicyTemplate")
    Call<TypeCollection<PodSecurityPolicyTemplate>> list(@QueryMap Filters filters);

    @GET("podSecurityPolicyTemplate/{id}")
    Call<PodSecurityPolicyTemplate> get(@Path("id") String id);

    @POST("podSecurityPolicyTemplate")
    Call<PodSecurityPolicyTemplate> create(@Body PodSecurityPolicyTemplate podSecurityPolicyTemplate);

    @PUT("podSecurityPolicyTemplate/{id}")
    Call<PodSecurityPolicyTemplate> update(@Path("id") String id, @Body PodSecurityPolicyTemplate podSecurityPolicyTemplate);

    @DELETE("podSecurityPolicyTemplate/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
