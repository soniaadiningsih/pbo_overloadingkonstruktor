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
public class HargaMobil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Mobil x1;
    Mobil x2;
        x1 = new Mobil();
        x2 = new Mobil();

        x1.setNilai("Toyota","100.000.000","B-9089-TY","200km");  
        x2.setNilai("Jaguar","600.000.000","P-8888-JR","300km");  
        x1.cetak();
        x2.cetak();    
    }
   
}
