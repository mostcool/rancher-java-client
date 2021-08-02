package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.AttachedVolume;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface AttachedVolumeService {

    @GET("attachedVolume")
    Call<TypeCollection<AttachedVolume>> list();

    @GET("attachedVolume")
    Call<TypeCollection<AttachedVolume>> list(@QueryMap Filters filters);

    @GET("attachedVolume/{id}")
    Call<AttachedVolume> get(@Path("id") String id);

    @POST("attachedVolume")
    Call<AttachedVolume> create(@Body AttachedVolume attachedVolume);

    @PUT("attachedVolume/{id}")
    Call<AttachedVolume> update(@Path("id") String id, @Body AttachedVolume attachedVolume);

    @DELETE("attachedVolume/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
