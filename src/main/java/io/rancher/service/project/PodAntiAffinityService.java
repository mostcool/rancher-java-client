package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.PodAntiAffinity;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface PodAntiAffinityService {

    @GET("podAntiAffinity")
    Call<TypeCollection<PodAntiAffinity>> list();

    @GET("podAntiAffinity")
    Call<TypeCollection<PodAntiAffinity>> list(@QueryMap Filters filters);

    @GET("podAntiAffinity/{id}")
    Call<PodAntiAffinity> get(@Path("id") String id);

    @POST("podAntiAffinity")
    Call<PodAntiAffinity> create(@Body PodAntiAffinity podAntiAffinity);

    @PUT("podAntiAffinity/{id}")
    Call<PodAntiAffinity> update(@Path("id") String id, @Body PodAntiAffinity podAntiAffinity);

    @DELETE("podAntiAffinity/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
