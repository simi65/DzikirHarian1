package com.miss.dzikirharian1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class DzikirPetang extends AppCompatActivity {

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
            "Dzikir pasPagi39",
            "Dzikir pasPagi40",
            "Dzikir pasPagi41",
            "Dzikir pasPagi42",
            "Dzikir pasPagi43",
            "Dzikir pasPagi44",
            "Dzikir pasPagi45",
            "Dzikir pasPagi46",
            "Dzikir pasPagi47",
            "Dzikir pasPagi48",
            "Dzikir pasPagi49",
            "Dzikir pasPagi50",
            "Dzikir pasPagi51",
            "Dzikir pasPagi52",
            "Dzikir pasPagi53",
            "Dzikir pasPagi54",
            "Dzikir pasPagi55",
            "Dzikir pasPagi56",
            "Dzikir pasPagi57",
            "Dzikir pasPagi58",
            "Dzikir pasPagi59",
            "Dzikir pasPagi60",
            "Dzikir pasPagi61",
            "Dzikir pasPagi62",
            "Dzikir pasPagi63",
            "Dzikir pasPagi64",
            "Dzikir pasPagi65",
            "Dzikir pasPagi66",
            "Dzikir pasPagi67",
            "Dzikir pasPagi68",
            "Dzikir pasPagi69",
            "Dzikir pasPagi70",
            "Dzikir pasPagi71",
            "Dzikir pasPagi72",
            "Dzikir pasPagi73",
            "Dzikir pasPagi74",
            "Dzikir pasPagi75",
            "Dzikir pasPagi76",
            "Dzikir pasPagi77",
            "Dzikir pasPagi78",
            "Dzikir pasPagi79",
            "Dzikir pasPagi80",
            "Dzikir pasPagi82",
            "Dzikir pasPagi83",
            "Dzikir pasPagi84",
            "Dzikir pasPagi85",
            "Dzikir pasPagi86",
            "Dzikir pasPagi87",
            "Dzikir pasPagi88",
            "Dzikir pasPagi89",
            "Dzikir pasPagi90",
            "Dzikir pasPagi91",
            "Dzikir pasPagi92",
            "Dzikir pasPagi93",
            "Dzikir pasPagi94",
            "Dzikir pasPagi95",
            "Dzikir pasPagi96",
            "Dzikir pasPagi97",
            "Dzikir pasPagi98",
            "Dzikir pasPagi99",
            "Dzikir pasPagi100",
            "Dzikir pasPagi102",
            "Dzikir pasPagi103",
            "Dzikir pasPagi104",
            "Dzikir pasPagi105",
            "Dzikir pasPagi106",
            "Dzikir pasPagi107",
            "Dzikir pasPagi108",










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
            "Dzikir Pagi39",
            "Dzikir Pagi40",
            "Dzikir Pagi41",
            "Dzikir Pagi42",
            "Dzikir Pagi43",
            "Dzikir Pagi44",
            "Dzikir Pagi45",
            "Dzikir Pagi46",
            "Dzikir Pagi47",
            "Dzikir Pagi48",
            "Dzikir Pagi49",
            "Dzikir Pagi50",
            "Dzikir Pagi51",
            "Dzikir Pagi52",
            "Dzikir Pagi53",
            "Dzikir Pagi54",
            "Dzikir Pagi55",
            "Dzikir Pagi56",
            "Dzikir Pagi57",
            "Dzikir Pagi58",
            "Dzikir Pagi59",
            "Dzikir Pagi60",
            "Dzikir Pagi61",
            "Dzikir Pagi62",
            "Dzikir Pagi63",
            "Dzikir Pagi64",
            "Dzikir Pagi65",
            "Dzikir Pagi66",
            "Dzikir Pagi67",
            "Dzikir Pagi68",
            "Dzikir Pagi69",
            "Dzikir Pagi70",
            "Dzikir Pagi71",
            "Dzikir Pagi72",
            "Dzikir Pagi73",
            "Dzikir Pagi74",
            "Dzikir Pagi75",
            "Dzikir Pagi76",
            "Dzikir Pagi77",
            "Dzikir Pagi78",
            "Dzikir Pagi79",
            "Dzikir Pagi80",
            "Dzikir Pagi82",
            "Dzikir Pagi83",
            "Dzikir Pagi84",
            "Dzikir Pagi85",
            "Dzikir Pagi86",
            "Dzikir Pagi87",
            "Dzikir Pagi88",
            "Dzikir Pagi89",
            "Dzikir Pagi90",
            "Dzikir Pagi91",
            "Dzikir Pagi92",
            "Dzikir Pagi93",
            "Dzikir Pagi94",
            "Dzikir Pagi95",
            "Dzikir Pagi96",
            "Dzikir Pagi97",
            "Dzikir Pagi98",
            "Dzikir Pagi99",
            "Dzikir Pagi100",
            "Dzikir Pagi101",
            "Dzikir Pagi102",
            "Dzikir Pagi103",
            "Dzikir Pagi104",
            "Dzikir Pagi105",
            "Dzikir Pagi106",
            "Dzikir Pagi107",
            "Dzikir Pagi108",

















    };

    private String[] subjudul = {


                    "أَعُوذُ بِاللَّهِ مِنَ الشَّيْطَانِ الرَّجِيمِ" ,
                    "“Aku berlindung kepada Allah dari godaan syaitan yang terkutuk." ,
                    "[1]" ,
                    "Membaca ayat Kursi" ,
                    "اللَّهُ لاَ إِلَهَ إِلاَّ هُوَ الْحَيُّ الْقَيُّومُ، لاَ تَأْخُذُهُ سِنَةٌ وَلاَ نَوْمٌ، لَهُ مَا فِي السَّمَاوَاتِ وَمَا فِي الْأَرْضِ، مَنْ ذَا الَّذِي يَشْفَعُ عِنْدَهُ إِلاَّ بِإِذْنِهِ، يَعْلَمُ مَا بَيْنَ أَيْدِيهِمْ وَمَا خَلْفَهُمْ، وَلَا يُحِيطُونَ بِشَيْءٍ مِنْ عِلْمِهِ إِلاَّ بِمَا شَاءَ، وَسِعَ كُرْسِيُّهُ السَّمَاوَاتِ وَالْأَرْضَ، وَلَا يَئُودُهُ حِفْظُهُمَا، وَهُوَ الْعَلِيُّ الْعَظِيمُ" ,
                    "“Allah, tidak ada ilah (yang berhak disembah) melainkan Dia, yang hidup kekal lagi terus menerus mengurus (makhluk-Nya). Dia tidak mengantuk dan tidak tidur. Kepunyaan-Nya apa yang di langit dan di bumi. Tiada yang dapat memberi syafa’at di sisi-Nya tanpa seizin-Nya. Dia mengetahui apa-apa yang di hadapan mereka dan di belakang mereka. Mereka tidak mengetahui apa-apa dari ilmu Allah melainkan apa yang dikehendaki-Nya. Kursi Allah meliputi langit dan bumi. Dia tidak merasa berat memelihara keduanya. Dan Dia Maha Tinggi lagi Maha besar.” (QS. Al Baqarah: 255) (Dibaca 1 x)" ,
                    "Faedah: Siapa yang membacanya ketika petang, maka ia akan dilindungi (oleh Allah dari berbagai gangguan) hingga pagi. Siapa yang membacanya ketika pagi, maka ia akan dilindungi hingga petang.[1]" ,
                    "[2]" ,
                    "Membaca surat Al Ikhlas, Al Falaq, An Naas" ,
                    "بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ" ,
                    "قُلْ هُوَ اللَّهُ أَحَدٌ اللَّهُ الصَّمَدُ لَمْ يَلِدْ وَلَمْ يُولَدْ وَلَمْ يَكُن لَّهُ كُفُوًا أَحَدٌ" ,
                    "“Dengan menyebut nama Allah Yang Maha Pengasih lagi Maha Penyayang. Katakanlah: Dialah Allah, Yang Maha Esa. Allah adalah ilah yang bergantung kepada-Nya segala urusan. Dia tidak beranak dan tiada pula diperanakkan, dan tidak ada seorang pun yang setara dengan Dia.” (QS. Al Ikhlas: 1-4) (Dibaca 3 x)" ,
                    "بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ" ,
                    "قُلْ أَعُوذُ بِرَبِّ الْفَلَقِ مِن شَرِّ مَا خَلَقَ وَمِن شَرِّ غَاسِقٍ إِذَا وَقَبَ وَمِن شَرِّ النَّفَّاثَاتِ فِي الْعُقَدِ  وَمِن شَرِّ حَاسِدٍ إِذَا حَسَدَ" ,
                    "Dengan menyebut nama Allah Yang Maha Pengasih lagi Maha Penyayang. Katakanlah: Aku berlindung kepada Rabb yang menguasai Shubuh, dari kejahatan makhluk-Nya, dan dari kejahatan malam apabila telah gelap gulita, dan dari kejahatan-kejahatan wanita tukang sihir yang menghembus pada buhul-buhul, dan dari kejahatan orang yang dengki apabila ia dengki”. (QS. Al Falaq: 1-5) (Dibaca 3 x)" ,
                    "بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ" ,
                    "قُلْ أَعُوذُ بِرَبِّ النَّاسِ مَلِكِ النَّاسِ إِلَهِ النَّاسِ مِن شَرِّ الْوَسْوَاسِ الْخَنَّاسِ الَّذِي يُوَسْوِسُ فِي صُدُورِ النَّاسِ مِنَ الْجِنَّةِ وَ النَّاس" ,
                    "“Dengan menyebut nama Allah Yang Maha Pengasih lagi Maha Penyayang. Katakanlah: Aku berlindung kepada Rabb manusia. Raja manusia. Sembahan manusia, dari kejahatan (bisikan) syaitan yang biasa bersembunyi, yang membisikkan (kejahatan) ke dalam dada manusia, dari jin dan manusia.” (QS. An Naas: 1-6) (Dibaca 3 x)" ,
                    "Faedah: Siapa yang mengucapkannya masing-masing tiga kali ketika pagi dan petang, maka segala sesuatu akan dicukupkan untuknya.[2]" ,
                    "[3]" ,
                    "أَمْسَيْنَا وَأَمْسَى الْمُلْكُ للهِ، وَالْحَمْدُ للهِ، لَا إِلَهَ إِلاَّ اللهُ وَحْدَهُ لاَ شَرِيكَ لَهُ، لَهُ الْمُلْكُ وَلَهُ الْحَمْدُ، وَهُوَ عَلَى كُلِّ شَيْءٍ قَدِيرٌ، رَبِّ أَسْأَلُكَ خَيْرَ مَا فِي هَذِهِ اللَّيْلَةِ وَخَيْرَ مَا بَعْدَهَا، وَأَعُوذُبِكَ مِنْ شَرِّ مَا فِي هَذِهِ اللَّيْلَةِ وَشَرِّ مَا بَعْدَهَا، رَبِّ أَعُوذُبِكَ مِنَ الْكَسَلِ وَسُوءِ الْكِبَرِ، رَبِّ أَعُوذُبِكَ مِنْ عَذَابٍ فِي النَّارِ وَعَذَابٍ فِي الْقَبْرِ" ,
                    "Amsaynaa wa amsal mulku lillah walhamdulillah, laa ilaha illallah wahdahu laa syarika lah, lahul mulku walahul hamdu wa huwa ‘ala kulli syai-in qodir. Robbi as-aluka khoiro maa fii hadzihil lailah wa khoiro maa ba’dahaa, wa a’udzu bika min syarri maa fii hadzihil lailah wa syarri maa ba’dahaa. Robbi a’udzu bika minal kasali wa suu-il kibar. Robbi a’udzu bika min ‘adzabin fin naari wa ‘adzabin fil qobri." ,
                    "Artinya:" ,
                    "“Kami telah memasuki waktu petang dan kerajaan hanya milik Allah, segala puji bagi Allah. Tidak ada ilah (yang berhak disembah) kecuali Allah semata, tiada sekutu bagi-Nya. Milik Allah kerajaan dan bagi-Nya pujian. Dia-lah Yang Mahakuasa atas segala sesuatu.Wahai Rabbku, aku mohon kepada-Mu kebaikan di malam ini dan kebaikan sesudahnya. Aku berlindung kepadaMu dari kejahatan malam ini dan kejahatan sesudahnya. Wahai Rabbku, aku berlindung kepadaMu dari kemalasan dan kejelekan di hari tua. Wahai Rabbku, aku berlindung kepada-Mu dari siksaan di neraka dan siksaan di kubur.” (Dibaca 1 x)" ,
                    "Faedah: Meminta pada Allah kebaikan di malam ini dan kebaikan sesudahnya, juga agar terhindar dari kejelekan di malam ini dan kejelekan sesudahnya. Di dalamnya berisi pula permintaan agar terhindar dari rasa malas padahal mampu untuk beramal, juga agar terhindar dari kejelekan di masa tua. Di dalamnya juga berisi permintaan agar terselamatkan dari siksa kubur dan siksa neraka yang merupakan siksa terberat di hari kiamat kelak.[3]" ,
                    "[4]" ,
                    "اللَّهُمَّ بِكَ أَمْسَيْنَا، وَبِكَ أَصْبَحْنَا،وَبِكَ نَحْيَا، وَبِكَ نَمُوتُ، وَإِلَيْكَ الْمَصِيْرُ" ,
                    "Allahumma bika amsaynaa wa bika ash-bahnaa wa bika nahyaa wa bika namuutu wa ilaikal mashiir." ,
                    "Artinya:" ,
                    "“Ya Allah, dengan rahmat dan pertolongan-Mu kami memasuki waktu petang, dan dengan rahmat dan pertolongan-Mu kami memasuki waktu pagi. Dengan rahmat dan pertolonganMu kami hidup dan dengan kehendakMu kami mati. Dan kepada-Mu tempat kembali (bagi semua makhluk).” (Dibaca 1 x) [4]" ,
                    "[5]" ,
                    "Membaca Sayyidul Istighfar" ,
                    "اَللَّهُمَّ أَنْتَ رَبِّيْ لاَ إِلَـهَ إِلاَّ أَنْتَ، خَلَقْتَنِيْ وَأَنَا عَبْدُكَ، وَأَنَا عَلَى عَهْدِكَ وَوَعْدِكَ مَا اسْتَطَعْتُ، أَعُوْذُ بِكَ مِنْ شَرِّ مَا صَنَعْتُ، أَبُوْءُ لَكَ بِنِعْمَتِكَ عَلَيَّ، وَأَبُوْءُ بِذَنْبِيْ فَاغْفِرْ لِيْ فَإِنَّهُ لاَ يَغْفِرُ الذُّنُوْبَ إِلاَّ أَنْتَ" ,
                    "Allahumma anta robbii laa ilaha illa anta, kholaqtanii wa anaa ‘abduka wa anaa ‘ala ‘ahdika wa wa’dika mas-tatho’tu. A’udzu bika min syarri maa shona’tu. Abu-u laka bi ni’matika ‘alayya wa abu-u bi dzambii. Fagh-firlii fainnahu laa yagh-firudz dzunuuba illa anta." ,
                    "Artinya:" ,
                    "“Ya Allah, Engkau adalah Rabbku, tidak ada ilah yang berhak disembah kecuali Engkau, Engkaulah yang menciptakanku. Aku adalah hamba-Mu. Aku akan setia pada perjanjianku pada-Mu (yaitu aku akan mentauhidkan-Mu) semampuku dan aku yakin akan janji-Mu (berupa surga untukku). Aku berlindung kepada-Mu dari kejelekan yang kuperbuat. Aku mengakui nikmat-Mu kepadaku dan aku mengakui dosaku. Oleh karena itu, ampunilah aku. Sesungguhnya tiada yang mengampuni dosa kecuali Engkau.” (Dibaca 1 x)\n" ,
                    "Faedah: Barangsiapa mengucapkan dzikir ini di siang hari dalam keadaan penuh keyakinan, lalu ia mati pada hari tersebut sebelum petang hari, maka ia termasuk penghuni surga. Barangsiapa yang mengucapkannya di malam hari dalam keadaan penuh keyakinan, lalu ia mati sebelum pagi, maka ia termasuk penghuni surga.[5]",
                    "[6]" ,
                    "اَللَّهُمَّ إِنِّيْ أَمْسَيْتُ أُشْهِدُكَ وَأُشْهِدُ حَمَلَةَ عَرْشِكَ، وَمَلاَئِكَتَكَ وَجَمِيْعَ خَلْقِكَ، أَنَّكَ أَنْتَ اللهُ لاَ إِلَـهَ إِلاَّ أَنْتَ وَحْدَكَ لاَ شَرِيْكَ لَكَ، وَأَنَّ مُحَمَّدًا عَبْدُكَ وَرَسُوْلُك" ,
                    "Allahumma inni amsaytu usy-hiduka wa usy-hidu hamalata ‘arsyika wa malaa-ikatak wa jami’a kholqik, annaka antallahu laa ilaha illa anta wahdaka laa syariika lak, wa anna Muhammadan ‘abduka wa rosuuluk.\n" ,
                    "Artinya:" ,
                    "“Ya Allah, sesungguhnya aku di waktu petang ini mempersaksikan Engkau, malaikat yang memikul ‘Arys-Mu, malaikat-malaikat dan seluruh makhluk-Mu, bahwa sesungguhnya Engkau adalah Allah, tiada ilah yang berhak disembah kecuali Engkau semata, tiada sekutu bagi-Mu dan sesungguhnya Muhammad adalah hamba dan utusan-Mu.” (Dibaca 4 x)" ,
                    "Faedah: Barangsiapa yang mengucapkan dzikir ini ketika pagi dan petang hari sebanyak empat kali, maka Allah akan membebaskan dirinya dari siksa neraka.[6]" ,
                    "[7]" ,
                    "اَللَّهُمَّ إِنِّيْ أَسْأَلُكَ الْعَفْوَ وَالْعَافِيَةَ فِي الدُّنْيَا وَاْلآخِرَةِ، اَللَّهُمَّ إِنِّيْ أَسْأَلُكَ الْعَفْوَ وَالْعَافِيَةَ فِي دِيْنِيْ وَدُنْيَايَ وَأَهْلِيْ وَمَالِيْ اللَّهُمَّ اسْتُرْ عَوْرَاتِى وَآمِنْ رَوْعَاتِى. اَللَّهُمَّ احْفَظْنِيْ مِنْ بَيْنِ يَدَيَّ، وَمِنْ خَلْفِيْ، وَعَنْ يَمِيْنِيْ وَعَنْ شِمَالِيْ، وَمِنْ فَوْقِيْ، وَأَعُوْذُ بِعَظَمَتِكَ أَنْ أُغْتَالَ مِنْ تَحْتِيْ" ,
                    "Allahumma innii as-alukal ‘afwa wal ‘aafiyah fid dunyaa wal aakhiroh. Allahumma innii as-alukal ‘afwa wal ‘aafiyah fii diinii wa dun-yaaya wa ahlii wa maalii. Allahumas-tur ‘awrootii wa aamin row’aatii. Allahummahfazh-nii mim bayni yadayya wa min kholfii wa ‘an yamiinii wa ‘an syimaalii wa min fawqii wa a’udzu bi ‘azhomatik an ugh-taala min tahtii." ,
                    "Artinya:\n" ,
                    "“Ya Allah, sesungguhnya aku memohon kebajikan dan keselamatan di dunia dan akhirat. Ya Allah, sesungguhnya aku memohon kebajikan dan keselamatan dalam agama, dunia, keluarga dan hartaku. Ya Allah, tutupilah auratku (aib dan sesuatu yang tidak layak dilihat orang) dan tenteramkanlah aku dari rasa takut. Ya Allah, peliharalah aku dari muka, belakang, kanan, kiri dan atasku. Aku berlindung dengan kebesaran-Mu, agar aku tidak disambar dari bawahku (oleh ular atau tenggelam dalam bumi dan lain-lain yang membuat aku jatuh).” (Dibaca 1 x)" ,
                    "Faedah: Rasulullah shallallahu ‘alaihi wa sallam tidaklah pernah meninggalkan do’a ini di pagi dan petang hari. Di dalamnya berisi perlindungan dan keselamatan pada agama, dunia, keluarga dan harta dari berbagai macam gangguan yang datang dari berbagai arah.[7]" ,
                    "[8]" ,
                    "اَللَّهُمَّ عَالِمَ الْغَيْبِ وَالشَّهَادَةِ فَاطِرَ السَّمَاوَاتِ وَاْلأَرْضِ، رَبَّ كُلِّ شَيْءٍ وَمَلِيْكَهُ، أَشْهَدُ أَنْ لاَ إِلَـهَ إِلاَّ أَنْتَ، أَعُوْذُ بِكَ مِنْ شَرِّ نَفْسِيْ، وَمِنْ شَرِّ الشَّيْطَانِ وَشِرْكِهِ، وَأَنْ أَقْتَرِفَ عَلَى نَفْسِيْ سُوْءًا أَوْ أَجُرُّهُ إِلَى مُسْلِمٍ" ,
                    "Allahumma ‘aalimal ghoybi wasy-syahaadah faathiros samaawaati wal ardh. Robba kulli syai-in wa maliikah. Asyhadu alla ilaha illa anta. A’udzu bika min syarri nafsii wa min syarrisy-syaythooni wa syirkihi, wa an aqtarifa ‘alaa nafsii suu-an aw ajurruhu ilaa muslim" ,
                    "Artinya:" ,
                    "“Ya Allah, Yang Maha Mengetahui yang ghaib dan yang nyata, wahai Rabb pencipta langit dan bumi, Rabb segala sesuatu dan yang merajainya. Aku bersaksi bahwa tidak ada ilah yang berhak disembah kecuali Engkau. Aku berlindung kepadaMu dari kejahatan diriku, setan dan balatentaranya (godaan untuk berbuat syirik pada Allah), dan aku (berlindung kepada-Mu) dari berbuat kejelekan terhadap diriku atau menyeretnya kepada seorang muslim.” (Dibaca 1 x)\n" ,
                    "Faedah: Do’a ini diajarkan oleh Rasulullah shallallahu ‘alaihi wa sallam pada Abu Bakr Ash Shiddiq untuk dibaca pada pagi, petang dan saat beranjak tidur.[8]" ,
                    "[9]" ,
                    "بِسْمِ اللَّهِ الَّذِى لاَ يَضُرُّ مَعَ اسْمِهِ شَىْءٌ فِى الأَرْضِ وَلاَ فِى السَّمَاءِ وَهُوَ السَّمِيعُ الْعَلِيمُ" ,
                    "Bismillahilladzi laa yadhurru ma’asmihi syai-un fil ardhi wa laa fis samaa’ wa huwas samii’ul ‘aliim." ,
                    "Artinya:" ,
                    "“Dengan nama Allah yang bila disebut, segala sesuatu di bumi dan langit tidak akan berbahaya, Dia-lah Yang Maha Mendengar lagi Maha Mengetahui.” (Dibaca 3 x)" ,
                    "Faedah: Barangsiapa yang mengucapkan dzikir tersebut sebanyak tiga kali di pagi hari dan tiga kali di petang hari, maka tidak akan ada bahaya yang tiba-tiba yang memudaratkannya.[9]" ,
                    "[10]" ,
                    "رَضِيْتُ بِاللهِ رَبًّا، وَبِاْلإِسْلاَمِ دِيْنًا، وَبِمُحَمَّدٍ صَلَّى اللهُ عَلَيْهِ وَسَلَّمَ نَبِيًّا" ,
                    "Rodhiitu billaahi robbaa wa bil-islaami diinaa, wa bi-muhammadin shallallaahu ‘alaihi wa sallama nabiyyaa" ,
                    "Artinya:" ,
                    "“Aku ridha Allah sebagai Rabb, Islam sebagai agama dan Muhammad shallallahu ‘alaihi wa sallam sebagai nabi.” (Dibaca 3 x)" ,
                    "Faedah: Barangsiapa yang mengucapkan hadits ini sebanyak tiga kali di pagi hari dan tiga kali di petang hari, maka pantas baginya mendapatkan ridha Allah. [10]" ,
                    "[11]" ,
                    "يَا حَيُّ يَا قَيُّوْمُ بِرَحْمَتِكَ أَسْتَغِيْثُ، وَأَصْلِحْ لِيْ شَأْنِيْ كُلَّهُ وَلاَ تَكِلْنِيْ إِلَى نَفْسِيْ طَرْفَةَ عَيْنٍ أَبَدًا" ,
                    "Yaa Hayyu Yaa Qoyyum, bi-rohmatika as-taghiits, wa ash-lih lii sya’nii kullahu wa laa takilnii ilaa nafsii thorfata ‘ainin abadan." ,
                    "Artinya:" ,
                    "“Wahai Rabb Yang Maha Hidup, wahai Rabb Yang Berdiri Sendiri (tidak butuh segala sesuatu), dengan rahmat-Mu aku minta pertolongan, perbaikilah segala urusanku dan jangan diserahkan kepadaku sekali pun sekejap mata (tanpa mendapat pertolongan dariMu).” (Dibaca 1 x)" ,
                    "Faedah: Dzikir ini diajarkan oleh Nabi shallallahu ‘alaihi wa sallam pada Fathimah supaya diamalkan pagi dan petang. [11]" ,
                    "[12]" ,
                    "سُبْحَانَ اللهِ وَبِحَمْدِهِ" ,
                    "Subhanallah wa bi-hamdih." ,
                    "Artinya:" ,
                    "“Maha suci Allah, aku memuji-Nya.” (Dibaca 100 x)" ,
                    "Faedah: Barangsiapa yang mengucapkan kalimat ‘subhanallah wa bi hamdih’ di pagi dan petang hari sebanyak 100 x, maka tidak ada yang datang pada hari kiamat yang lebih baik dari yang ia lakukan kecuali orang yang mengucapkan semisal atau lebih dari itu.[12]" ,
                    "[13]" ,
                    "لاَ إِلَـهَ إِلاَّ اللهُ وَحْدَهُ لاَ شَرِيْكَ لَهُ، لَهُ الْمُلْكُ وَلَهُ الْحَمْدُ وَهُوَ عَلَى كُلِّ شَيْءٍ قَدِيْرُ" ,
                    "Laa ilaha illallah wahdahu laa syarika lah, lahul mulku walahul hamdu wa huwa ‘ala kulli syai-in qodiir." ,
                    "Artinya:" ,
                    "“Tidak ada ilah yang berhak disembah selain Allah semata, tidak ada sekutu bagi-Nya. Bagi-Nya kerajaan dan segala pujian. Dia-lah yang berkuasa atas segala sesuatu.” (Dibaca 1o x)" ,
                    "Faedah: Barangsiapa yang membaca dzikir tersebut di pagi hari sebanyak sepuluh kali, Allah akan mencatatkan baginya 10 kebaikan, menghapuskan baginya 10 kesalahan, ia juga mendapatkan kebaikan semisal memerdekakan 10 budak, Allah akan melindunginya dari gangguan setan hingg petang hari. Siapa yang mengucapkannya di petang hari, ia akan mendapatkan keutamaan semisal itu pula. [13]" ,
                    "[14]" ,
                    "أَعُوْذُ بِكَلِمَاتِ اللهِ التَّامَّاتِ مِنْ شَرِّ مَا خَلَقَ" ,
                    "A’udzu bikalimaatillahit-taammaati min syarri maa kholaq." ,
                    "Artinya:" ,
                    "“Aku berlindung dengan kalimat-kalimat Allah yang sempurna dari kejahatan makhluk yang diciptakanNya.” (Dibaca 3 x pada waktu petang)" ,
                    "Faedah: Siapa yang mengucapkannya di petang hari, niscaya tidak ada racun atau binatang (seperti: kalajengking) yang mencelakakannya di malam itu.[14]" ,
                    "[1] HR. Al Hakim (1: 562). Syaikh Al Albani menshahihkan hadits tersebut dalam Shahih At Targhib wa At Tarhib no. 655." ,
                    "[2] HR. Abu Daud no. 5082, Tirmidzi no. 3575. Al Hafizh Abu Thohir mengatakan bahwa sanad hadits ini hasan." ,
                    "[3] HR. Muslim no. 2723. Lihat keterangan Syarh Hisnul Muslim, hal. 161." ,
                    "[4] HR. Tirmidzi no. 3391 dan Abu Daud no. 5068. Al Hafizh Abu Thohir mengatakan bahwa sanad hadits ini shahih." ,
                    "[5] HR. Bukhari no. 6306." ,
                    "[6] HR. Abu Daud no. 5069. Al Hafizh Abu Thohir mengatakan bahwa hadits ini hasan." ,
                    "[7] HR. Abu Daud no. 5074 dan Ibnu Majah no. 3871. Al Hafizh Abu Thohir mengatakan bahwa sanad hadits ini shahih." ,
                    "[8] HR. Tirmidzi no. 3392 dan Abu Daud no. 5067. Al Hafizh Abu Thohir mengatakan bahawa sanad hadits ini shahih. Adapun kalimat terakhir (وَأَنْ أَقْتَرِفَ عَلَى نَفْسِيْ سُوْءًا أَوْ أَجُرُّهُ إِلَى مُسْلِمٍ) adalah tambahan dari riwayat Ahmad 2: 196. Dikomentari oleh Syaikh Syu’aib Al Arnauth bahwa hadits tersebut shahih dilihat dari jalur lainnya (shahih lighoirihi)." ,
                    "[9] HR. Abu Daud no. 5088, 5089, Tirmidzi no. 3388, dan Ibnu Majah no. 3869. Al Hafizh Abu Thohir mengatakan bahwa sanad hadits ini hasan.\n" ,
                    "[10] HR. Abu Daud no. 5072, Tirmidzi no. 3389. Al Hafizh Abu Thohir mengatakan bahwa hadits ini hasan.\n" ,
                    "[11] HR. Ibnu As Sunni dalam ‘Amalul Yaum wal Lailah no. 46, An Nasai dalam Al Kubro (381/ 570), Al Bazzar dalam musnadnya (4/ 25/ 3107), Al Hakim (1: 545). Sanad hadits ini hasan sebagaimana dikatakan oleh Syaikh Al Albani dalam As Silsilah Ash Shahihah no. 227." ,
                    "[12] HR. Muslim no. 2692." ,
                    "[13] HR. An Nasai Al Kubra 6: 10." ,
                    "[14] HR. Ahmad 2: 290. Syaikh Syu’aib Al Arnauth mengatakan bahwa sanad hadits ini shahih sesuai syarat Muslim. Lihat komentar Syaikh Syu’aib Al Arnauth terhadap hadits ini untuk pengertian hummah diartikan dengan racun atau sengatan kalajengking."

    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dzikir_petang);


        recyclerViewdzikir = findViewById(R.id.rvmain3);
        arrayList1 = new ArrayList<>();
        setData();
        recyclerviewAdapterDzikir = new RecyclerviewAdapterDzikir(arrayList1);
        recyclerViewdzikir.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerViewdzikir.setAdapter(recyclerviewAdapterDzikir);
                getSupportActionBar().setDisplayShowHomeEnabled(true);



    }

    private void setData() {
        int count = 0;
        for (String id : idJudul) {
            arrayList1.add(new ModelDzikirDH(id, judul[count], subjudul[count]));
            count++;

        }


    }




}
