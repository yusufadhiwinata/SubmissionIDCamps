package com.dicoding.submission1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class CardViewPlayerAdapter extends RecyclerView.Adapter<CardViewPlayerAdapter.CardViewViewHolder> {
    private ArrayList<Player> listPlayer;
    private OnItemClickCallback onItemClickCallback;

    void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }
    public CardViewPlayerAdapter(ArrayList<Player> list){
        this.listPlayer = list;
    }
    @NonNull
    @Override
    public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_player,parent,false);
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final CardViewViewHolder holder, int position) {
        Player player = listPlayer.get(position);
        Glide.with(holder.itemView.getContext())
                .load(player.getPhoto())
                .apply(new RequestOptions().override(350,350))
                .into(holder.imgPhoto);
        holder.tvName.setText(player.getName());
        holder.tvDetail.setText(player.getDetail());
        holder.tvSalary.setText(player.getSalary());
        holder.tvCurrentClub.setText(player.getCurrent_club());
        holder.tvSalary.setText(player.getSalary());
        holder.tvUrl.setText(player.getUrl());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(listPlayer.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return listPlayer.size();
    }

    public class CardViewViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName,tvDetail,tvSalary,tvCurrentClub,tvBirthOfDate,tvUrl;
        CardViewViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_player);
            tvName = itemView.findViewById(R.id.txt_player);
            tvDetail = itemView.findViewById(R.id.txt_description);
            tvSalary = itemView.findViewById(R.id.txt_salary);
            tvCurrentClub = itemView.findViewById(R.id.txt_current_club);
            tvBirthOfDate = itemView.findViewById(R.id.txt_birth_of_date);
            tvUrl = itemView.findViewById(R.id.txt_url);
        }
    }
    public interface OnItemClickCallback {
        void onItemClicked(Player data);
    }
}
