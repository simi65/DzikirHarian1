package com.miss.dzikirharian1;


import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentHome extends Fragment {


    private RecyclerViewAdapter recyclerViewAdapter;

    RecyclerView recyclerView;
    ArrayList<ModelDzikir> arrayList;



    private String[] idDz = {
            "DzikirPagi",
            "DzikirPetang",
            "DoaHarian",
            "DzikirSetelahShalat" };
    private String[] judul = {
            "Dzikir Pagi",
            "Dzikir Petang",
            "Doa Harian",
            "Dzikir Setelah Shalat"};
    private String[] subjudul = {"Maka bersabarlah kamu, karena sesungguhnya janji Allah itu benar, dan mohonlah ampunan untuk dosamu dan bertasbihlah seraya memuji Tuhanmu pada waktu sore dan pagi” (QS. Ghafir: 55)" ,
            "Maka bertasbihlah kepada Allah di waktu kamu berada di sore hari dan waktu kamu berada di waktu pagi hari” (QS. Ar-Rum:17)" ,"Barangsiapa yang tidak meminta pada Allah, maka Allah akan murka padanya.” (HR. Tirmidzi no. 3373. Syaikh Al Albani mengatakan  bahwa hadits ini hasan",
            "Maka ingatlah pada-Ku, maka Aku akan mengingat kalian.” (QS. Al Baqarah: 152).", "a"};



    private int[] gambar = {R.drawable.ic_morning , R.drawable.ic_evening , R.drawable.ic_clock , R.drawable.ic_logo};
    private int[] logo= {R.drawable.ic_morning , R.drawable.ic_evening, R.drawable.ic_clock};




    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fragment_home, container, false);
        recyclerView = view.findViewById(R.id.rvmain);
        arrayList = new ArrayList<>();
        setData();
        recyclerViewAdapter = new RecyclerViewAdapter(arrayList);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(recyclerViewAdapter);
        return view;



    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.terjemah:
                startActivity(new Intent(Settings.ACTION_LOCALE_SETTINGS));
                break;
        }

        return super.onOptionsItemSelected(item);

    }



    private void setData() {
        int count = 0;
        for (String id : idDz){
            arrayList.add(new ModelDzikir(id, judul[count], subjudul[count], gambar[count]));
            count++;
        }

    }

}
