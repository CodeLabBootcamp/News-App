package com.codelab.newsapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SinglePostActivity extends AppCompatActivity {

    @BindView(R.id.post_image)
    ImageView postImage;
    @BindView(R.id.post_title)
    TextView postTitle;
    @BindView(R.id.post_author)
    TextView postAuthor;
    @BindView(R.id.post_date)
    TextView postDate;
    @BindView(R.id.post_content)
    TextView postContent;
    @BindView(R.id.activity_single_post)
    LinearLayout activitySinglePost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_post);
        ButterKnife.bind(this);

        String id = getIntent().getStringExtra("ID");

        APIHelper.getPostsInterface().getSinglePost(id).enqueue(new Callback<AllPostsResponse>() {
            @Override
            public void onResponse(Call<AllPostsResponse> call, Response<AllPostsResponse> response) {
                fillData(response.body().getResult().get(0));
            }

            @Override
            public void onFailure(Call<AllPostsResponse> call, Throwable t) {
                Toast.makeText(SinglePostActivity.this, "Loading Failed", Toast.LENGTH_SHORT).show();
            }
        });


    }

    private void fillData(Post post) {
        postTitle.setText(post.getPostTitle());
        postContent.setText(post.getPostContent());
        postAuthor.setText(post.getPostAuthor());
        postDate.setText(post.getPostDate());

        Picasso.with(this).load(post.getFeaturedimage()).placeholder(R.drawable.ic_photo_black_24dp).into(postImage);


    }
}
