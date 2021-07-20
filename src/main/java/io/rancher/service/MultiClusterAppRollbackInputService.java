package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.MultiClusterAppRollbackInput;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface MultiClusterAppRollbackInputService {

    @GET("multiClusterAppRollbackInput")
    Call<TypeCollection<MultiClusterAppRollbackInput>> list();

    @GET("multiClusterAppRollbackInput")
    Call<TypeCollection<MultiClusterAppRollbackInput>> list(@QueryMap Filters filters);

    @GET("multiClusterAppRollbackInput/{id}")
    Call<MultiClusterAppRollbackInput> get(@Path("id") String id);

    @POST("multiClusterAppRollbackInput")
    Call<MultiClusterAppRollbackInput> create(@Body MultiClusterAppRollbackInput multiClusterAppRollbackInput);

    @PUT("multiClusterAppRollbackInput/{id}")
    Call<MultiClusterAppRollbackInput> update(@Path("id") String id, @Body MultiClusterAppRollbackInput multiClusterAppRollbackInput);

    @DELETE("multiClusterAppRollbackInput/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
