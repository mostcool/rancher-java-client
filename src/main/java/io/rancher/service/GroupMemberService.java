package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.GroupMember;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface GroupMemberService {

    @GET("groupMember")
    Call<TypeCollection<GroupMember>> list();

    @GET("groupMember")
    Call<TypeCollection<GroupMember>> list(@QueryMap Filters filters);

    @GET("groupMember/{id}")
    Call<GroupMember> get(@Path("id") String id);

    @POST("groupMember")
    Call<GroupMember> create(@Body GroupMember groupMember);

    @PUT("groupMember/{id}")
    Call<GroupMember> update(@Path("id") String id, @Body GroupMember groupMember);

    @DELETE("groupMember/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
