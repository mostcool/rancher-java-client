package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.FlexVolumeSource;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface FlexVolumeSourceService {

    @GET("flexVolumeSource")
    Call<TypeCollection<FlexVolumeSource>> list();

    @GET("flexVolumeSource")
    Call<TypeCollection<FlexVolumeSource>> list(@QueryMap Filters filters);

    @GET("flexVolumeSource/{id}")
    Call<FlexVolumeSource> get(@Path("id") String id);

    @POST("flexVolumeSource")
    Call<FlexVolumeSource> create(@Body FlexVolumeSource flexVolumeSource);

    @PUT("flexVolumeSource/{id}")
    Call<FlexVolumeSource> update(@Path("id") String id, @Body FlexVolumeSource flexVolumeSource);

    @DELETE("flexVolumeSource/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
