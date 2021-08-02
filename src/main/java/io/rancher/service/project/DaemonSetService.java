package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.DaemonSet;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface DaemonSetService {

    @GET("daemonSet")
    Call<TypeCollection<DaemonSet>> list();

    @GET("daemonSet")
    Call<TypeCollection<DaemonSet>> list(@QueryMap Filters filters);

    @GET("daemonSet/{id}")
    Call<DaemonSet> get(@Path("id") String id);

    @POST("daemonSet")
    Call<DaemonSet> create(@Body DaemonSet daemonSet);

    @PUT("daemonSet/{id}")
    Call<DaemonSet> update(@Path("id") String id, @Body DaemonSet daemonSet);

    @DELETE("daemonSet/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
