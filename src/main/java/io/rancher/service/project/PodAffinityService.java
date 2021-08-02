package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.PodAffinity;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface PodAffinityService {

    @GET("podAffinity")
    Call<TypeCollection<PodAffinity>> list();

    @GET("podAffinity")
    Call<TypeCollection<PodAffinity>> list(@QueryMap Filters filters);

    @GET("podAffinity/{id}")
    Call<PodAffinity> get(@Path("id") String id);

    @POST("podAffinity")
    Call<PodAffinity> create(@Body PodAffinity podAffinity);

    @PUT("podAffinity/{id}")
    Call<PodAffinity> update(@Path("id") String id, @Body PodAffinity podAffinity);

    @DELETE("podAffinity/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
