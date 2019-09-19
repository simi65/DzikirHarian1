package com.miss.dzikirharian1;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class RecyclerviewAdapterDzikir extends RecyclerView.Adapter<RecyclerviewAdapterDzikir.DzikirHolder> {

    ArrayList<ModelDzikirDH> listdata1;

    public RecyclerviewAdapterDzikir(ArrayList<ModelDzikirDH> listdata) {
        this.listdata1 = listdata;
    }

    @NonNull
    @Override
    public DzikirHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.rawdzikirdh, viewGroup, false);

        return new DzikirHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DzikirHolder dzikirHolder, int i) {

        dzikirHolder.bindview(listdata1.get(i));


    }

    @Override
    public int getItemCount() {
        return listdata1.size();
    }

    public class DzikirHolder extends RecyclerView.ViewHolder {

        TextView tvTitle1, tvSubtitle1;

        public DzikirHolder(@NonNull View itemView) {
            super(itemView);
            tvTitle1 = itemView.findViewById(R.id.tvSubJudul2);
            tvSubtitle1 = itemView.findViewById(R.id.tvSubJudul2);

        }

        private void bindview(ModelDzikirDH modelDzikirDH) {

            tvTitle1.setText(modelDzikirDH.getJudul());
            tvSubtitle1.setText(modelDzikirDH.getSubjudul());
        }


    }
}
