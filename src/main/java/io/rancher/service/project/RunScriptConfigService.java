package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.RunScriptConfig;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface RunScriptConfigService {

    @GET("runScriptConfig")
    Call<TypeCollection<RunScriptConfig>> list();

    @GET("runScriptConfig")
    Call<TypeCollection<RunScriptConfig>> list(@QueryMap Filters filters);

    @GET("runScriptConfig/{id}")
    Call<RunScriptConfig> get(@Path("id") String id);

    @POST("runScriptConfig")
    Call<RunScriptConfig> create(@Body RunScriptConfig runScriptConfig);

    @PUT("runScriptConfig/{id}")
    Call<RunScriptConfig> update(@Path("id") String id, @Body RunScriptConfig runScriptConfig);

    @DELETE("runScriptConfig/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
