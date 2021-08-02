package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.EnvVar;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface EnvVarService {

    @GET("envVar")
    Call<TypeCollection<EnvVar>> list();

    @GET("envVar")
    Call<TypeCollection<EnvVar>> list(@QueryMap Filters filters);

    @GET("envVar/{id}")
    Call<EnvVar> get(@Path("id") String id);

    @POST("envVar")
    Call<EnvVar> create(@Body EnvVar envVar);

    @PUT("envVar/{id}")
    Call<EnvVar> update(@Path("id") String id, @Body EnvVar envVar);

    @DELETE("envVar/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
