package com.template.recycleview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.CustomViewHolder> {

    LayoutInflater mInflater;
    ArrayList<Os> osList;

    public CustomAdapter(Context context,
                         ArrayList<Os> name) {
        setHasStableIds(true);
        this.mInflater = LayoutInflater.from(context);
        this.osList = name;
    }

    class CustomViewHolder extends RecyclerView.ViewHolder {

        TextView namaItemView;
        ImageView namaImageView;
        LinearLayout linearnya;

        public CustomViewHolder(View itemView, CustomAdapter adapter) {
            super(itemView);
            namaItemView = itemView.findViewById(R.id.tampilkota);
            namaImageView = itemView.findViewById(R.id.tampilgambar);
            linearnya = itemView.findViewById(R.id.linearnya);
        }
    }

    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = mInflater.inflate(
                R.layout.rowview, parent, false);
        return new CustomViewHolder(itemView, this);
    }

    @Override
    public void onBindViewHolder(final CustomViewHolder holder, final int position) {
        final Os current = osList.get(position);

        holder.namaItemView.setText(current.nama);
        holder.namaImageView.setImageDrawable(current.gambar);
        holder.linearnya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                osList.remove(position);
                notifyDataSetChanged();
                Toast.makeText(view.getContext(), current.nama + " deleted.", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getItemCount() {
        return osList.size();
    }
}
