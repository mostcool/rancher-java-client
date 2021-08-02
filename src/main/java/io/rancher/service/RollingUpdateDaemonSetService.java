package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.RollingUpdateDaemonSet;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface RollingUpdateDaemonSetService {

    @GET("rollingUpdateDaemonSet")
    Call<TypeCollection<RollingUpdateDaemonSet>> list();

    @GET("rollingUpdateDaemonSet")
    Call<TypeCollection<RollingUpdateDaemonSet>> list(@QueryMap Filters filters);

    @GET("rollingUpdateDaemonSet/{id}")
    Call<RollingUpdateDaemonSet> get(@Path("id") String id);

    @POST("rollingUpdateDaemonSet")
    Call<RollingUpdateDaemonSet> create(@Body RollingUpdateDaemonSet rollingUpdateDaemonSet);

    @PUT("rollingUpdateDaemonSet/{id}")
    Call<RollingUpdateDaemonSet> update(@Path("id") String id, @Body RollingUpdateDaemonSet rollingUpdateDaemonSet);

    @DELETE("rollingUpdateDaemonSet/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
