package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.DestinationRule;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface DestinationRuleService {

    @GET("destinationRule")
    Call<TypeCollection<DestinationRule>> list();

    @GET("destinationRule")
    Call<TypeCollection<DestinationRule>> list(@QueryMap Filters filters);

    @GET("destinationRule/{id}")
    Call<DestinationRule> get(@Path("id") String id);

    @POST("destinationRule")
    Call<DestinationRule> create(@Body DestinationRule destinationRule);

    @PUT("destinationRule/{id}")
    Call<DestinationRule> update(@Path("id") String id, @Body DestinationRule destinationRule);

    @DELETE("destinationRule/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
