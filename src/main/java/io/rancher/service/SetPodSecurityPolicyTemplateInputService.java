package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.SetPodSecurityPolicyTemplateInput;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface SetPodSecurityPolicyTemplateInputService {

    @GET("setPodSecurityPolicyTemplateInput")
    Call<TypeCollection<SetPodSecurityPolicyTemplateInput>> list();

    @GET("setPodSecurityPolicyTemplateInput")
    Call<TypeCollection<SetPodSecurityPolicyTemplateInput>> list(@QueryMap Filters filters);

    @GET("setPodSecurityPolicyTemplateInput/{id}")
    Call<SetPodSecurityPolicyTemplateInput> get(@Path("id") String id);

    @POST("setPodSecurityPolicyTemplateInput")
    Call<SetPodSecurityPolicyTemplateInput> create(@Body SetPodSecurityPolicyTemplateInput setPodSecurityPolicyTemplateInput);

    @PUT("setPodSecurityPolicyTemplateInput/{id}")
    Call<SetPodSecurityPolicyTemplateInput> update(@Path("id") String id, @Body SetPodSecurityPolicyTemplateInput setPodSecurityPolicyTemplateInput);

    @DELETE("setPodSecurityPolicyTemplateInput/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
