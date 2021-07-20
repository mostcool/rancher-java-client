package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.RestoreFromEtcdBackupInput;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface RestoreFromEtcdBackupInputService {

    @GET("restoreFromEtcdBackupInput")
    Call<TypeCollection<RestoreFromEtcdBackupInput>> list();

    @GET("restoreFromEtcdBackupInput")
    Call<TypeCollection<RestoreFromEtcdBackupInput>> list(@QueryMap Filters filters);

    @GET("restoreFromEtcdBackupInput/{id}")
    Call<RestoreFromEtcdBackupInput> get(@Path("id") String id);

    @POST("restoreFromEtcdBackupInput")
    Call<RestoreFromEtcdBackupInput> create(@Body RestoreFromEtcdBackupInput restoreFromEtcdBackupInput);

    @PUT("restoreFromEtcdBackupInput/{id}")
    Call<RestoreFromEtcdBackupInput> update(@Path("id") String id, @Body RestoreFromEtcdBackupInput restoreFromEtcdBackupInput);

    @DELETE("restoreFromEtcdBackupInput/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
