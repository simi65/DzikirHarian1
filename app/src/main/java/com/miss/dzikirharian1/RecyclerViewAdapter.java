package com.miss.dzikirharian1;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.DzikirHolder> {

    ArrayList<ModelDzikir> listdata;

    public RecyclerViewAdapter(ArrayList<ModelDzikir> listdata) {
        this.listdata = listdata;
    }


    @NonNull
    @Override
    public DzikirHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.raw, viewGroup, false);

        return new DzikirHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DzikirHolder dzikirHolder, int i) {

        dzikirHolder.bindview(listdata.get(i));

    }

    @Override
    public int getItemCount() {
        return listdata.size();
    }

    public class DzikirHolder extends RecyclerView.ViewHolder {

        TextView tvTitle, tvSubtitle;
        String idDz;
        ImageView imageLogo, imageCover;


        public DzikirHolder(@NonNull View itemView) {
            super(itemView);
            tvTitle = itemView.findViewById(R.id.tvJudul);
            tvSubtitle = itemView.findViewById(R.id.tvSubJudul1);
            imageLogo = itemView.findViewById(R.id.ivLogo);
            imageCover = itemView.findViewById(R.id.ivraw);

        }

        private void bindview(ModelDzikir modelDzikir) {

            tvTitle.setText(modelDzikir.getJudul());
            tvSubtitle.setText(modelDzikir.getSubjudul());
            idDz = modelDzikir.getId();
            imageCover.setImageResource(modelDzikir.getGambar());
            imageLogo.setImageResource(modelDzikir.getGambar());

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent1 = new Intent(new Intent(itemView.getContext(),DzikirPagi.class));
                    Intent intent2 = new Intent(new Intent(itemView.getContext(),DzikirPetang.class));
                    Intent intent3 = new Intent(new Intent(itemView.getContext(),DoaHarian.class));
                    Intent intent4 = new Intent(new Intent(itemView.getContext(),DzikirSetelahShalat.class));

                    if (idDz.equals("DzikirPagi")){
                        itemView.getContext().startActivity(intent1);
                    }else if (idDz.equals("DzikirPetang")){
                        itemView.getContext().startActivity(intent2);
                    }else if (idDz.equals("DoaHarian")){
                        itemView.getContext().startActivity(intent3);
                    }else if (idDz.equals("DzikirSetelahShalat")){
                        itemView.getContext().startActivity(intent4);
                    }
                }
            });

        }
    }
}
