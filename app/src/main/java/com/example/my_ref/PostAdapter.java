package com.example.my_ref;

import android.content.Context;
import android.icu.text.Transliterator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.PostViewHolder> {

    List<Post> postList;
    Context context;
    public PostAdapter(Context context,List<Post> posts){
        this.context=context;
        postList=posts;
    }
    @NonNull
    @Override
    public PostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.item,parent,false);
        return new PostViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PostViewHolder holder, int position) {
        Post post=postList.get(position);
        holder.project_name.setText(post.getProject_name());
        holder.activity_name.setText(post.getActivity_name());
        holder.start_date.setText(post.getStart_date());
        holder.duration.setText(post.getDuration());
        holder.description.setText(post.getDescription());
    }

    @Override
    public int getItemCount() {
        return postList.size();
    }

    public class PostViewHolder extends RecyclerView.ViewHolder{
        TextView project_name,activity_name,start_date,description,duration;
        public PostViewHolder(@NonNull View itemView) {
            super(itemView);
            project_name=itemView.findViewById(R.id.title);
            activity_name=itemView.findViewById(R.id.subhead);
            start_date=itemView.findViewById(R.id.time);
            duration=itemView.findViewById(R.id.duration);
            description=itemView.findViewById(R.id.body);
        }
    }
}
