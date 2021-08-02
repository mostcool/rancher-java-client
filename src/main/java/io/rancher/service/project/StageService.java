package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.Stage;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface StageService {

    @GET("stage")
    Call<TypeCollection<Stage>> list();

    @GET("stage")
    Call<TypeCollection<Stage>> list(@QueryMap Filters filters);

    @GET("stage/{id}")
    Call<Stage> get(@Path("id") String id);

    @POST("stage")
    Call<Stage> create(@Body Stage stage);

    @PUT("stage/{id}")
    Call<Stage> update(@Path("id") String id, @Body Stage stage);

    @DELETE("stage/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
