package io.rancher.service.cluster;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.cluster.SecretReference;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface SecretReferenceService {

    @GET("secretReference")
    Call<TypeCollection<SecretReference>> list();

    @GET("secretReference")
    Call<TypeCollection<SecretReference>> list(@QueryMap Filters filters);

    @GET("secretReference/{id}")
    Call<SecretReference> get(@Path("id") String id);

    @POST("secretReference")
    Call<SecretReference> create(@Body SecretReference secretReference);

    @PUT("secretReference/{id}")
    Call<SecretReference> update(@Path("id") String id, @Body SecretReference secretReference);

    @DELETE("secretReference/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
