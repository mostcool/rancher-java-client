package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.Subset;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface SubsetService {

    @GET("subset")
    Call<TypeCollection<Subset>> list();

    @GET("subset")
    Call<TypeCollection<Subset>> list(@QueryMap Filters filters);

    @GET("subset/{id}")
    Call<Subset> get(@Path("id") String id);

    @POST("subset")
    Call<Subset> create(@Body Subset subset);

    @PUT("subset/{id}")
    Call<Subset> update(@Path("id") String id, @Body Subset subset);

    @DELETE("subset/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
