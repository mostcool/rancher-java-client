package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.StatefulSetStatus;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface StatefulSetStatusService {

    @GET("statefulSetStatus")
    Call<TypeCollection<StatefulSetStatus>> list();

    @GET("statefulSetStatus")
    Call<TypeCollection<StatefulSetStatus>> list(@QueryMap Filters filters);

    @GET("statefulSetStatus/{id}")
    Call<StatefulSetStatus> get(@Path("id") String id);

    @POST("statefulSetStatus")
    Call<StatefulSetStatus> create(@Body StatefulSetStatus statefulSetStatus);

    @PUT("statefulSetStatus/{id}")
    Call<StatefulSetStatus> update(@Path("id") String id, @Body StatefulSetStatus statefulSetStatus);

    @DELETE("statefulSetStatus/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
