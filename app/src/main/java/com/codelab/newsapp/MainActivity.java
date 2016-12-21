package com.codelab.newsapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.Toast;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {


    @BindView(R.id.posts_list)
    RecyclerView postsList;
    @BindView(R.id.progressBar)
    ProgressBar progressBar;
    @BindView(R.id.activity_main)
    FrameLayout activityMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


        APIHelper.getPostsInterface().getLastPosts(1, 5).enqueue(new Callback<AllPostsResponse>() {
            @Override
            public void onResponse(Call<AllPostsResponse> call, Response<AllPostsResponse> response) {
                fillData(response.body().getResult());
                Toast.makeText(MainActivity.this, "Data Loaded", Toast.LENGTH_SHORT).show();
                progressBar.setVisibility(View.GONE);
            }

            @Override
            public void onFailure(Call<AllPostsResponse> call, Throwable t) {
                t.printStackTrace();
                Toast.makeText(MainActivity.this, "Loading Failed", Toast.LENGTH_SHORT).show();
                progressBar.setVisibility(View.GONE);
            }
        });

    }

    private void fillData(List<Post> result) {
        postsList.setLayoutManager(new LinearLayoutManager(this)); //For vertical lists
        postsList.setAdapter(new PostsAdapter(this, result));
    }

}
