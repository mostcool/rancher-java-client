package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.ReplicationControllerCondition;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface ReplicationControllerConditionService {

    @GET("replicationControllerCondition")
    Call<TypeCollection<ReplicationControllerCondition>> list();

    @GET("replicationControllerCondition")
    Call<TypeCollection<ReplicationControllerCondition>> list(@QueryMap Filters filters);

    @GET("replicationControllerCondition/{id}")
    Call<ReplicationControllerCondition> get(@Path("id") String id);

    @POST("replicationControllerCondition")
    Call<ReplicationControllerCondition> create(@Body ReplicationControllerCondition replicationControllerCondition);

    @PUT("replicationControllerCondition/{id}")
    Call<ReplicationControllerCondition> update(@Path("id") String id, @Body ReplicationControllerCondition replicationControllerCondition);

    @DELETE("replicationControllerCondition/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
