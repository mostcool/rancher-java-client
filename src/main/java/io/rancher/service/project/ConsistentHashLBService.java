package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.ConsistentHashLB;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface ConsistentHashLBService {

    @GET("consistentHashLB")
    Call<TypeCollection<ConsistentHashLB>> list();

    @GET("consistentHashLB")
    Call<TypeCollection<ConsistentHashLB>> list(@QueryMap Filters filters);

    @GET("consistentHashLB/{id}")
    Call<ConsistentHashLB> get(@Path("id") String id);

    @POST("consistentHashLB")
    Call<ConsistentHashLB> create(@Body ConsistentHashLB consistentHashLB);

    @PUT("consistentHashLB/{id}")
    Call<ConsistentHashLB> update(@Path("id") String id, @Body ConsistentHashLB consistentHashLB);

    @DELETE("consistentHashLB/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
