package com.codelab.newsapp;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by SniperDW on 12/21/2016.
 */

public class APIHelper {

    public static Retrofit initializeRetrofit() {
        return new Retrofit.Builder()
                .baseUrl(Consts.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static PostsInterface getPostsInterface() {
        Retrofit retrofit = initializeRetrofit();
        PostsInterface postsInterface = retrofit.create(PostsInterface.class);
        return postsInterface;
    }

}
