package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ProjectResourceQuota;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface ProjectResourceQuotaService {

    @GET("projectResourceQuota")
    Call<TypeCollection<ProjectResourceQuota>> list();

    @GET("projectResourceQuota")
    Call<TypeCollection<ProjectResourceQuota>> list(@QueryMap Filters filters);

    @GET("projectResourceQuota/{id}")
    Call<ProjectResourceQuota> get(@Path("id") String id);

    @POST("projectResourceQuota")
    Call<ProjectResourceQuota> create(@Body ProjectResourceQuota projectResourceQuota);

    @PUT("projectResourceQuota/{id}")
    Call<ProjectResourceQuota> update(@Path("id") String id, @Body ProjectResourceQuota projectResourceQuota);

    @DELETE("projectResourceQuota/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
