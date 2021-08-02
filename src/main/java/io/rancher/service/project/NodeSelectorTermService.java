package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.NodeSelectorTerm;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface NodeSelectorTermService {

    @GET("nodeSelectorTerm")
    Call<TypeCollection<NodeSelectorTerm>> list();

    @GET("nodeSelectorTerm")
    Call<TypeCollection<NodeSelectorTerm>> list(@QueryMap Filters filters);

    @GET("nodeSelectorTerm/{id}")
    Call<NodeSelectorTerm> get(@Path("id") String id);

    @POST("nodeSelectorTerm")
    Call<NodeSelectorTerm> create(@Body NodeSelectorTerm nodeSelectorTerm);

    @PUT("nodeSelectorTerm/{id}")
    Call<NodeSelectorTerm> update(@Path("id") String id, @Body NodeSelectorTerm nodeSelectorTerm);

    @DELETE("nodeSelectorTerm/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
