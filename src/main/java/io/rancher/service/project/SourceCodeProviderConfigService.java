package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.SourceCodeProviderConfig;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface SourceCodeProviderConfigService {

    @GET("sourceCodeProviderConfig")
    Call<TypeCollection<SourceCodeProviderConfig>> list();

    @GET("sourceCodeProviderConfig")
    Call<TypeCollection<SourceCodeProviderConfig>> list(@QueryMap Filters filters);

    @GET("sourceCodeProviderConfig/{id}")
    Call<SourceCodeProviderConfig> get(@Path("id") String id);

    @POST("sourceCodeProviderConfig")
    Call<SourceCodeProviderConfig> create(@Body SourceCodeProviderConfig sourceCodeProviderConfig);

    @PUT("sourceCodeProviderConfig/{id}")
    Call<SourceCodeProviderConfig> update(@Path("id") String id, @Body SourceCodeProviderConfig sourceCodeProviderConfig);

    @DELETE("sourceCodeProviderConfig/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
