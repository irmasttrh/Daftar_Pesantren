package com.kelompok3.mobile.uts.daftarpesantren.provinsi;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.kelompok3.mobile.uts.daftarpesantren.R;
import com.kelompok3.mobile.uts.daftarpesantren.kabupaten.KabupatenActivity;
import com.kelompok3.mobile.uts.daftarpesantren.utils.Constant;

import java.util.List;


public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder> {

    private List<ModelMain> modelMainList;
    private Context context;

    public MainAdapter(Context mContext, List<ModelMain> mainList) {
        this.context = mContext;
        this.modelMainList = mainList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_data_provinsi, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final ModelMain data = modelMainList.get(holder.getAdapterPosition());

        holder.tvProvinsi.setText(data.getNama());
        holder.cvDaftarProvinsi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Constant.provinsiId = modelMainList.get(holder.getAdapterPosition()).getId();
                Constant.provinsiName = modelMainList.get(holder.getAdapterPosition()).getNama();
                Intent intent = new Intent(context, KabupatenActivity.class);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return modelMainList.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        public CardView cvDaftarProvinsi;
        public TextView tvProvinsi;

        public ViewHolder(View itemView) {
            super(itemView);
            cvDaftarProvinsi = itemView.findViewById(R.id.cvDaftarProvinsi);
            tvProvinsi = itemView.findViewById(R.id.tvProvinsi);
        }
    }

}