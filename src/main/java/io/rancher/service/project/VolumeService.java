package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.Volume;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface VolumeService {

    @GET("volume")
    Call<TypeCollection<Volume>> list();

    @GET("volume")
    Call<TypeCollection<Volume>> list(@QueryMap Filters filters);

    @GET("volume/{id}")
    Call<Volume> get(@Path("id") String id);

    @POST("volume")
    Call<Volume> create(@Body Volume volume);

    @PUT("volume/{id}")
    Call<Volume> update(@Path("id") String id, @Body Volume volume);

    @DELETE("volume/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
