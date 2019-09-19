package com.miss.dzikirharian1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class DzikirSetelahShalat extends AppCompatActivity {


    private RecyclerviewAdapterDzikir recyclerviewAdapterDzikir;

    RecyclerView recyclerViewdzikir;
    ArrayList<ModelDzikirDH> arrayList1;

    private String[] idJudul = {"dzikir paspagi1",
            "dzikir paspagi2",
            "Dzikir pasPagi3",
            "Dzikir pasPagi4",
            "Dzikir pasPagi5",
            "Dzikir pasPagi6",
            "Dzikir pasPagi7",
            "Dzikir pasPagi8",
            "Dzikir pasPagi9",
            "Dzikir pasPagi10",
            "Dzikir pasPagi11",
            "Dzikir pasPagi12",
            "Dzikir pasPagi13",
            "Dzikir pasPagi14",
            "Dzikir pasPagi15",
            "Dzikir pasPagi16",
            "Dzikir pasPagi17",
            "Dzikir pasPagi18",
            "Dzikir pasPagi19",
            "Dzikir pasPagi20",
            "Dzikir pasPagi21",
            "Dzikir pasPagi22",
            "Dzikir pasPagi23",
            "Dzikir pasPagi24",
            "Dzikir pasPagi25",
            "Dzikir pasPagi26",
            "Dzikir pasPagi27",
            "Dzikir pasPagi28",
            "Dzikir pasPagi29",
            "Dzikir pasPagi30",
            "Dzikir pasPagi31",
            "Dzikir pasPagi32",
            "Dzikir pasPagi34",
            "Dzikir pasPagi35",
            "Dzikir pasPagi36",
            "Dzikir pasPagi37",
            "Dzikir pasPagi38",
            "Dzikir pasPagi39"



    };


    private String[] judul = {"Dzikir Pagi1",
            "Dzikir Pagi2",
            "Dzikir Pagi3",
            "Dzikir Pagi4",
            "Dzikir Pagi5",
            "Dzikir Pagi6",
            "Dzikir Pagi7",
            "Dzikir Pagi8",
            "Dzikir Pagi9",
            "Dzikir Pagi10",
            "Dzikir Pagi11",
            "Dzikir Pagi12",
            "Dzikir Pagi13",
            "Dzikir Pagi14",
            "Dzikir Pagi15",
            "Dzikir Pagi16",
            "Dzikir Pagi17",
            "Dzikir Pagi18",
            "Dzikir Pagi19",
            "Dzikir Pagi20",
            "Dzikir Pagi21",
            "Dzikir Pagi22",
            "Dzikir Pagi23",
            "Dzikir Pagi24",
            "Dzikir Pagi25",
            "Dzikir Pagi26",
            "Dzikir Pagi27",
            "Dzikir Pagi28",
            "Dzikir Pagi29",
            "Dzikir Pagi30",
            "Dzikir Pagi31",
            "Dzikir Pagi32",
            "Dzikir Pagi33",
            "Dzikir Pagi34",
            "Dzikir Pagi35",
            "Dzikir Pagi36",
            "Dzikir Pagi37",
            "Dzikir Pagi38",
            "Dzikir Pagi39"



    };

    private String[] subjudul = {

            "أَسْتَغْفِرُ اللهَ (3x)ِ",
            "اَللَّهُمَّ أَنْتَ السَّلاَمُ، وَمِنْكَ السَّلاَمُ، تَبَارَكْتَ يَا ذَا الْجَلاَلِ وَاْلإِكْرَامِ",
            "Astagh-firullah 3x",
            "Allahumma antas salaam wa minkas salaam tabaarokta yaa dzal jalaali wal ikrom.",
            "Artinya:ُ",
            "“Aku minta ampun kepada Allah,” (3x).",
            "“Ya Allah, Engkau pemberi keselamatan, dan dariMu keselamatan, Maha Suci Engkau, wahai Tuhan Yang Pemilik Keagungan dan Kemuliaan.”",
            "Faedah: Rasulullah shallallahu ‘alaihi wa sallam jika selesai dari shalatnya beliau beristighfar sebanyak tiga kali dan membaca dzikir di atas. Al Auza’i menyatakan bahwa bacaan istighfar adalah astaghfirullah, astaghfirullah. [1]",
            "[2]",
            "لاَ إِلَـهَ إِلاَّ اللهُ وَحْدَهُ لاَ شَرِيْكَ لَهُ، لَهُ الْمُلْكُ وَلَهُ الْحَمْدُ وَهُوَ عَلَى كُلِّ شَيْءٍ قَدِيْرُ، اَللَّهُمَّ لاَ مَانِعَ لِمَا أَعْطَيْتَ، وَلاَ مُعْطِيَ لِمَا مَنَعْتَ، وَلاَ يَنْفَعُ ذَا الْجَدِّ مِنْكَ الْجَدُُِّّ",
            "قُلْ هُوَ اللَّهُ أَحَدٌ اللَّهُ الصَّمَدُ لَمْ يَلِدْ وَلَمْ يُولَدْ وَلَمْ يَكُن لَّهُ كُفُوًا أَحَدٌ",
            "Laa ilaha illallah wahdahu laa syarika lah, lahul mulku wa lahul hamdu wa huwa ‘ala kulli syai-in qodiir.",
            "Allahumma laa maani’a limaa a’thoyta wa laa mu’thiya limaa mana’ta wa laa yanfa’u dzal jaddi minkal jaddu.ِ",
            "Artinya:َ",
            "“Tiada Rabb yang berhak disembah selain Allah Yang Maha Esa, tidak ada sekutu bagi-Nya. Bagi-Nya puji dan bagi-Nya kerajaan. Dia Maha Kuasa atas segala sesuatu. Ya Allah, tidak ada yang mencegah apa yang Engkau berikan dan tidak ada yang memberi apa yang Engkau cegah. Tidak berguna kekayaan dan kemuliaan itu bagi pemiliknya (selain iman dan amal shalihnya yang menyelamatkan dari siksaan). Hanya dari-Mu kekayaan dan kemuliaan.”[2]",
            "[3]",
            "لاَ إِلَـهَ إِلاَّ اللهُ وَحْدَهُ لاَ شَرِيْكَ لَهُ، لَهُ الْمُلْكُ وَلَهُ الْحَمْدُ وَهُوَ عَلَى كُلِّ شَيْءٍ قَدِيْرُ. لاَ حَوْلَ وَلاَ قُوَّةَ إِلاَّ بِاللهِ، لاَ إِلَـهَ إِلاَّ اللهُ، وَلاَ نَعْبُدُ إِلاَّ إِيَّاهُ، لَهُ النِّعْمَةُ وَلَهُ الْفَضْلُ وَلَهُ الثَّنَاءُ الْحَسَنُ، لاَ إِلَـهَ إِلاَّ اللهُ مُخْلِصِيْنَ لَهُ الدِّيْنَ وَلَوْ كَرِهَ الْكَافِرُوْنَُ",
            "Laa ilaha illallah wahdahu laa syarika lah. Lahul mulku wa lahul hamdu wa huwa ‘ala kulli syai-in qodiir.",
            "Laa hawla wa laa quwwata illa billah. Laa ilaha illallah wa laa na’budu illa iyyaah. Lahun ni’mah wa lahul fadhlu wa lahuts tsanaaul hasan.",
            "Laa ilaha illallah mukhlishiina lahud diin wa law karihal kaafiruun.",
            "Artinya:ِ",
            "Faedah: Dikatakan oleh ‘Abdullah bin Zubair, Nabi shallallahu ‘alaihi wa sallam biasa membaca tahlil (laa ilaha illallah) di akhir shalat.[4]",
            "Membaca ayat Kursi setiap selesai shalat (fardhu).",
            "Faedah: Siapa membaca ayat Kursi setiap selesai shalat, tidak ada yang menghalanginya masuk surga selain kematian.[7]",
            "[6]",
            "Membaca surat Al-Ikhlas, Al-Falaq dan An-Naas setiap selesai shalat (fardhu).",
            "Faedah: Tiga surat ini disebut mu’awwidzot.[8]",
            "[7]",
            "اَللَّهُمَّ إِنِّيْ أَسْأَلُكَ عِلْمًا نَافِعًا، وَرِزْقًا طَيِّبًا، وَعَمَلاً مُتَقَبَّلاً",
            "Allahumma inni as-aluka ‘ilman naafi’a, wa rizqon thoyyiba, wa ‘amalan mutaqobbala",
            "Artinya:",
            "“Ya Allah, sungguh aku memohon kepada-Mu ilmu yang bermanfaat (bagi diriku dan orang lain), rizki yang halal dan amal yang diterima (di sisi-Mu dan mendapatkan ganjaran yang baik).” (Dibaca setelah salam dari shalat Shubuh)[9]",
            "Semoga bisa diamalkan",
            "[1] HR. Muslim no. 591.",
            "[2] HR. Bukhari no. 844 dan Muslim no. 593.",
            "[4] HR. Muslim no. 594.",
            "[7] HR. An-Nasai dalam Al Kubro 9: 44. Hadits ini dinyatakan shahih oleh Ibnu Hibban, sebagaimana disebut oleh Ibnu Hajar dalam Bulughul Maram.",
            "[8] HR. Abu Daud no. 1523 dan An-Nasai no. 1337. Al Hafizh Abu Thohir mengatakan bahwa sanad hadits ini hasan.",
            "[9] HR. Ibnu Majah no. 925 dan Ahmad 6: 305, 322. Al Hafizh Abu Thohir mengatakan bahwa hadits ini shahih."

    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dzikir_setelah_shalat);


        recyclerViewdzikir = findViewById(R.id.rvmain4);
        arrayList1 = new ArrayList<>();
        setData();
        recyclerviewAdapterDzikir = new RecyclerviewAdapterDzikir(arrayList1);
        recyclerViewdzikir.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerViewdzikir.setAdapter(recyclerviewAdapterDzikir);


    }

    private void setData() {
        int count = 0;
        for (String id : idJudul) {
            arrayList1.add(new ModelDzikirDH(id, judul[count], subjudul[count]));
            count++;

        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.tasbih:
                Intent intent = new Intent(DzikirSetelahShalat.this, Tasbih.class);
                startActivity(intent);
                finish();
                break;
        }


        return super.onOptionsItemSelected(item);

    }


}




