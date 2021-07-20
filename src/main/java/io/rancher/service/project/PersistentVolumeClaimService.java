package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.PersistentVolumeClaim;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface PersistentVolumeClaimService {

    @GET("persistentVolumeClaim")
    Call<TypeCollection<PersistentVolumeClaim>> list();

    @GET("persistentVolumeClaim")
    Call<TypeCollection<PersistentVolumeClaim>> list(@QueryMap Filters filters);

    @GET("persistentVolumeClaim/{id}")
    Call<PersistentVolumeClaim> get(@Path("id") String id);

    @POST("persistentVolumeClaim")
    Call<PersistentVolumeClaim> create(@Body PersistentVolumeClaim persistentVolumeClaim);

    @PUT("persistentVolumeClaim/{id}")
    Call<PersistentVolumeClaim> update(@Path("id") String id, @Body PersistentVolumeClaim persistentVolumeClaim);

    @DELETE("persistentVolumeClaim/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
