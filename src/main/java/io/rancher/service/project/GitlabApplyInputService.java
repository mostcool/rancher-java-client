package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.GitlabApplyInput;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface GitlabApplyInputService {

    @GET("gitlabApplyInput")
    Call<TypeCollection<GitlabApplyInput>> list();

    @GET("gitlabApplyInput")
    Call<TypeCollection<GitlabApplyInput>> list(@QueryMap Filters filters);

    @GET("gitlabApplyInput/{id}")
    Call<GitlabApplyInput> get(@Path("id") String id);

    @POST("gitlabApplyInput")
    Call<GitlabApplyInput> create(@Body GitlabApplyInput gitlabApplyInput);

    @PUT("gitlabApplyInput/{id}")
    Call<GitlabApplyInput> update(@Path("id") String id, @Body GitlabApplyInput gitlabApplyInput);

    @DELETE("gitlabApplyInput/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
