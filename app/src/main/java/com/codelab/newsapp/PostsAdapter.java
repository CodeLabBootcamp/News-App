package com.codelab.newsapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by SniperDW on 12/20/2016.
 */

public class PostsAdapter extends RecyclerView.Adapter<PostsAdapter.ViewHolder> {

    Context context;
    List<Post> items;

    public PostsAdapter(Context context, List<Post> items) {
        this.context = context;
        if (items == null)
            items = new ArrayList<>();
        this.items = items;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_post, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        Post post = items.get(position);

        holder.postTitle.setText(post.getPostTitle());
        holder.postContent.setText(post.getPostContent());

        Picasso.with(context).load(post.getFeaturedimage()).placeholder(R.drawable.ic_photo_black_24dp).into(holder.postImage, new Callback() {
            @Override
            public void onSuccess() {
                // do things when image is loaded
            }

            @Override
            public void onError() {
                // do things when image loading fails
            }
        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        @BindView(R.id.post_image)
        ImageView postImage;
        @BindView(R.id.post_title)
        TextView postTitle;
        @BindView(R.id.post_content)
        TextView postContent;


        public ViewHolder(View v) {
            super(v);
            ButterKnife.bind(this, v);
            v.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            Post post = items.get(getLayoutPosition());
            Intent intent = new Intent(context, SinglePostActivity.class);
            intent.putExtra("ID", post.getID());
            context.startActivity(intent);
        }

    }
}
