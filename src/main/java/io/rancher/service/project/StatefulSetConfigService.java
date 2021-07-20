package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.StatefulSetConfig;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface StatefulSetConfigService {

    @GET("statefulSetConfig")
    Call<TypeCollection<StatefulSetConfig>> list();

    @GET("statefulSetConfig")
    Call<TypeCollection<StatefulSetConfig>> list(@QueryMap Filters filters);

    @GET("statefulSetConfig/{id}")
    Call<StatefulSetConfig> get(@Path("id") String id);

    @POST("statefulSetConfig")
    Call<StatefulSetConfig> create(@Body StatefulSetConfig statefulSetConfig);

    @PUT("statefulSetConfig/{id}")
    Call<StatefulSetConfig> update(@Path("id") String id, @Body StatefulSetConfig statefulSetConfig);

    @DELETE("statefulSetConfig/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
