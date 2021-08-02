package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.GcePersistentDiskVolumeSource;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface GcePersistentDiskVolumeSourceService {

    @GET("gcePersistentDiskVolumeSource")
    Call<TypeCollection<GcePersistentDiskVolumeSource>> list();

    @GET("gcePersistentDiskVolumeSource")
    Call<TypeCollection<GcePersistentDiskVolumeSource>> list(@QueryMap Filters filters);

    @GET("gcePersistentDiskVolumeSource/{id}")
    Call<GcePersistentDiskVolumeSource> get(@Path("id") String id);

    @POST("gcePersistentDiskVolumeSource")
    Call<GcePersistentDiskVolumeSource> create(@Body GcePersistentDiskVolumeSource gcePersistentDiskVolumeSource);

    @PUT("gcePersistentDiskVolumeSource/{id}")
    Call<GcePersistentDiskVolumeSource> update(@Path("id") String id, @Body GcePersistentDiskVolumeSource gcePersistentDiskVolumeSource);

    @DELETE("gcePersistentDiskVolumeSource/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
