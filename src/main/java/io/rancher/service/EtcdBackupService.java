package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.EtcdBackup;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface EtcdBackupService {

    @GET("etcdBackup")
    Call<TypeCollection<EtcdBackup>> list();

    @GET("etcdBackup")
    Call<TypeCollection<EtcdBackup>> list(@QueryMap Filters filters);

    @GET("etcdBackup/{id}")
    Call<EtcdBackup> get(@Path("id") String id);

    @POST("etcdBackup")
    Call<EtcdBackup> create(@Body EtcdBackup etcdBackup);

    @PUT("etcdBackup/{id}")
    Call<EtcdBackup> update(@Path("id") String id, @Body EtcdBackup etcdBackup);

    @DELETE("etcdBackup/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
