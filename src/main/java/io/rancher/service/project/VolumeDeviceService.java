package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.VolumeDevice;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface VolumeDeviceService {

    @GET("volumeDevice")
    Call<TypeCollection<VolumeDevice>> list();

    @GET("volumeDevice")
    Call<TypeCollection<VolumeDevice>> list(@QueryMap Filters filters);

    @GET("volumeDevice/{id}")
    Call<VolumeDevice> get(@Path("id") String id);

    @POST("volumeDevice")
    Call<VolumeDevice> create(@Body VolumeDevice volumeDevice);

    @PUT("volumeDevice/{id}")
    Call<VolumeDevice> update(@Path("id") String id, @Body VolumeDevice volumeDevice);

    @DELETE("volumeDevice/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
