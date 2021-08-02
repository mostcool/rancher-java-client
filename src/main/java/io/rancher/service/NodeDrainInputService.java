package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.NodeDrainInput;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface NodeDrainInputService {

    @GET("nodeDrainInput")
    Call<TypeCollection<NodeDrainInput>> list();

    @GET("nodeDrainInput")
    Call<TypeCollection<NodeDrainInput>> list(@QueryMap Filters filters);

    @GET("nodeDrainInput/{id}")
    Call<NodeDrainInput> get(@Path("id") String id);

    @POST("nodeDrainInput")
    Call<NodeDrainInput> create(@Body NodeDrainInput nodeDrainInput);

    @PUT("nodeDrainInput/{id}")
    Call<NodeDrainInput> update(@Path("id") String id, @Body NodeDrainInput nodeDrainInput);

    @DELETE("nodeDrainInput/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
