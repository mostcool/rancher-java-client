package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.CorsPolicy;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface CorsPolicyService {

    @GET("corsPolicy")
    Call<TypeCollection<CorsPolicy>> list();

    @GET("corsPolicy")
    Call<TypeCollection<CorsPolicy>> list(@QueryMap Filters filters);

    @GET("corsPolicy/{id}")
    Call<CorsPolicy> get(@Path("id") String id);

    @POST("corsPolicy")
    Call<CorsPolicy> create(@Body CorsPolicy corsPolicy);

    @PUT("corsPolicy/{id}")
    Call<CorsPolicy> update(@Path("id") String id, @Body CorsPolicy corsPolicy);

    @DELETE("corsPolicy/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
