package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.NamespacedServiceAccountToken;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface NamespacedServiceAccountTokenService {

    @GET("namespacedServiceAccountToken")
    Call<TypeCollection<NamespacedServiceAccountToken>> list();

    @GET("namespacedServiceAccountToken")
    Call<TypeCollection<NamespacedServiceAccountToken>> list(@QueryMap Filters filters);

    @GET("namespacedServiceAccountToken/{id}")
    Call<NamespacedServiceAccountToken> get(@Path("id") String id);

    @POST("namespacedServiceAccountToken")
    Call<NamespacedServiceAccountToken> create(@Body NamespacedServiceAccountToken namespacedServiceAccountToken);

    @PUT("namespacedServiceAccountToken/{id}")
    Call<NamespacedServiceAccountToken> update(@Path("id") String id, @Body NamespacedServiceAccountToken namespacedServiceAccountToken);

    @DELETE("namespacedServiceAccountToken/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
