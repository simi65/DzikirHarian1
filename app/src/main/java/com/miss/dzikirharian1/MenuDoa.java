package com.miss.dzikirharian1;

import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MenuDoa extends AppCompatActivity {

    String ID_Doa, ID;
    TextView tvDetailDoa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_doa);


        tvDetailDoa = findViewById(R.id.listmenudoa);
        ID_Doa = getIntent().getStringExtra("KEY_ID");
        ID = getIntent().getStringExtra("id");


        Toast.makeText(this, ID_Doa, Toast.LENGTH_SHORT).show();




        if (ID_Doa.equals("d1")) {
            tvDetailDoa.setText(getString(R.string.aDoaDes1));

        } else if (ID_Doa.equals("d2")) {
            tvDetailDoa.setText(getString(R.string.aDoaDes2));

        } else if (ID_Doa.equals("d3")) {
            tvDetailDoa.setText(getString(R.string.aDoaDes3));

        }else if (ID_Doa.equals("d4")) {
            tvDetailDoa.setText(getString(R.string.aDoaDes4));

        }else if (ID_Doa.equals("d5")) {
            tvDetailDoa.setText(getString(R.string.aDoaDes5));

        }else if (ID_Doa.equals("d6")) {
            tvDetailDoa.setText(getString(R.string.aDoaDes6));

        }else if (ID_Doa.equals("d7")) {
            tvDetailDoa.setText(getString(R.string.aDoaDes7));

        }else if (ID_Doa.equals("d8")) {
            tvDetailDoa.setText(getString(R.string.aDoaDes8));

        }else if (ID_Doa.equals("d9")) {
            tvDetailDoa.setText(getString(R.string.aDoaDes9));

        }else if (ID_Doa.equals("d10")) {
            tvDetailDoa.setText(getString(R.string.aDoaDes10));

        }else if (ID_Doa.equals("d11")) {
            tvDetailDoa.setText(getString(R.string.aDoaDes11));

        }else if (ID_Doa.equals("d12")) {
            tvDetailDoa.setText(getString(R.string.aDoaDes12));

        }else if (ID_Doa.equals("d13")) {
            tvDetailDoa.setText(getString(R.string.aDoaDes13));

        }else if (ID_Doa.equals("d14")) {
            tvDetailDoa.setText(getString(R.string.aDoaDes14));

        }else if (ID_Doa.equals("d15")) {
            tvDetailDoa.setText(getString(R.string.aDoaDes15));

        }else if (ID_Doa.equals("d16")) {
            tvDetailDoa.setText(getString(R.string.aDoaDes16));

        }else if (ID_Doa.equals("d17")) {
            tvDetailDoa.setText(getString(R.string.aDoaDes17));

        }else if (ID_Doa.equals("d18")) {
            tvDetailDoa.setText(getString(R.string.aDoaDes18));

        }
    }
}

