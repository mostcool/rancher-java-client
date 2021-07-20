package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.EnvFrom;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface EnvFromService {

    @GET("envFrom")
    Call<TypeCollection<EnvFrom>> list();

    @GET("envFrom")
    Call<TypeCollection<EnvFrom>> list(@QueryMap Filters filters);

    @GET("envFrom/{id}")
    Call<EnvFrom> get(@Path("id") String id);

    @POST("envFrom")
    Call<EnvFrom> create(@Body EnvFrom envFrom);

    @PUT("envFrom/{id}")
    Call<EnvFrom> update(@Path("id") String id, @Body EnvFrom envFrom);

    @DELETE("envFrom/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
