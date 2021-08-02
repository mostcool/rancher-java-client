package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.S3BackupConfig;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface S3BackupConfigService {

    @GET("s3BackupConfig")
    Call<TypeCollection<S3BackupConfig>> list();

    @GET("s3BackupConfig")
    Call<TypeCollection<S3BackupConfig>> list(@QueryMap Filters filters);

    @GET("s3BackupConfig/{id}")
    Call<S3BackupConfig> get(@Path("id") String id);

    @POST("s3BackupConfig")
    Call<S3BackupConfig> create(@Body S3BackupConfig s3BackupConfig);

    @PUT("s3BackupConfig/{id}")
    Call<S3BackupConfig> update(@Path("id") String id, @Body S3BackupConfig s3BackupConfig);

    @DELETE("s3BackupConfig/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
