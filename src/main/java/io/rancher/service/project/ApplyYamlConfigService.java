package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.ApplyYamlConfig;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface ApplyYamlConfigService {

    @GET("applyYamlConfig")
    Call<TypeCollection<ApplyYamlConfig>> list();

    @GET("applyYamlConfig")
    Call<TypeCollection<ApplyYamlConfig>> list(@QueryMap Filters filters);

    @GET("applyYamlConfig/{id}")
    Call<ApplyYamlConfig> get(@Path("id") String id);

    @POST("applyYamlConfig")
    Call<ApplyYamlConfig> create(@Body ApplyYamlConfig applyYamlConfig);

    @PUT("applyYamlConfig/{id}")
    Call<ApplyYamlConfig> update(@Path("id") String id, @Body ApplyYamlConfig applyYamlConfig);

    @DELETE("applyYamlConfig/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
