package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.ReplicaSetStatus;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface ReplicaSetStatusService {

    @GET("replicaSetStatus")
    Call<TypeCollection<ReplicaSetStatus>> list();

    @GET("replicaSetStatus")
    Call<TypeCollection<ReplicaSetStatus>> list(@QueryMap Filters filters);

    @GET("replicaSetStatus/{id}")
    Call<ReplicaSetStatus> get(@Path("id") String id);

    @POST("replicaSetStatus")
    Call<ReplicaSetStatus> create(@Body ReplicaSetStatus replicaSetStatus);

    @PUT("replicaSetStatus/{id}")
    Call<ReplicaSetStatus> update(@Path("id") String id, @Body ReplicaSetStatus replicaSetStatus);

    @DELETE("replicaSetStatus/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
