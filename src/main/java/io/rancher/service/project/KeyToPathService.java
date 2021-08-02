package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.KeyToPath;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface KeyToPathService {

    @GET("keyToPath")
    Call<TypeCollection<KeyToPath>> list();

    @GET("keyToPath")
    Call<TypeCollection<KeyToPath>> list(@QueryMap Filters filters);

    @GET("keyToPath/{id}")
    Call<KeyToPath> get(@Path("id") String id);

    @POST("keyToPath")
    Call<KeyToPath> create(@Body KeyToPath keyToPath);

    @PUT("keyToPath/{id}")
    Call<KeyToPath> update(@Path("id") String id, @Body KeyToPath keyToPath);

    @DELETE("keyToPath/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
