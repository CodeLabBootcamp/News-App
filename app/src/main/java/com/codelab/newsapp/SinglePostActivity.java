package com.codelab.newsapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;

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
    @BindView(R.id.shareButton)
    Button shareButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_post);
        ButterKnife.bind(this);

        Post post = getIntent().getParcelableExtra("POST");
        fillData(post);

    }

    private void fillData(final Post post) {
        postTitle.setText(post.getPostTitle());
        postContent.setText(post.getPostContent());
        postAuthor.setText(post.getPostAuthor());
        postDate.setText(post.getPostDate());

        Picasso.with(this).load(post.getFeaturedimage()).placeholder(R.drawable.ic_photo_black_24dp).into(postImage);


        shareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String shareText = post.getPostTitle() + "\n\n" + post.getGuid();
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT, shareText);
                sendIntent.setType("text/plain");
                startActivity(sendIntent);
            }
        });
    }
}
