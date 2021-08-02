package io.rancher.service.cluster;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.cluster.VolumeNodeAffinity;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface VolumeNodeAffinityService {

    @GET("volumeNodeAffinity")
    Call<TypeCollection<VolumeNodeAffinity>> list();

    @GET("volumeNodeAffinity")
    Call<TypeCollection<VolumeNodeAffinity>> list(@QueryMap Filters filters);

    @GET("volumeNodeAffinity/{id}")
    Call<VolumeNodeAffinity> get(@Path("id") String id);

    @POST("volumeNodeAffinity")
    Call<VolumeNodeAffinity> create(@Body VolumeNodeAffinity volumeNodeAffinity);

    @PUT("volumeNodeAffinity/{id}")
    Call<VolumeNodeAffinity> update(@Path("id") String id, @Body VolumeNodeAffinity volumeNodeAffinity);

    @DELETE("volumeNodeAffinity/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
