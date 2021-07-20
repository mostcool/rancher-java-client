package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.LabelSelectorRequirement;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface LabelSelectorRequirementService {

    @GET("labelSelectorRequirement")
    Call<TypeCollection<LabelSelectorRequirement>> list();

    @GET("labelSelectorRequirement")
    Call<TypeCollection<LabelSelectorRequirement>> list(@QueryMap Filters filters);

    @GET("labelSelectorRequirement/{id}")
    Call<LabelSelectorRequirement> get(@Path("id") String id);

    @POST("labelSelectorRequirement")
    Call<LabelSelectorRequirement> create(@Body LabelSelectorRequirement labelSelectorRequirement);

    @PUT("labelSelectorRequirement/{id}")
    Call<LabelSelectorRequirement> update(@Path("id") String id, @Body LabelSelectorRequirement labelSelectorRequirement);

    @DELETE("labelSelectorRequirement/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
