package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.ReplicaSetCondition;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface ReplicaSetConditionService {

    @GET("replicaSetCondition")
    Call<TypeCollection<ReplicaSetCondition>> list();

    @GET("replicaSetCondition")
    Call<TypeCollection<ReplicaSetCondition>> list(@QueryMap Filters filters);

    @GET("replicaSetCondition/{id}")
    Call<ReplicaSetCondition> get(@Path("id") String id);

    @POST("replicaSetCondition")
    Call<ReplicaSetCondition> create(@Body ReplicaSetCondition replicaSetCondition);

    @PUT("replicaSetCondition/{id}")
    Call<ReplicaSetCondition> update(@Path("id") String id, @Body ReplicaSetCondition replicaSetCondition);

    @DELETE("replicaSetCondition/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
