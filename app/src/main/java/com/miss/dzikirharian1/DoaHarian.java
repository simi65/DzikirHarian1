package com.miss.dzikirharian1;

import android.content.Intent;
import android.database.DataSetObserver;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class DoaHarian extends AppCompatActivity {
    ListView listView;

    private String[] listmenudoa = {
            "1. Doa mohon ampunan dan rahmat Allah",
            "2. Doa agar tergolong orang-orang beriman",
            "3. Doa agar diberikan keturunan yang shalih",
            "4. Doa mohon ampunan bagi kedua orang tua dan kaum mukminin",
            "5. Doa mohon ketetapan bagi diri dan keluarga dalam mendirikan shalat",
            "6. Doa berlindung dari orang yang zhalim",
            "7. Doa agar diterima amal ibadah dan taubat",
            "8. Doa agar bisa bertawakkal hanya kepada Allah",
            "9. Doa berlindung dari keburukan orang-orang kafir",
            "10. Doa agar ditambahkan ilmu",
            "11. Doa agar disempurnakan cahayanya",
            "12. Doa memohon kebaikan dunia dan akhirat",
            "13. Doa agar dijadikan hamba yang bersyukur",
            "14. Doa berlindung dari setan",
            "15. Doa agar hati ditetapkan dalam hidayah",
            "16. Doa agar dilapangkan hati dan dimudahkan dalam urusan",
            "17. Doa meminta keamanan negeri dan berlindung dari syirik",
            "18. Doa berlindung dari api neraka"

    };
    private String[] listid = {
            "d1",
            "d2",
            "d3",
            "d4",
            "d5",
            "d6",
            "d7",
            "d8",
            "d9",
            "d10",
            "d11",
            "d12",
            "d13",
            "d14",
            "d15",
            "d16",
            "d17",
            "d18"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doa_harian);

        listView = findViewById(R.id.listDoa);


        MenuDoaAdapter adapter = new MenuDoaAdapter();
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(DoaHarian.this, " POSISI YANG DITEKAN = " + position, Toast.LENGTH_SHORT).show();
                startActivity(new Intent(DoaHarian.this, MenuDoa.class)
                        .putExtra("KEY_ID", listid[position]));
            }
        });
    }

    private class MenuDoaAdapter extends BaseAdapter {




        @Override
        public int getCount() {
            return listmenudoa.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            convertView = getLayoutInflater().inflate(R.layout.raw1, null);
            TextView textView = convertView.findViewById(R.id.tvraw1);
            textView.setText(listmenudoa[position]);

            return convertView;
        }
    }
}

