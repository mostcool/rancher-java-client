package io.rancher.service.cluster;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.cluster.HostPathVolumeSource;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface HostPathVolumeSourceService {

    @GET("hostPathVolumeSource")
    Call<TypeCollection<HostPathVolumeSource>> list();

    @GET("hostPathVolumeSource")
    Call<TypeCollection<HostPathVolumeSource>> list(@QueryMap Filters filters);

    @GET("hostPathVolumeSource/{id}")
    Call<HostPathVolumeSource> get(@Path("id") String id);

    @POST("hostPathVolumeSource")
    Call<HostPathVolumeSource> create(@Body HostPathVolumeSource hostPathVolumeSource);

    @PUT("hostPathVolumeSource/{id}")
    Call<HostPathVolumeSource> update(@Path("id") String id, @Body HostPathVolumeSource hostPathVolumeSource);

    @DELETE("hostPathVolumeSource/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
