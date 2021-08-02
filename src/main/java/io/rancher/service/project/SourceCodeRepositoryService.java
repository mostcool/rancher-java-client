package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.SourceCodeRepository;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface SourceCodeRepositoryService {

    @GET("sourceCodeRepository")
    Call<TypeCollection<SourceCodeRepository>> list();

    @GET("sourceCodeRepository")
    Call<TypeCollection<SourceCodeRepository>> list(@QueryMap Filters filters);

    @GET("sourceCodeRepository/{id}")
    Call<SourceCodeRepository> get(@Path("id") String id);

    @POST("sourceCodeRepository")
    Call<SourceCodeRepository> create(@Body SourceCodeRepository sourceCodeRepository);

    @PUT("sourceCodeRepository/{id}")
    Call<SourceCodeRepository> update(@Path("id") String id, @Body SourceCodeRepository sourceCodeRepository);

    @DELETE("sourceCodeRepository/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
