package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.BackupConfig;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface BackupConfigService {

    @GET("backupConfig")
    Call<TypeCollection<BackupConfig>> list();

    @GET("backupConfig")
    Call<TypeCollection<BackupConfig>> list(@QueryMap Filters filters);

    @GET("backupConfig/{id}")
    Call<BackupConfig> get(@Path("id") String id);

    @POST("backupConfig")
    Call<BackupConfig> create(@Body BackupConfig backupConfig);

    @PUT("backupConfig/{id}")
    Call<BackupConfig> update(@Path("id") String id, @Body BackupConfig backupConfig);

    @DELETE("backupConfig/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
