package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.ArbitraryFSAccessThroughSMsConfig;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface ArbitraryFSAccessThroughSMsConfigService {

    @GET("arbitraryFSAccessThroughSMsConfig")
    Call<TypeCollection<ArbitraryFSAccessThroughSMsConfig>> list();

    @GET("arbitraryFSAccessThroughSMsConfig")
    Call<TypeCollection<ArbitraryFSAccessThroughSMsConfig>> list(@QueryMap Filters filters);

    @GET("arbitraryFSAccessThroughSMsConfig/{id}")
    Call<ArbitraryFSAccessThroughSMsConfig> get(@Path("id") String id);

    @POST("arbitraryFSAccessThroughSMsConfig")
    Call<ArbitraryFSAccessThroughSMsConfig> create(@Body ArbitraryFSAccessThroughSMsConfig arbitraryFSAccessThroughSMsConfig);

    @PUT("arbitraryFSAccessThroughSMsConfig/{id}")
    Call<ArbitraryFSAccessThroughSMsConfig> update(@Path("id") String id, @Body ArbitraryFSAccessThroughSMsConfig arbitraryFSAccessThroughSMsConfig);

    @DELETE("arbitraryFSAccessThroughSMsConfig/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
