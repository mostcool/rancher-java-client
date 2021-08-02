package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.KubernetesServicesOptions;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface KubernetesServicesOptionsService {

    @GET("kubernetesServicesOptions")
    Call<TypeCollection<KubernetesServicesOptions>> list();

    @GET("kubernetesServicesOptions")
    Call<TypeCollection<KubernetesServicesOptions>> list(@QueryMap Filters filters);

    @GET("kubernetesServicesOptions/{id}")
    Call<KubernetesServicesOptions> get(@Path("id") String id);

    @POST("kubernetesServicesOptions")
    Call<KubernetesServicesOptions> create(@Body KubernetesServicesOptions kubernetesServicesOptions);

    @PUT("kubernetesServicesOptions/{id}")
    Call<KubernetesServicesOptions> update(@Path("id") String id, @Body KubernetesServicesOptions kubernetesServicesOptions);

    @DELETE("kubernetesServicesOptions/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
