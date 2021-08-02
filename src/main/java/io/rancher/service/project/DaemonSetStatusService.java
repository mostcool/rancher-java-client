package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.DaemonSetStatus;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface DaemonSetStatusService {

    @GET("daemonSetStatus")
    Call<TypeCollection<DaemonSetStatus>> list();

    @GET("daemonSetStatus")
    Call<TypeCollection<DaemonSetStatus>> list(@QueryMap Filters filters);

    @GET("daemonSetStatus/{id}")
    Call<DaemonSetStatus> get(@Path("id") String id);

    @POST("daemonSetStatus")
    Call<DaemonSetStatus> create(@Body DaemonSetStatus daemonSetStatus);

    @PUT("daemonSetStatus/{id}")
    Call<DaemonSetStatus> update(@Path("id") String id, @Body DaemonSetStatus daemonSetStatus);

    @DELETE("daemonSetStatus/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
