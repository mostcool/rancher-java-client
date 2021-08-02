package io.rancher.service.cluster;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.cluster.ObjectReference;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface ObjectReferenceService {

    @GET("objectReference")
    Call<TypeCollection<ObjectReference>> list();

    @GET("objectReference")
    Call<TypeCollection<ObjectReference>> list(@QueryMap Filters filters);

    @GET("objectReference/{id}")
    Call<ObjectReference> get(@Path("id") String id);

    @POST("objectReference")
    Call<ObjectReference> create(@Body ObjectReference objectReference);

    @PUT("objectReference/{id}")
    Call<ObjectReference> update(@Path("id") String id, @Body ObjectReference objectReference);

    @DELETE("objectReference/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
