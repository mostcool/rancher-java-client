package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.SecretOrConfigMap;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface SecretOrConfigMapService {

    @GET("secretOrConfigMap")
    Call<TypeCollection<SecretOrConfigMap>> list();

    @GET("secretOrConfigMap")
    Call<TypeCollection<SecretOrConfigMap>> list(@QueryMap Filters filters);

    @GET("secretOrConfigMap/{id}")
    Call<SecretOrConfigMap> get(@Path("id") String id);

    @POST("secretOrConfigMap")
    Call<SecretOrConfigMap> create(@Body SecretOrConfigMap secretOrConfigMap);

    @PUT("secretOrConfigMap/{id}")
    Call<SecretOrConfigMap> update(@Path("id") String id, @Body SecretOrConfigMap secretOrConfigMap);

    @DELETE("secretOrConfigMap/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
