package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.ServiceAccountTokenProjection;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface ServiceAccountTokenProjectionService {

    @GET("serviceAccountTokenProjection")
    Call<TypeCollection<ServiceAccountTokenProjection>> list();

    @GET("serviceAccountTokenProjection")
    Call<TypeCollection<ServiceAccountTokenProjection>> list(@QueryMap Filters filters);

    @GET("serviceAccountTokenProjection/{id}")
    Call<ServiceAccountTokenProjection> get(@Path("id") String id);

    @POST("serviceAccountTokenProjection")
    Call<ServiceAccountTokenProjection> create(@Body ServiceAccountTokenProjection serviceAccountTokenProjection);

    @PUT("serviceAccountTokenProjection/{id}")
    Call<ServiceAccountTokenProjection> update(@Path("id") String id, @Body ServiceAccountTokenProjection serviceAccountTokenProjection);

    @DELETE("serviceAccountTokenProjection/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
