package io.rancher.service.cluster;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.cluster.StorageClass;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface StorageClassService {

    @GET("storageClass")
    Call<TypeCollection<StorageClass>> list();

    @GET("storageClass")
    Call<TypeCollection<StorageClass>> list(@QueryMap Filters filters);

    @GET("storageClass/{id}")
    Call<StorageClass> get(@Path("id") String id);

    @POST("storageClass")
    Call<StorageClass> create(@Body StorageClass storageClass);

    @PUT("storageClass/{id}")
    Call<StorageClass> update(@Path("id") String id, @Body StorageClass storageClass);

    @DELETE("storageClass/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
