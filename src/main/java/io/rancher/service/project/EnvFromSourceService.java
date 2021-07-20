package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.EnvFromSource;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface EnvFromSourceService {

    @GET("envFromSource")
    Call<TypeCollection<EnvFromSource>> list();

    @GET("envFromSource")
    Call<TypeCollection<EnvFromSource>> list(@QueryMap Filters filters);

    @GET("envFromSource/{id}")
    Call<EnvFromSource> get(@Path("id") String id);

    @POST("envFromSource")
    Call<EnvFromSource> create(@Body EnvFromSource envFromSource);

    @PUT("envFromSource/{id}")
    Call<EnvFromSource> update(@Path("id") String id, @Body EnvFromSource envFromSource);

    @DELETE("envFromSource/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
