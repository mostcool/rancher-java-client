package io.rancher.service.cluster;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.cluster.LocalVolumeSource;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface LocalVolumeSourceService {

    @GET("localVolumeSource")
    Call<TypeCollection<LocalVolumeSource>> list();

    @GET("localVolumeSource")
    Call<TypeCollection<LocalVolumeSource>> list(@QueryMap Filters filters);

    @GET("localVolumeSource/{id}")
    Call<LocalVolumeSource> get(@Path("id") String id);

    @POST("localVolumeSource")
    Call<LocalVolumeSource> create(@Body LocalVolumeSource localVolumeSource);

    @PUT("localVolumeSource/{id}")
    Call<LocalVolumeSource> update(@Path("id") String id, @Body LocalVolumeSource localVolumeSource);

    @DELETE("localVolumeSource/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
