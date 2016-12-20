package com.codelab.newsapp;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by SniperDW on 12/20/2016.
 */

public interface PostsInterface {

    @GET("last_posts/")
    Call<AllPostsResponse> getLastPosts(@Query("callpage") int callpage, @Query("perpage") int perpage);

}
