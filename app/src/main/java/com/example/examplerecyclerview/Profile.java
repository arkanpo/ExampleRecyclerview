package com.example.examplerecyclerview;

public class Profile {
    private String nama;
    private String lokasi;
    private String image;

    public Profile() {
    }

    public Profile(String nama, String lokasi, String image) {
        this.nama = nama;
        this.lokasi = lokasi;
        this.image = image;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
