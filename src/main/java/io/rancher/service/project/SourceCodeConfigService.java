package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.SourceCodeConfig;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface SourceCodeConfigService {

    @GET("sourceCodeConfig")
    Call<TypeCollection<SourceCodeConfig>> list();

    @GET("sourceCodeConfig")
    Call<TypeCollection<SourceCodeConfig>> list(@QueryMap Filters filters);

    @GET("sourceCodeConfig/{id}")
    Call<SourceCodeConfig> get(@Path("id") String id);

    @POST("sourceCodeConfig")
    Call<SourceCodeConfig> create(@Body SourceCodeConfig sourceCodeConfig);

    @PUT("sourceCodeConfig/{id}")
    Call<SourceCodeConfig> update(@Path("id") String id, @Body SourceCodeConfig sourceCodeConfig);

    @DELETE("sourceCodeConfig/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
