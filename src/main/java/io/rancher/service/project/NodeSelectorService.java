package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.NodeSelector;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface NodeSelectorService {

    @GET("nodeSelector")
    Call<TypeCollection<NodeSelector>> list();

    @GET("nodeSelector")
    Call<TypeCollection<NodeSelector>> list(@QueryMap Filters filters);

    @GET("nodeSelector/{id}")
    Call<NodeSelector> get(@Path("id") String id);

    @POST("nodeSelector")
    Call<NodeSelector> create(@Body NodeSelector nodeSelector);

    @PUT("nodeSelector/{id}")
    Call<NodeSelector> update(@Path("id") String id, @Body NodeSelector nodeSelector);

    @DELETE("nodeSelector/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
