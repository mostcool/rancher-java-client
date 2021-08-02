package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.ReplicaSet;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface ReplicaSetService {

    @GET("replicaSet")
    Call<TypeCollection<ReplicaSet>> list();

    @GET("replicaSet")
    Call<TypeCollection<ReplicaSet>> list(@QueryMap Filters filters);

    @GET("replicaSet/{id}")
    Call<ReplicaSet> get(@Path("id") String id);

    @POST("replicaSet")
    Call<ReplicaSet> create(@Body ReplicaSet replicaSet);

    @PUT("replicaSet/{id}")
    Call<ReplicaSet> update(@Path("id") String id, @Body ReplicaSet replicaSet);

    @DELETE("replicaSet/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
