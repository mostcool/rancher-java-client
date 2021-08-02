package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.VsphereVirtualDiskVolumeSource;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface VsphereVirtualDiskVolumeSourceService {

    @GET("vsphereVirtualDiskVolumeSource")
    Call<TypeCollection<VsphereVirtualDiskVolumeSource>> list();

    @GET("vsphereVirtualDiskVolumeSource")
    Call<TypeCollection<VsphereVirtualDiskVolumeSource>> list(@QueryMap Filters filters);

    @GET("vsphereVirtualDiskVolumeSource/{id}")
    Call<VsphereVirtualDiskVolumeSource> get(@Path("id") String id);

    @POST("vsphereVirtualDiskVolumeSource")
    Call<VsphereVirtualDiskVolumeSource> create(@Body VsphereVirtualDiskVolumeSource vsphereVirtualDiskVolumeSource);

    @PUT("vsphereVirtualDiskVolumeSource/{id}")
    Call<VsphereVirtualDiskVolumeSource> update(@Path("id") String id, @Body VsphereVirtualDiskVolumeSource vsphereVirtualDiskVolumeSource);

    @DELETE("vsphereVirtualDiskVolumeSource/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
