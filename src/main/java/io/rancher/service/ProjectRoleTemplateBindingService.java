package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ProjectRoleTemplateBinding;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface ProjectRoleTemplateBindingService {

    @GET("projectRoleTemplateBinding")
    Call<TypeCollection<ProjectRoleTemplateBinding>> list();

    @GET("projectRoleTemplateBinding")
    Call<TypeCollection<ProjectRoleTemplateBinding>> list(@QueryMap Filters filters);

    @GET("projectRoleTemplateBinding/{id}")
    Call<ProjectRoleTemplateBinding> get(@Path("id") String id);

    @POST("projectRoleTemplateBinding")
    Call<ProjectRoleTemplateBinding> create(@Body ProjectRoleTemplateBinding projectRoleTemplateBinding);

    @PUT("projectRoleTemplateBinding/{id}")
    Call<ProjectRoleTemplateBinding> update(@Path("id") String id, @Body ProjectRoleTemplateBinding projectRoleTemplateBinding);

    @DELETE("projectRoleTemplateBinding/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
