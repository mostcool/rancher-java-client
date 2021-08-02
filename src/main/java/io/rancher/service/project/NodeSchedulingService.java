package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.NodeScheduling;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface NodeSchedulingService {

    @GET("nodeScheduling")
    Call<TypeCollection<NodeScheduling>> list();

    @GET("nodeScheduling")
    Call<TypeCollection<NodeScheduling>> list(@QueryMap Filters filters);

    @GET("nodeScheduling/{id}")
    Call<NodeScheduling> get(@Path("id") String id);

    @POST("nodeScheduling")
    Call<NodeScheduling> create(@Body NodeScheduling nodeScheduling);

    @PUT("nodeScheduling/{id}")
    Call<NodeScheduling> update(@Path("id") String id, @Body NodeScheduling nodeScheduling);

    @DELETE("nodeScheduling/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
