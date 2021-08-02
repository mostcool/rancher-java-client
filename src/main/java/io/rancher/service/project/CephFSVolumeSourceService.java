package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.CephFSVolumeSource;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface CephFSVolumeSourceService {

    @GET("cephFSVolumeSource")
    Call<TypeCollection<CephFSVolumeSource>> list();

    @GET("cephFSVolumeSource")
    Call<TypeCollection<CephFSVolumeSource>> list(@QueryMap Filters filters);

    @GET("cephFSVolumeSource/{id}")
    Call<CephFSVolumeSource> get(@Path("id") String id);

    @POST("cephFSVolumeSource")
    Call<CephFSVolumeSource> create(@Body CephFSVolumeSource cephFSVolumeSource);

    @PUT("cephFSVolumeSource/{id}")
    Call<CephFSVolumeSource> update(@Path("id") String id, @Body CephFSVolumeSource cephFSVolumeSource);

    @DELETE("cephFSVolumeSource/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
