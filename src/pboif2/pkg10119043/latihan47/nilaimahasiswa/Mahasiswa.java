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
public class Mahasiswa {
    private double quiz;
    private double uts;
    private double uas;
    private char index;
    private String keterangan;

    public void setQuiz(double quiz) {
        this.quiz = quiz;
    }

    public void setUts(double uts) {
        this.uts = uts;
    }

    public void setUas(double uas) {
        this.uas = uas;
    }

    public double getQuiz() {
        return quiz;
    }

    public double getUts() {
        return uts;
    }

    public double getUas() {
        return uas;
    }
    
    public double nilaiAkhir(double quiz, double uts, double uas) {
        return 0.2*quiz + 0.3*uts + 0.5*uas;
    }
    
    public char index(double nilaiAkhir) {
        if (nilaiAkhir>=80 && nilaiAkhir<=100) {
            index = 'A';
        } else if (nilaiAkhir>=68 && nilaiAkhir<=80) {
            index = 'B';
        } else if (nilaiAkhir>=56 && nilaiAkhir<=68) {
             index = 'C';
        } else if (nilaiAkhir>=45 && nilaiAkhir<=56) {
            index = 'D';
        }  else {
            index = 'E';
        } 
        return index;
    }
    
    public String keterangan(char index) {
        if (index == 'A') {
            keterangan = "Sangat Baik";
        } else if (index == 'B') {
            keterangan = "Baik";
        } else if (index == 'C') {
             keterangan = "Cukup";
        } else if (index == 'D') {
            keterangan = "Kurang";
        }  else {
            keterangan = "Sangat Kurang";;
        } 
        return keterangan;
    }
    
    public void TampilNilai(double quiz, double uts, double uas, double nilaiAkhir, char index, String keterangan) {
        System.out.println("Quiz = " + quiz);
        System.out.println("UTS = " + uts);
        System.out.println("UAS = " + uas + "\n" );
        System.out.println("Nilai Akhir = " + nilaiAkhir + "\n");
        System.out.println("Index = " + index);
        System.out.println("Keterangan = " + keterangan);
    }
}
