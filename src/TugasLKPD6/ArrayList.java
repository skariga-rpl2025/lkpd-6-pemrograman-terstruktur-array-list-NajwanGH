import java.util.ArrayList;
import java.util.Scanner;

class Mahasiswa {
    private String npm;
    private String nama;
    private String alamat;

    // Constructor
    public Mahasiswa(String npm, String nama, String alamat) {
        this.npm = npm;
        this.nama = nama;
        this.alamat = alamat;
    }

    // Getters
    public String getNpm() {
        return npm;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    // Setters
    public void setNpm(String npm) {
        this.npm = npm;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    // Method to display info
    public void displayInfo() {
        System.out.println("NPM: " + npm + ", Nama: " + nama + ", Alamat: " + alamat);
    }
}
