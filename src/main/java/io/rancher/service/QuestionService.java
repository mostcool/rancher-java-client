package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.Question;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface QuestionService {

    @GET("question")
    Call<TypeCollection<Question>> list();

    @GET("question")
    Call<TypeCollection<Question>> list(@QueryMap Filters filters);

    @GET("question/{id}")
    Call<Question> get(@Path("id") String id);

    @POST("question")
    Call<Question> create(@Body Question question);

    @PUT("question/{id}")
    Call<Question> update(@Path("id") String id, @Body Question question);

    @DELETE("question/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
