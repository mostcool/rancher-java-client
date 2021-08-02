package io.rancher.service.cluster;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.cluster.TopologySelectorLabelRequirement;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface TopologySelectorLabelRequirementService {

    @GET("topologySelectorLabelRequirement")
    Call<TypeCollection<TopologySelectorLabelRequirement>> list();

    @GET("topologySelectorLabelRequirement")
    Call<TypeCollection<TopologySelectorLabelRequirement>> list(@QueryMap Filters filters);

    @GET("topologySelectorLabelRequirement/{id}")
    Call<TopologySelectorLabelRequirement> get(@Path("id") String id);

    @POST("topologySelectorLabelRequirement")
    Call<TopologySelectorLabelRequirement> create(@Body TopologySelectorLabelRequirement topologySelectorLabelRequirement);

    @PUT("topologySelectorLabelRequirement/{id}")
    Call<TopologySelectorLabelRequirement> update(@Path("id") String id, @Body TopologySelectorLabelRequirement topologySelectorLabelRequirement);

    @DELETE("topologySelectorLabelRequirement/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
