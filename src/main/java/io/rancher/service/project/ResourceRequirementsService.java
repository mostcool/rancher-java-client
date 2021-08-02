package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.ResourceRequirements;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface ResourceRequirementsService {

    @GET("resourceRequirements")
    Call<TypeCollection<ResourceRequirements>> list();

    @GET("resourceRequirements")
    Call<TypeCollection<ResourceRequirements>> list(@QueryMap Filters filters);

    @GET("resourceRequirements/{id}")
    Call<ResourceRequirements> get(@Path("id") String id);

    @POST("resourceRequirements")
    Call<ResourceRequirements> create(@Body ResourceRequirements resourceRequirements);

    @PUT("resourceRequirements/{id}")
    Call<ResourceRequirements> update(@Path("id") String id, @Body ResourceRequirements resourceRequirements);

    @DELETE("resourceRequirements/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
