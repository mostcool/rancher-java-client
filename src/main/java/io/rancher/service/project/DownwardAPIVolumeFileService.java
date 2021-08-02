package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.DownwardAPIVolumeFile;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface DownwardAPIVolumeFileService {

    @GET("downwardAPIVolumeFile")
    Call<TypeCollection<DownwardAPIVolumeFile>> list();

    @GET("downwardAPIVolumeFile")
    Call<TypeCollection<DownwardAPIVolumeFile>> list(@QueryMap Filters filters);

    @GET("downwardAPIVolumeFile/{id}")
    Call<DownwardAPIVolumeFile> get(@Path("id") String id);

    @POST("downwardAPIVolumeFile")
    Call<DownwardAPIVolumeFile> create(@Body DownwardAPIVolumeFile downwardAPIVolumeFile);

    @PUT("downwardAPIVolumeFile/{id}")
    Call<DownwardAPIVolumeFile> update(@Path("id") String id, @Body DownwardAPIVolumeFile downwardAPIVolumeFile);

    @DELETE("downwardAPIVolumeFile/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
