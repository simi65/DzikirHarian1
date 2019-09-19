package com.miss.dzikirharian1;

public class ModelDzikirDH {

    private String id;
    private String judul;
    private String subjudul;


    public ModelDzikirDH(String id, String judul, String subjudul) {
        this.id = id;
        this.judul = judul;
        this.subjudul = subjudul;

    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getSubjudul() {
        return subjudul;
    }

    public void setSubjudul(String subjudul) {
        this.subjudul = subjudul;
    }


}
