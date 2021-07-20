package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ImportYamlOutput;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface ImportYamlOutputService {

    @GET("importYamlOutput")
    Call<TypeCollection<ImportYamlOutput>> list();

    @GET("importYamlOutput")
    Call<TypeCollection<ImportYamlOutput>> list(@QueryMap Filters filters);

    @GET("importYamlOutput/{id}")
    Call<ImportYamlOutput> get(@Path("id") String id);

    @POST("importYamlOutput")
    Call<ImportYamlOutput> create(@Body ImportYamlOutput importYamlOutput);

    @PUT("importYamlOutput/{id}")
    Call<ImportYamlOutput> update(@Path("id") String id, @Body ImportYamlOutput importYamlOutput);

    @DELETE("importYamlOutput/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
