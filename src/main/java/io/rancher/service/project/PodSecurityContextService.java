package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.PodSecurityContext;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface PodSecurityContextService {

    @GET("podSecurityContext")
    Call<TypeCollection<PodSecurityContext>> list();

    @GET("podSecurityContext")
    Call<TypeCollection<PodSecurityContext>> list(@QueryMap Filters filters);

    @GET("podSecurityContext/{id}")
    Call<PodSecurityContext> get(@Path("id") String id);

    @POST("podSecurityContext")
    Call<PodSecurityContext> create(@Body PodSecurityContext podSecurityContext);

    @PUT("podSecurityContext/{id}")
    Call<PodSecurityContext> update(@Path("id") String id, @Body PodSecurityContext podSecurityContext);

    @DELETE("podSecurityContext/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
