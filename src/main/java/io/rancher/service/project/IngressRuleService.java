package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.IngressRule;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface IngressRuleService {

    @GET("ingressRule")
    Call<TypeCollection<IngressRule>> list();

    @GET("ingressRule")
    Call<TypeCollection<IngressRule>> list(@QueryMap Filters filters);

    @GET("ingressRule/{id}")
    Call<IngressRule> get(@Path("id") String id);

    @POST("ingressRule")
    Call<IngressRule> create(@Body IngressRule ingressRule);

    @PUT("ingressRule/{id}")
    Call<IngressRule> update(@Path("id") String id, @Body IngressRule ingressRule);

    @DELETE("ingressRule/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
