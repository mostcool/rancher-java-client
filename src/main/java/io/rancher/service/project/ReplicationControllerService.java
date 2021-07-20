package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.ReplicationController;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface ReplicationControllerService {

    @GET("replicationController")
    Call<TypeCollection<ReplicationController>> list();

    @GET("replicationController")
    Call<TypeCollection<ReplicationController>> list(@QueryMap Filters filters);

    @GET("replicationController/{id}")
    Call<ReplicationController> get(@Path("id") String id);

    @POST("replicationController")
    Call<ReplicationController> create(@Body ReplicationController replicationController);

    @PUT("replicationController/{id}")
    Call<ReplicationController> update(@Path("id") String id, @Body ReplicationController replicationController);

    @DELETE("replicationController/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
