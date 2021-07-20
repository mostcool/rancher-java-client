package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.AuthUserInput;
import io.rancher.type.project.GitlabProvider;
import io.rancher.type.project.SourceCodeCredential;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface GitlabProviderService {

    @GET("gitlabProvider")
    Call<TypeCollection<GitlabProvider>> list();

    @GET("gitlabProvider")
    Call<TypeCollection<GitlabProvider>> list(@QueryMap Filters filters);

    @GET("gitlabProvider/{id}")
    Call<GitlabProvider> get(@Path("id") String id);

    @POST("gitlabProvider")
    Call<GitlabProvider> create(@Body GitlabProvider gitlabProvider);

    @PUT("gitlabProvider/{id}")
    Call<GitlabProvider> update(@Path("id") String id, @Body GitlabProvider gitlabProvider);

    @DELETE("gitlabProvider/{id}")
    Call<Response> delete(@Path("id") String id);
    
    @POST("gitlabProvider/{id}?action=login")
    Call<SourceCodeCredential> login(@Path("id") String id, @Body AuthUserInput authUserInput);
    
}
