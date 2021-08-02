package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.StatefulSet;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface StatefulSetService {

    @GET("statefulSet")
    Call<TypeCollection<StatefulSet>> list();

    @GET("statefulSet")
    Call<TypeCollection<StatefulSet>> list(@QueryMap Filters filters);

    @GET("statefulSet/{id}")
    Call<StatefulSet> get(@Path("id") String id);

    @POST("statefulSet")
    Call<StatefulSet> create(@Body StatefulSet statefulSet);

    @PUT("statefulSet/{id}")
    Call<StatefulSet> update(@Path("id") String id, @Body StatefulSet statefulSet);

    @DELETE("statefulSet/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
