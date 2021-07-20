package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.EnvironmentFrom;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface EnvironmentFromService {

    @GET("environmentFrom")
    Call<TypeCollection<EnvironmentFrom>> list();

    @GET("environmentFrom")
    Call<TypeCollection<EnvironmentFrom>> list(@QueryMap Filters filters);

    @GET("environmentFrom/{id}")
    Call<EnvironmentFrom> get(@Path("id") String id);

    @POST("environmentFrom")
    Call<EnvironmentFrom> create(@Body EnvironmentFrom environmentFrom);

    @PUT("environmentFrom/{id}")
    Call<EnvironmentFrom> update(@Path("id") String id, @Body EnvironmentFrom environmentFrom);

    @DELETE("environmentFrom/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
