package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.ReplicationControllerConfig;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface ReplicationControllerConfigService {

    @GET("replicationControllerConfig")
    Call<TypeCollection<ReplicationControllerConfig>> list();

    @GET("replicationControllerConfig")
    Call<TypeCollection<ReplicationControllerConfig>> list(@QueryMap Filters filters);

    @GET("replicationControllerConfig/{id}")
    Call<ReplicationControllerConfig> get(@Path("id") String id);

    @POST("replicationControllerConfig")
    Call<ReplicationControllerConfig> create(@Body ReplicationControllerConfig replicationControllerConfig);

    @PUT("replicationControllerConfig/{id}")
    Call<ReplicationControllerConfig> update(@Path("id") String id, @Body ReplicationControllerConfig replicationControllerConfig);

    @DELETE("replicationControllerConfig/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
