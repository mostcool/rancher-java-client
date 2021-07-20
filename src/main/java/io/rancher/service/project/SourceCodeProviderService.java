package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.SourceCodeProvider;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface SourceCodeProviderService {

    @GET("sourceCodeProvider")
    Call<TypeCollection<SourceCodeProvider>> list();

    @GET("sourceCodeProvider")
    Call<TypeCollection<SourceCodeProvider>> list(@QueryMap Filters filters);

    @GET("sourceCodeProvider/{id}")
    Call<SourceCodeProvider> get(@Path("id") String id);

    @POST("sourceCodeProvider")
    Call<SourceCodeProvider> create(@Body SourceCodeProvider sourceCodeProvider);

    @PUT("sourceCodeProvider/{id}")
    Call<SourceCodeProvider> update(@Path("id") String id, @Body SourceCodeProvider sourceCodeProvider);

    @DELETE("sourceCodeProvider/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
