package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.SourceCodeRepositoryStatus;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface SourceCodeRepositoryStatusService {

    @GET("sourceCodeRepositoryStatus")
    Call<TypeCollection<SourceCodeRepositoryStatus>> list();

    @GET("sourceCodeRepositoryStatus")
    Call<TypeCollection<SourceCodeRepositoryStatus>> list(@QueryMap Filters filters);

    @GET("sourceCodeRepositoryStatus/{id}")
    Call<SourceCodeRepositoryStatus> get(@Path("id") String id);

    @POST("sourceCodeRepositoryStatus")
    Call<SourceCodeRepositoryStatus> create(@Body SourceCodeRepositoryStatus sourceCodeRepositoryStatus);

    @PUT("sourceCodeRepositoryStatus/{id}")
    Call<SourceCodeRepositoryStatus> update(@Path("id") String id, @Body SourceCodeRepositoryStatus sourceCodeRepositoryStatus);

    @DELETE("sourceCodeRepositoryStatus/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
