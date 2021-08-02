package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.PersistentVolumeClaimCondition;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface PersistentVolumeClaimConditionService {

    @GET("persistentVolumeClaimCondition")
    Call<TypeCollection<PersistentVolumeClaimCondition>> list();

    @GET("persistentVolumeClaimCondition")
    Call<TypeCollection<PersistentVolumeClaimCondition>> list(@QueryMap Filters filters);

    @GET("persistentVolumeClaimCondition/{id}")
    Call<PersistentVolumeClaimCondition> get(@Path("id") String id);

    @POST("persistentVolumeClaimCondition")
    Call<PersistentVolumeClaimCondition> create(@Body PersistentVolumeClaimCondition persistentVolumeClaimCondition);

    @PUT("persistentVolumeClaimCondition/{id}")
    Call<PersistentVolumeClaimCondition> update(@Path("id") String id, @Body PersistentVolumeClaimCondition persistentVolumeClaimCondition);

    @DELETE("persistentVolumeClaimCondition/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
