package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.ReplicationControllerStatus;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface ReplicationControllerStatusService {

    @GET("replicationControllerStatus")
    Call<TypeCollection<ReplicationControllerStatus>> list();

    @GET("replicationControllerStatus")
    Call<TypeCollection<ReplicationControllerStatus>> list(@QueryMap Filters filters);

    @GET("replicationControllerStatus/{id}")
    Call<ReplicationControllerStatus> get(@Path("id") String id);

    @POST("replicationControllerStatus")
    Call<ReplicationControllerStatus> create(@Body ReplicationControllerStatus replicationControllerStatus);

    @PUT("replicationControllerStatus/{id}")
    Call<ReplicationControllerStatus> update(@Path("id") String id, @Body ReplicationControllerStatus replicationControllerStatus);

    @DELETE("replicationControllerStatus/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
