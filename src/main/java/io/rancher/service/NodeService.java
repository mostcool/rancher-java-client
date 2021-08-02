package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.Node;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface NodeService {

    @GET("node")
    Call<TypeCollection<Node>> list();

    @GET("node")
    Call<TypeCollection<Node>> list(@QueryMap Filters filters);

    @GET("node/{id}")
    Call<Node> get(@Path("id") String id);

    @POST("node")
    Call<Node> create(@Body Node node);

    @PUT("node/{id}")
    Call<Node> update(@Path("id") String id, @Body Node node);

    @DELETE("node/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
