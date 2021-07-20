package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.AuthUserInput;
import io.rancher.type.project.GithubProvider;
import io.rancher.type.project.SourceCodeCredential;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface GithubProviderService {

    @GET("githubProvider")
    Call<TypeCollection<GithubProvider>> list();

    @GET("githubProvider")
    Call<TypeCollection<GithubProvider>> list(@QueryMap Filters filters);

    @GET("githubProvider/{id}")
    Call<GithubProvider> get(@Path("id") String id);

    @POST("githubProvider")
    Call<GithubProvider> create(@Body GithubProvider githubProvider);

    @PUT("githubProvider/{id}")
    Call<GithubProvider> update(@Path("id") String id, @Body GithubProvider githubProvider);

    @DELETE("githubProvider/{id}")
    Call<Response> delete(@Path("id") String id);
    
    @POST("githubProvider/{id}?action=login")
    Call<SourceCodeCredential> login(@Path("id") String id, @Body AuthUserInput authUserInput);
    
}
