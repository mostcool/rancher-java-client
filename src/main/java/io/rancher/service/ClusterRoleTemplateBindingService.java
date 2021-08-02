package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ClusterRoleTemplateBinding;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface ClusterRoleTemplateBindingService {

    @GET("clusterRoleTemplateBinding")
    Call<TypeCollection<ClusterRoleTemplateBinding>> list();

    @GET("clusterRoleTemplateBinding")
    Call<TypeCollection<ClusterRoleTemplateBinding>> list(@QueryMap Filters filters);

    @GET("clusterRoleTemplateBinding/{id}")
    Call<ClusterRoleTemplateBinding> get(@Path("id") String id);

    @POST("clusterRoleTemplateBinding")
    Call<ClusterRoleTemplateBinding> create(@Body ClusterRoleTemplateBinding clusterRoleTemplateBinding);

    @PUT("clusterRoleTemplateBinding/{id}")
    Call<ClusterRoleTemplateBinding> update(@Path("id") String id, @Body ClusterRoleTemplateBinding clusterRoleTemplateBinding);

    @DELETE("clusterRoleTemplateBinding/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
