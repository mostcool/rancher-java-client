package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.DaemonSetConfig;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface DaemonSetConfigService {

    @GET("daemonSetConfig")
    Call<TypeCollection<DaemonSetConfig>> list();

    @GET("daemonSetConfig")
    Call<TypeCollection<DaemonSetConfig>> list(@QueryMap Filters filters);

    @GET("daemonSetConfig/{id}")
    Call<DaemonSetConfig> get(@Path("id") String id);

    @POST("daemonSetConfig")
    Call<DaemonSetConfig> create(@Body DaemonSetConfig daemonSetConfig);

    @PUT("daemonSetConfig/{id}")
    Call<DaemonSetConfig> update(@Path("id") String id, @Body DaemonSetConfig daemonSetConfig);

    @DELETE("daemonSetConfig/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
