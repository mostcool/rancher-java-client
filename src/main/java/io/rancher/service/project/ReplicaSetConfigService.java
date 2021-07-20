package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.ReplicaSetConfig;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface ReplicaSetConfigService {

    @GET("replicaSetConfig")
    Call<TypeCollection<ReplicaSetConfig>> list();

    @GET("replicaSetConfig")
    Call<TypeCollection<ReplicaSetConfig>> list(@QueryMap Filters filters);

    @GET("replicaSetConfig/{id}")
    Call<ReplicaSetConfig> get(@Path("id") String id);

    @POST("replicaSetConfig")
    Call<ReplicaSetConfig> create(@Body ReplicaSetConfig replicaSetConfig);

    @PUT("replicaSetConfig/{id}")
    Call<ReplicaSetConfig> update(@Path("id") String id, @Body ReplicaSetConfig replicaSetConfig);

    @DELETE("replicaSetConfig/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
