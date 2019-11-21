package com.example.examplerecyclerview;

import android.content.Context;
import android.media.Image;
import android.support.annotation.NonNull;
import android.support.v7.view.menu.MenuView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    Context context;
    ArrayList<Profile> profiles;

    public MyAdapter(Context c, ArrayList<Profile> p)
    {
        context = c;
        profiles = p;
    }



    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.cardview,viewGroup,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        myViewHolder.nama.setText(profiles.get(i).getNama());
        myViewHolder.lokasi.setText(profiles.get(i).getLokasi());
        Picasso.get().load(profiles.get(i).getImage()).into(myViewHolder.image);

    }

    @Override
    public int getItemCount() {
        return profiles.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder
    {
        TextView nama,lokasi;
        ImageView image;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            nama = (TextView) itemView.findViewById(R.id.nama);
            lokasi = (TextView) itemView.findViewById(R.id.lokasi);
            image = (ImageView) itemView.findViewById(R.id.image);

        }
    }
}
