package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.ProjectedVolumeSource;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface ProjectedVolumeSourceService {

    @GET("projectedVolumeSource")
    Call<TypeCollection<ProjectedVolumeSource>> list();

    @GET("projectedVolumeSource")
    Call<TypeCollection<ProjectedVolumeSource>> list(@QueryMap Filters filters);

    @GET("projectedVolumeSource/{id}")
    Call<ProjectedVolumeSource> get(@Path("id") String id);

    @POST("projectedVolumeSource")
    Call<ProjectedVolumeSource> create(@Body ProjectedVolumeSource projectedVolumeSource);

    @PUT("projectedVolumeSource/{id}")
    Call<ProjectedVolumeSource> update(@Path("id") String id, @Body ProjectedVolumeSource projectedVolumeSource);

    @DELETE("projectedVolumeSource/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
