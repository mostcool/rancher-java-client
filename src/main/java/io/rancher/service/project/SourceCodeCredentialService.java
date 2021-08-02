package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.SourceCodeCredential;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface SourceCodeCredentialService {

    @GET("sourceCodeCredential")
    Call<TypeCollection<SourceCodeCredential>> list();

    @GET("sourceCodeCredential")
    Call<TypeCollection<SourceCodeCredential>> list(@QueryMap Filters filters);

    @GET("sourceCodeCredential/{id}")
    Call<SourceCodeCredential> get(@Path("id") String id);

    @POST("sourceCodeCredential")
    Call<SourceCodeCredential> create(@Body SourceCodeCredential sourceCodeCredential);

    @PUT("sourceCodeCredential/{id}")
    Call<SourceCodeCredential> update(@Path("id") String id, @Body SourceCodeCredential sourceCodeCredential);

    @DELETE("sourceCodeCredential/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
