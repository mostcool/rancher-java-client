package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.DaemonSetCondition;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface DaemonSetConditionService {

    @GET("daemonSetCondition")
    Call<TypeCollection<DaemonSetCondition>> list();

    @GET("daemonSetCondition")
    Call<TypeCollection<DaemonSetCondition>> list(@QueryMap Filters filters);

    @GET("daemonSetCondition/{id}")
    Call<DaemonSetCondition> get(@Path("id") String id);

    @POST("daemonSetCondition")
    Call<DaemonSetCondition> create(@Body DaemonSetCondition daemonSetCondition);

    @PUT("daemonSetCondition/{id}")
    Call<DaemonSetCondition> update(@Path("id") String id, @Body DaemonSetCondition daemonSetCondition);

    @DELETE("daemonSetCondition/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
