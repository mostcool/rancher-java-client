package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.StringMatch;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface StringMatchService {

    @GET("stringMatch")
    Call<TypeCollection<StringMatch>> list();

    @GET("stringMatch")
    Call<TypeCollection<StringMatch>> list(@QueryMap Filters filters);

    @GET("stringMatch/{id}")
    Call<StringMatch> get(@Path("id") String id);

    @POST("stringMatch")
    Call<StringMatch> create(@Body StringMatch stringMatch);

    @PUT("stringMatch/{id}")
    Call<StringMatch> update(@Path("id") String id, @Body StringMatch stringMatch);

    @DELETE("stringMatch/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
