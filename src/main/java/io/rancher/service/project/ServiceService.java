package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.Service;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface ServiceService {

    @GET("service")
    Call<TypeCollection<Service>> list();

    @GET("service")
    Call<TypeCollection<Service>> list(@QueryMap Filters filters);

    @GET("service/{id}")
    Call<Service> get(@Path("id") String id);

    @POST("service")
    Call<Service> create(@Body Service service);

    @PUT("service/{id}")
    Call<Service> update(@Path("id") String id, @Body Service service);

    @DELETE("service/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
