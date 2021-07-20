package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.EtcdBackupCondition;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface EtcdBackupConditionService {

    @GET("etcdBackupCondition")
    Call<TypeCollection<EtcdBackupCondition>> list();

    @GET("etcdBackupCondition")
    Call<TypeCollection<EtcdBackupCondition>> list(@QueryMap Filters filters);

    @GET("etcdBackupCondition/{id}")
    Call<EtcdBackupCondition> get(@Path("id") String id);

    @POST("etcdBackupCondition")
    Call<EtcdBackupCondition> create(@Body EtcdBackupCondition etcdBackupCondition);

    @PUT("etcdBackupCondition/{id}")
    Call<EtcdBackupCondition> update(@Path("id") String id, @Body EtcdBackupCondition etcdBackupCondition);

    @DELETE("etcdBackupCondition/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
