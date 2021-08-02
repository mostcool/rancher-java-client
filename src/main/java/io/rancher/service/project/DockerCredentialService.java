package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.DockerCredential;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface DockerCredentialService {

    @GET("dockerCredential")
    Call<TypeCollection<DockerCredential>> list();

    @GET("dockerCredential")
    Call<TypeCollection<DockerCredential>> list(@QueryMap Filters filters);

    @GET("dockerCredential/{id}")
    Call<DockerCredential> get(@Path("id") String id);

    @POST("dockerCredential")
    Call<DockerCredential> create(@Body DockerCredential dockerCredential);

    @PUT("dockerCredential/{id}")
    Call<DockerCredential> update(@Path("id") String id, @Body DockerCredential dockerCredential);

    @DELETE("dockerCredential/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
