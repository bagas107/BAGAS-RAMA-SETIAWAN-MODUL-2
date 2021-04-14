/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.praktikum.pkg2;

/**
 *
 * @author Windows 10
 */
public class VCD3 extends VCD2 {
  String aktor,sutradara, kategori;
    
    VCD3(String aktor, String sutradara, String kategori, String judul, String publisher, int stok){
        super(judul,publisher,stok);
        this.aktor=aktor;
        this.sutradara=sutradara;
        this.kategori=kategori;
    }
    VCD3(){

    }
}
