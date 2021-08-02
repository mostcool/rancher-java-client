package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.NodeTemplate;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface NodeTemplateService {

    @GET("nodeTemplate")
    Call<TypeCollection<NodeTemplate>> list();

    @GET("nodeTemplate")
    Call<TypeCollection<NodeTemplate>> list(@QueryMap Filters filters);

    @GET("nodeTemplate/{id}")
    Call<NodeTemplate> get(@Path("id") String id);

    @POST("nodeTemplate")
    Call<NodeTemplate> create(@Body NodeTemplate nodeTemplate);

    @PUT("nodeTemplate/{id}")
    Call<NodeTemplate> update(@Path("id") String id, @Body NodeTemplate nodeTemplate);

    @DELETE("nodeTemplate/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
