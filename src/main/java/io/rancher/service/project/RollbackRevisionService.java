package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.RollbackRevision;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface RollbackRevisionService {

    @GET("rollbackRevision")
    Call<TypeCollection<RollbackRevision>> list();

    @GET("rollbackRevision")
    Call<TypeCollection<RollbackRevision>> list(@QueryMap Filters filters);

    @GET("rollbackRevision/{id}")
    Call<RollbackRevision> get(@Path("id") String id);

    @POST("rollbackRevision")
    Call<RollbackRevision> create(@Body RollbackRevision rollbackRevision);

    @PUT("rollbackRevision/{id}")
    Call<RollbackRevision> update(@Path("id") String id, @Body RollbackRevision rollbackRevision);

    @DELETE("rollbackRevision/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
