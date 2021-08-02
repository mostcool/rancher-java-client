package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.OutlierDetection;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface OutlierDetectionService {

    @GET("outlierDetection")
    Call<TypeCollection<OutlierDetection>> list();

    @GET("outlierDetection")
    Call<TypeCollection<OutlierDetection>> list(@QueryMap Filters filters);

    @GET("outlierDetection/{id}")
    Call<OutlierDetection> get(@Path("id") String id);

    @POST("outlierDetection")
    Call<OutlierDetection> create(@Body OutlierDetection outlierDetection);

    @PUT("outlierDetection/{id}")
    Call<OutlierDetection> update(@Path("id") String id, @Body OutlierDetection outlierDetection);

    @DELETE("outlierDetection/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
