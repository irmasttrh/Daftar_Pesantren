package com.kelompok3.mobile.uts.daftarpesantren.kabupaten;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.kelompok3.mobile.uts.daftarpesantren.R;
import com.kelompok3.mobile.uts.daftarpesantren.pesantren.PesantrenActivity;
import com.kelompok3.mobile.uts.daftarpesantren.utils.Constant;

import java.util.List;

public class KabupatenAdapter extends RecyclerView.Adapter<KabupatenAdapter.ViewHolder> {

    private List<ModelKabupaten> modelKabupatenList;
    private Context context;

    public KabupatenAdapter(Context mContext, List<ModelKabupaten> modelKabupaten) {
        this.context = mContext;
        this.modelKabupatenList = modelKabupaten;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_data_kabupaten, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final ModelKabupaten data = modelKabupatenList.get(position);

        holder.tvKabupaten.setText(data.getNama());
        holder.cvDaftarKabupaten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Constant.kabupatenId = modelKabupatenList.get(holder.getAdapterPosition()).getId();
                Constant.kabupatenName = modelKabupatenList.get(holder.getAdapterPosition()).getNama();
                Intent intent = new Intent(context, PesantrenActivity.class);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return modelKabupatenList.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        public CardView cvDaftarKabupaten;
        public TextView tvKabupaten;

        public ViewHolder(View itemView) {
            super(itemView);
            cvDaftarKabupaten = itemView.findViewById(R.id.cvDaftarKabupaten);
            tvKabupaten = itemView.findViewById(R.id.tvKabupaten);
        }
    }

}