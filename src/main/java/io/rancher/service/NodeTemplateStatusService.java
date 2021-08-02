package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.NodeTemplateStatus;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface NodeTemplateStatusService {

    @GET("nodeTemplateStatus")
    Call<TypeCollection<NodeTemplateStatus>> list();

    @GET("nodeTemplateStatus")
    Call<TypeCollection<NodeTemplateStatus>> list(@QueryMap Filters filters);

    @GET("nodeTemplateStatus/{id}")
    Call<NodeTemplateStatus> get(@Path("id") String id);

    @POST("nodeTemplateStatus")
    Call<NodeTemplateStatus> create(@Body NodeTemplateStatus nodeTemplateStatus);

    @PUT("nodeTemplateStatus/{id}")
    Call<NodeTemplateStatus> update(@Path("id") String id, @Body NodeTemplateStatus nodeTemplateStatus);

    @DELETE("nodeTemplateStatus/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
