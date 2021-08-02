package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.GitRepoVolumeSource;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface GitRepoVolumeSourceService {

    @GET("gitRepoVolumeSource")
    Call<TypeCollection<GitRepoVolumeSource>> list();

    @GET("gitRepoVolumeSource")
    Call<TypeCollection<GitRepoVolumeSource>> list(@QueryMap Filters filters);

    @GET("gitRepoVolumeSource/{id}")
    Call<GitRepoVolumeSource> get(@Path("id") String id);

    @POST("gitRepoVolumeSource")
    Call<GitRepoVolumeSource> create(@Body GitRepoVolumeSource gitRepoVolumeSource);

    @PUT("gitRepoVolumeSource/{id}")
    Call<GitRepoVolumeSource> update(@Path("id") String id, @Body GitRepoVolumeSource gitRepoVolumeSource);

    @DELETE("gitRepoVolumeSource/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
