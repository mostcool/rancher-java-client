package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.Answer;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface AnswerService {

    @GET("answer")
    Call<TypeCollection<Answer>> list();

    @GET("answer")
    Call<TypeCollection<Answer>> list(@QueryMap Filters filters);

    @GET("answer/{id}")
    Call<Answer> get(@Path("id") String id);

    @POST("answer")
    Call<Answer> create(@Body Answer answer);

    @PUT("answer/{id}")
    Call<Answer> update(@Path("id") String id, @Body Answer answer);

    @DELETE("answer/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
