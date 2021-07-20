package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ActiveDirectoryTestAndApplyInput;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface ActiveDirectoryTestAndApplyInputService {

    @GET("activeDirectoryTestAndApplyInput")
    Call<TypeCollection<ActiveDirectoryTestAndApplyInput>> list();

    @GET("activeDirectoryTestAndApplyInput")
    Call<TypeCollection<ActiveDirectoryTestAndApplyInput>> list(@QueryMap Filters filters);

    @GET("activeDirectoryTestAndApplyInput/{id}")
    Call<ActiveDirectoryTestAndApplyInput> get(@Path("id") String id);

    @POST("activeDirectoryTestAndApplyInput")
    Call<ActiveDirectoryTestAndApplyInput> create(@Body ActiveDirectoryTestAndApplyInput activeDirectoryTestAndApplyInput);

    @PUT("activeDirectoryTestAndApplyInput/{id}")
    Call<ActiveDirectoryTestAndApplyInput> update(@Path("id") String id, @Body ActiveDirectoryTestAndApplyInput activeDirectoryTestAndApplyInput);

    @DELETE("activeDirectoryTestAndApplyInput/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
