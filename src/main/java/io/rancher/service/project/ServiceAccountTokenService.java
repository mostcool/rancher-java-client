package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.ServiceAccountToken;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface ServiceAccountTokenService {

    @GET("serviceAccountToken")
    Call<TypeCollection<ServiceAccountToken>> list();

    @GET("serviceAccountToken")
    Call<TypeCollection<ServiceAccountToken>> list(@QueryMap Filters filters);

    @GET("serviceAccountToken/{id}")
    Call<ServiceAccountToken> get(@Path("id") String id);

    @POST("serviceAccountToken")
    Call<ServiceAccountToken> create(@Body ServiceAccountToken serviceAccountToken);

    @PUT("serviceAccountToken/{id}")
    Call<ServiceAccountToken> update(@Path("id") String id, @Body ServiceAccountToken serviceAccountToken);

    @DELETE("serviceAccountToken/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
