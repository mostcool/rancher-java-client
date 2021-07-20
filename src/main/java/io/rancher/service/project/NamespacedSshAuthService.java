package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.NamespacedSshAuth;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface NamespacedSshAuthService {

    @GET("namespacedSshAuth")
    Call<TypeCollection<NamespacedSshAuth>> list();

    @GET("namespacedSshAuth")
    Call<TypeCollection<NamespacedSshAuth>> list(@QueryMap Filters filters);

    @GET("namespacedSshAuth/{id}")
    Call<NamespacedSshAuth> get(@Path("id") String id);

    @POST("namespacedSshAuth")
    Call<NamespacedSshAuth> create(@Body NamespacedSshAuth namespacedSshAuth);

    @PUT("namespacedSshAuth/{id}")
    Call<NamespacedSshAuth> update(@Path("id") String id, @Body NamespacedSshAuth namespacedSshAuth);

    @DELETE("namespacedSshAuth/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
