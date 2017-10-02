package com.example.josan.recyclerviewexample;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.josan.recyclerviewexample.Model.Anime;

import java.util.List;

/**
 * Created by josan on 1/10/2017.
 */

public class AnimeAdapter extends RecyclerView.Adapter<AnimeAdapter.ViewHolder>{

    private List<Anime> items;

    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView title;
        public TextView releaseDate;
        public TextView views;

        public ViewHolder(View itemView) {
            super(itemView);
            title=(TextView)itemView.findViewById(R.id.anime_title);
            releaseDate=(TextView)itemView.findViewById(R.id.anime_releaseDate);
            views=(TextView)itemView.findViewById(R.id.anime_views);

        }
    }

    public AnimeAdapter(List<Anime> items) {
        this.items = items;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_anime_card_view,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.title.setText(items.get(position).getName());
        holder.releaseDate.setText(items.get(position).getReleaseDate());
        holder.views.setText(items.get(position).getEpisodes());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }


}
