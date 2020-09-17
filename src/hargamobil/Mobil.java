/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hargamobil;

/**
 *
 * @author win10
 */
class Mobil {
  String jenis;
  String harga;
  String platmobil;
  String kecepatan;
   
  void setNilai(String jenis, String harga , String platmobil){
   this.jenis = jenis;
   this.harga= harga;
   this.platmobil= platmobil;
  }
   
  void setNilai(String jenis,String harga, String platmobil ,String kecepatan){
   this.jenis = jenis;
   this.harga = harga; 
   this.platmobil = platmobil;
   this.kecepatan = kecepatan;
  }
   
  void cetak(){
   System.out.println("jenis mobil : "+harga);
   System.out.println("harga mobil : "+harga);
   System.out.println("plat mobil : "+platmobil);
   System.out.println("kecepatan mobil : "+kecepatan + "\n");
  }
    
}
