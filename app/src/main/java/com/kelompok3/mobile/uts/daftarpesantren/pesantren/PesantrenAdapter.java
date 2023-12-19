package com.kelompok3.mobile.uts.daftarpesantren.pesantren;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;
import com.kelompok3.mobile.uts.daftarpesantren.R;

import java.util.List;

public class PesantrenAdapter extends RecyclerView.Adapter<PesantrenAdapter.ViewHolder> {

    private List<ModelPesantren> modelPesantrenList;
    private Context context;

    public PesantrenAdapter(Context mContext, List<ModelPesantren> modelPesantren) {
        this.context = mContext;
        this.modelPesantrenList = modelPesantren;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_data_pesantren, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final ModelPesantren data = modelPesantrenList.get(position);

        holder.tvNamaPesantren.setText(data.getNama());
        holder.tvNSPP.setText(data.getNspp());
        holder.tvAlamat.setText(data.getAlamat());

        if (data.getKyai().equals("")){
            holder.tvNamaKyai.setText("-");
        } else {
            holder.tvNamaKyai.setText(data.getKyai());
        }
    }

    @Override
    public int getItemCount() {
        return modelPesantrenList.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView tvNamaPesantren, tvNSPP, tvAlamat, tvNamaKyai;

        public ViewHolder(View itemView) {
            super(itemView);

            tvNamaPesantren = itemView.findViewById(R.id.tvNamaPesantren);
            tvNSPP = itemView.findViewById(R.id.tvNSPP);
            tvAlamat = itemView.findViewById(R.id.tvAlamat);
            tvNamaKyai = itemView.findViewById(R.id.tvNamaKyai);
        }
    }

}