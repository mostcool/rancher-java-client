package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.Constraint;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface ConstraintService {

    @GET("constraint")
    Call<TypeCollection<Constraint>> list();

    @GET("constraint")
    Call<TypeCollection<Constraint>> list(@QueryMap Filters filters);

    @GET("constraint/{id}")
    Call<Constraint> get(@Path("id") String id);

    @POST("constraint")
    Call<Constraint> create(@Body Constraint constraint);

    @PUT("constraint/{id}")
    Call<Constraint> update(@Path("id") String id, @Body Constraint constraint);

    @DELETE("constraint/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
