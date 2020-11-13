/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119043.latihan47.nilaimahasiswa;

/**
 *
 * @author FERMI
 * NAMA      : FERMI NAUFAL AKBAR
 * NIM       : 10119043
 * KELAS     : IF2
 * DESKRIPSI : Program menghirung nilai akhir mahasiswa
 */
public class PBOIF210119043Latihan47NilaiMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.setQuiz(75);
        mahasiswa.setUts(45);
        mahasiswa.setUas(34);
        
        //nilaiAkhir(double quiz, double uts, double uas)
        //mahasiswa.nilaiAkhir(mahasiswa.getQuiz(), mahasiswa.getUts(), mahasiswa.getUas());
        
        //index(double nilaiAkhir)
        //mahasiswa.index(mahasiswa.nilaiAkhir(mahasiswa.getQuiz(), mahasiswa.getUts(), mahasiswa.getUas()));
        
        //keterangan(char index)
        //mahasiswa.keterangan(mahasiswa.index(mahasiswa.nilaiAkhir(mahasiswa.getQuiz(), mahasiswa.getUts(), mahasiswa.getUas())));
        
        //TampilNilai(double quiz, double uts, double uas, double nilaiAkhir, char index, String keterangan)
        mahasiswa.TampilNilai(mahasiswa.getQuiz(), mahasiswa.getUts(), mahasiswa.getUas(), mahasiswa.nilaiAkhir(mahasiswa.getQuiz(), mahasiswa.getUts(), mahasiswa.getUas()), mahasiswa.index(mahasiswa.nilaiAkhir(mahasiswa.getQuiz(), mahasiswa.getUts(), mahasiswa.getUas())), mahasiswa.keterangan(mahasiswa.index(mahasiswa.nilaiAkhir(mahasiswa.getQuiz(), mahasiswa.getUts(), mahasiswa.getUas()))));
        
        
    }
    
}