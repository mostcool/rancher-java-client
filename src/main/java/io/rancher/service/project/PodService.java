package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.Pod;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface PodService {

    @GET("pod")
    Call<TypeCollection<Pod>> list();

    @GET("pod")
    Call<TypeCollection<Pod>> list(@QueryMap Filters filters);

    @GET("pod/{id}")
    Call<Pod> get(@Path("id") String id);

    @POST("pod")
    Call<Pod> create(@Body Pod pod);

    @PUT("pod/{id}")
    Call<Pod> update(@Path("id") String id, @Body Pod pod);

    @DELETE("pod/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
