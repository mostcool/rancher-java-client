package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.DownwardAPIProjection;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface DownwardAPIProjectionService {

    @GET("downwardAPIProjection")
    Call<TypeCollection<DownwardAPIProjection>> list();

    @GET("downwardAPIProjection")
    Call<TypeCollection<DownwardAPIProjection>> list(@QueryMap Filters filters);

    @GET("downwardAPIProjection/{id}")
    Call<DownwardAPIProjection> get(@Path("id") String id);

    @POST("downwardAPIProjection")
    Call<DownwardAPIProjection> create(@Body DownwardAPIProjection downwardAPIProjection);

    @PUT("downwardAPIProjection/{id}")
    Call<DownwardAPIProjection> update(@Path("id") String id, @Body DownwardAPIProjection downwardAPIProjection);

    @DELETE("downwardAPIProjection/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
