package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.NodeAffinity;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface NodeAffinityService {

    @GET("nodeAffinity")
    Call<TypeCollection<NodeAffinity>> list();

    @GET("nodeAffinity")
    Call<TypeCollection<NodeAffinity>> list(@QueryMap Filters filters);

    @GET("nodeAffinity/{id}")
    Call<NodeAffinity> get(@Path("id") String id);

    @POST("nodeAffinity")
    Call<NodeAffinity> create(@Body NodeAffinity nodeAffinity);

    @PUT("nodeAffinity/{id}")
    Call<NodeAffinity> update(@Path("id") String id, @Body NodeAffinity nodeAffinity);

    @DELETE("nodeAffinity/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
