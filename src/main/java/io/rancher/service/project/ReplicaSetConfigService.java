package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.ReplicaSetConfig;
import okhttp3.ResponseBody;
import retrofit2.Call;
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
    Call<ResponseBody> delete(@Path("id") String id);
}
