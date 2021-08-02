package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.PersistentVolumeClaimStatus;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface PersistentVolumeClaimStatusService {

    @GET("persistentVolumeClaimStatus")
    Call<TypeCollection<PersistentVolumeClaimStatus>> list();

    @GET("persistentVolumeClaimStatus")
    Call<TypeCollection<PersistentVolumeClaimStatus>> list(@QueryMap Filters filters);

    @GET("persistentVolumeClaimStatus/{id}")
    Call<PersistentVolumeClaimStatus> get(@Path("id") String id);

    @POST("persistentVolumeClaimStatus")
    Call<PersistentVolumeClaimStatus> create(@Body PersistentVolumeClaimStatus persistentVolumeClaimStatus);

    @PUT("persistentVolumeClaimStatus/{id}")
    Call<PersistentVolumeClaimStatus> update(@Path("id") String id, @Body PersistentVolumeClaimStatus persistentVolumeClaimStatus);

    @DELETE("persistentVolumeClaimStatus/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
