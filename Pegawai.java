/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihan1;

/**
 *
 * @author hp
 */
public class Pegawai {
    
    private String nama;
    private double gajiPokok;
   
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public void gajiPokok(double gajiPokok){
        this.gajiPokok = gajiPokok;
    }
     
    //getter
    public String getNama(){
        return this.nama;
    }
    
    public double getGajiPokok(){
        return this.gajiPokok;
    }
    
    public void cetakInfo() {
    System.out.println("Nama : " + this.nama);
    System.out.println("Gaji Pokok : " + this.gajiPokok);
    }
    
}

    //membuat class manager inheritance
    public class Manager extends Pegawai {
    
    private double tunjangan;
    
    public void setTunjangan(double tunjangan){
        this.tunjangan = tunjangan;    
    }
    
    public double getTunjangan(){
        return this.tunjangan;
    }
    
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Tunjangan : " + this.tunjangan);
    }
    
    public void cetakTunjangan(){
         System.out.println("Tunjangan anda : " + this.tunjangan);
    }
}

//membuat class programmer inheritance
public class Programmer extends Pegawai {
    
     private double bonus;
    
    public void setBonus(double Bonus){
        this.bonus = bonus;    
    }
    
    public double getBonus(){
        return this.bonus;
    }
    
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Bonus : " + this.bonus);
    }
    
    public void cetakBonus(){
         System.out.println("Bonus anda : " + this.bonus);
    }
    
}
