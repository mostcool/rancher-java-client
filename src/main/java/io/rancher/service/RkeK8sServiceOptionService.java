package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.RkeK8sServiceOption;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface RkeK8sServiceOptionService {

    @GET("rkeK8sServiceOption")
    Call<TypeCollection<RkeK8sServiceOption>> list();

    @GET("rkeK8sServiceOption")
    Call<TypeCollection<RkeK8sServiceOption>> list(@QueryMap Filters filters);

    @GET("rkeK8sServiceOption/{id}")
    Call<RkeK8sServiceOption> get(@Path("id") String id);

    @POST("rkeK8sServiceOption")
    Call<RkeK8sServiceOption> create(@Body RkeK8sServiceOption rkeK8sServiceOption);

    @PUT("rkeK8sServiceOption/{id}")
    Call<RkeK8sServiceOption> update(@Path("id") String id, @Body RkeK8sServiceOption rkeK8sServiceOption);

    @DELETE("rkeK8sServiceOption/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
