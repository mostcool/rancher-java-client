package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.PodSecurityPolicyTemplateProjectBinding;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface PodSecurityPolicyTemplateProjectBindingService {

    @GET("podSecurityPolicyTemplateProjectBinding")
    Call<TypeCollection<PodSecurityPolicyTemplateProjectBinding>> list();

    @GET("podSecurityPolicyTemplateProjectBinding")
    Call<TypeCollection<PodSecurityPolicyTemplateProjectBinding>> list(@QueryMap Filters filters);

    @GET("podSecurityPolicyTemplateProjectBinding/{id}")
    Call<PodSecurityPolicyTemplateProjectBinding> get(@Path("id") String id);

    @POST("podSecurityPolicyTemplateProjectBinding")
    Call<PodSecurityPolicyTemplateProjectBinding> create(@Body PodSecurityPolicyTemplateProjectBinding podSecurityPolicyTemplateProjectBinding);

    @PUT("podSecurityPolicyTemplateProjectBinding/{id}")
    Call<PodSecurityPolicyTemplateProjectBinding> update(@Path("id") String id, @Body PodSecurityPolicyTemplateProjectBinding podSecurityPolicyTemplateProjectBinding);

    @DELETE("podSecurityPolicyTemplateProjectBinding/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
