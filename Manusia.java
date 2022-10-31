/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihan1;

/**
 *
 * @author hp
 */
public class Manusia {
    
    String nama;
    String jenisKelamin;
    int umur;
    String alamat;
    
    public void cetakInfo() {
    System.out.println("Nama : " + this.nama);
    System.out.println("Jenis Kelamin : " + this.jenisKelamin);
    System.out.println("Umur : " + this.umur);
    System.out.println("Alamat : " + this.alamat);
    }
}
    
//
public class Mahasiswa extends Manusia {
    
    String nim;
    String jurusan;
    
    
    //Setter
    public void setNim(String nim){
        this.nim = nim;
    }
    
    public void setJurusan(String jurusan){
        this.jurusan = jurusan;
    }
    
    //getter
    public String getNim(){
        return this.nim;
    }
    
    public String getJurusan(){
        return this.jurusan;
    }  
}

//
public class MahasiswaBeraksi {
    
    public static void main(String[] args) {
        
        Mahasiswa anton = new Mahasiswa();
        
        /* memanggil atribut dan memberi nilai */
        anton.nim = "10102020";
        anton.nama = "Anton Santoso";
        anton.jenisKelamin = "Laki-laki";
        anton.umur = 28;
        anton.alamat = "Bekasi Kota";
        anton.jurusan = "Informatika";
        
        anton.cetakInfo();
        
    } 
}