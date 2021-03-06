package io.rancher.service.cluster;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.cluster.FlockerVolumeSource;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface FlockerVolumeSourceService {

    @GET("flockerVolumeSource")
    Call<TypeCollection<FlockerVolumeSource>> list();

    @GET("flockerVolumeSource")
    Call<TypeCollection<FlockerVolumeSource>> list(@QueryMap Filters filters);

    @GET("flockerVolumeSource/{id}")
    Call<FlockerVolumeSource> get(@Path("id") String id);

    @POST("flockerVolumeSource")
    Call<FlockerVolumeSource> create(@Body FlockerVolumeSource flockerVolumeSource);

    @PUT("flockerVolumeSource/{id}")
    Call<FlockerVolumeSource> update(@Path("id") String id, @Body FlockerVolumeSource flockerVolumeSource);

    @DELETE("flockerVolumeSource/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
