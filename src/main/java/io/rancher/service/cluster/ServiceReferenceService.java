package io.rancher.service.cluster;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.cluster.ServiceReference;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface ServiceReferenceService {

    @GET("serviceReference")
    Call<TypeCollection<ServiceReference>> list();

    @GET("serviceReference")
    Call<TypeCollection<ServiceReference>> list(@QueryMap Filters filters);

    @GET("serviceReference/{id}")
    Call<ServiceReference> get(@Path("id") String id);

    @POST("serviceReference")
    Call<ServiceReference> create(@Body ServiceReference serviceReference);

    @PUT("serviceReference/{id}")
    Call<ServiceReference> update(@Path("id") String id, @Body ServiceReference serviceReference);

    @DELETE("serviceReference/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
