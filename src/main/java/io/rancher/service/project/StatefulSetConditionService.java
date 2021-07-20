package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.StatefulSetCondition;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface StatefulSetConditionService {

    @GET("statefulSetCondition")
    Call<TypeCollection<StatefulSetCondition>> list();

    @GET("statefulSetCondition")
    Call<TypeCollection<StatefulSetCondition>> list(@QueryMap Filters filters);

    @GET("statefulSetCondition/{id}")
    Call<StatefulSetCondition> get(@Path("id") String id);

    @POST("statefulSetCondition")
    Call<StatefulSetCondition> create(@Body StatefulSetCondition statefulSetCondition);

    @PUT("statefulSetCondition/{id}")
    Call<StatefulSetCondition> update(@Path("id") String id, @Body StatefulSetCondition statefulSetCondition);

    @DELETE("statefulSetCondition/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
