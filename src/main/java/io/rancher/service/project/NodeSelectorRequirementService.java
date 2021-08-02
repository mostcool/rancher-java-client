package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.NodeSelectorRequirement;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface NodeSelectorRequirementService {

    @GET("nodeSelectorRequirement")
    Call<TypeCollection<NodeSelectorRequirement>> list();

    @GET("nodeSelectorRequirement")
    Call<TypeCollection<NodeSelectorRequirement>> list(@QueryMap Filters filters);

    @GET("nodeSelectorRequirement/{id}")
    Call<NodeSelectorRequirement> get(@Path("id") String id);

    @POST("nodeSelectorRequirement")
    Call<NodeSelectorRequirement> create(@Body NodeSelectorRequirement nodeSelectorRequirement);

    @PUT("nodeSelectorRequirement/{id}")
    Call<NodeSelectorRequirement> update(@Path("id") String id, @Body NodeSelectorRequirement nodeSelectorRequirement);

    @DELETE("nodeSelectorRequirement/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
