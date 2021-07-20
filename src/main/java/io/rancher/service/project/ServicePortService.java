package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.ServicePort;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface ServicePortService {

    @GET("servicePort")
    Call<TypeCollection<ServicePort>> list();

    @GET("servicePort")
    Call<TypeCollection<ServicePort>> list(@QueryMap Filters filters);

    @GET("servicePort/{id}")
    Call<ServicePort> get(@Path("id") String id);

    @POST("servicePort")
    Call<ServicePort> create(@Body ServicePort servicePort);

    @PUT("servicePort/{id}")
    Call<ServicePort> update(@Path("id") String id, @Body ServicePort servicePort);

    @DELETE("servicePort/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
