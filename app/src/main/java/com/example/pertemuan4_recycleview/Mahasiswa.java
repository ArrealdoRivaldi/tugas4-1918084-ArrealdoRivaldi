package com.example.pertemuan4_recycleview;

import android.graphics.drawable.Drawable;

public class Mahasiswa {
    private String nama,nim,angkatan;
    private Drawable image;
    public Mahasiswa(String nama, String nim, String angkatan, Drawable image){
        this.nama = nama;
        this.nim = nim;
        this.angkatan = angkatan;
        this.image = image;
    }
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getNim(){
        return nim;
    }
    public void setNim(String nim){
        this.nim = nim;
    }
    public String getAngkatan(){
        return angkatan;
    }
    public void setAngkatan(String angkatan){
        this.angkatan = angkatan;
    }
    public Drawable getImage() {
        return image;
    }
    public void setImage(Drawable image){
        this.image = image;
    }
}
