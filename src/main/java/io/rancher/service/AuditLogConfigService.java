package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.AuditLogConfig;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface AuditLogConfigService {

    @GET("auditLogConfig")
    Call<TypeCollection<AuditLogConfig>> list();

    @GET("auditLogConfig")
    Call<TypeCollection<AuditLogConfig>> list(@QueryMap Filters filters);

    @GET("auditLogConfig/{id}")
    Call<AuditLogConfig> get(@Path("id") String id);

    @POST("auditLogConfig")
    Call<AuditLogConfig> create(@Body AuditLogConfig auditLogConfig);

    @PUT("auditLogConfig/{id}")
    Call<AuditLogConfig> update(@Path("id") String id, @Body AuditLogConfig auditLogConfig);

    @DELETE("auditLogConfig/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
