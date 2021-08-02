package io.rancher.service.cluster;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.cluster.AwsElasticBlockStoreVolumeSource;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface AwsElasticBlockStoreVolumeSourceService {

    @GET("awsElasticBlockStoreVolumeSource")
    Call<TypeCollection<AwsElasticBlockStoreVolumeSource>> list();

    @GET("awsElasticBlockStoreVolumeSource")
    Call<TypeCollection<AwsElasticBlockStoreVolumeSource>> list(@QueryMap Filters filters);

    @GET("awsElasticBlockStoreVolumeSource/{id}")
    Call<AwsElasticBlockStoreVolumeSource> get(@Path("id") String id);

    @POST("awsElasticBlockStoreVolumeSource")
    Call<AwsElasticBlockStoreVolumeSource> create(@Body AwsElasticBlockStoreVolumeSource awsElasticBlockStoreVolumeSource);

    @PUT("awsElasticBlockStoreVolumeSource/{id}")
    Call<AwsElasticBlockStoreVolumeSource> update(@Path("id") String id, @Body AwsElasticBlockStoreVolumeSource awsElasticBlockStoreVolumeSource);

    @DELETE("awsElasticBlockStoreVolumeSource/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
