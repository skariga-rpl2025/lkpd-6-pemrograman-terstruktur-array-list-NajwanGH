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

class MahasiswaManager {
    private ArrayList<Mahasiswa> daftarMahasiswa;

    public MahasiswaManager() {
        daftarMahasiswa = new ArrayList<>();
    }

    // Tambah Data Mahasiswa
    public void tambahMahasiswa(String npm, String nama, String alamat) {
        Mahasiswa mahasiswa = new Mahasiswa(npm, nama, alamat);
        daftarMahasiswa.add(mahasiswa);
        System.out.println("Mahasiswa berhasil ditambahkan.");
    }

    // Cari Mahasiswa berdasarkan NPM
    public Mahasiswa cariMahasiswa(String npm) {
        for (Mahasiswa m : daftarMahasiswa) {
            if (m.getNpm().equals(npm)) {
                return m;
            }
        }
        return null;
    }

    // Edit Data Mahasiswa berdasarkan NPM
    public void editMahasiswa(String npm, String namaBaru, String alamatBaru) {
        Mahasiswa m = cariMahasiswa(npm);
        if (m != null) {
            m.setNama(namaBaru);
            m.setAlamat(alamatBaru);
            System.out.println("Data mahasiswa berhasil diedit.");
        } else {
            System.out.println("Mahasiswa dengan NPM " + npm + " tidak ditemukan.");
        }
    }

    // Hapus Data Mahasiswa berdasarkan NPM
    public void hapusMahasiswa(String npm) {
        Mahasiswa m = cariMahasiswa(npm);
        if (m != null) {
            daftarMahasiswa.remove(m);
            System.out.println("Mahasiswa berhasil dihapus.");
        } else {
            System.out.println("Mahasiswa dengan NPM " + npm + " tidak ditemukan.");
        }
    }

    // Tampilkan semua mahasiswa (opsional untuk debugging)
    public void tampilkanSemua() {
        if (daftarMahasiswa.isEmpty()) {
            System.out.println("Tidak ada data mahasiswa.");
        } else {
            for (Mahasiswa m : daftarMahasiswa) {
                m.displayInfo();
            }
        }
    }
}