   import java.util.Scanner;

   public class Main1 {
       public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);
           MahasiswaManager manager = new MahasiswaManager();

           while (true) {
               System.out.println("\nMenu Aplikasi Data Mahasiswa:");
               System.out.println("1. Tambah Data");
               System.out.println("2. Cari Mahasiswa");
               System.out.println("3. Edit Data");
               System.out.println("4. Hapus Data");
               System.out.println("5. Keluar");
               System.out.print("Pilih menu (1-5): ");
               
               // Menggunakan try-catch untuk menangani input yang tidak valid
               int pilihan;
               try {
                   pilihan = Integer.parseInt(scanner.nextLine().trim());
               } catch (NumberFormatException e) {
                   System.out.println("Input tidak valid. Harap masukkan angka 1-5.");
                   continue;
               }

               switch (pilihan) {
                   case 1:
                       System.out.print("Masukkan NPM: ");
                       String npm = scanner.nextLine().trim();
                       System.out.print("Masukkan Nama: ");
                       String nama = scanner.nextLine().trim();
                       System.out.print("Masukkan Alamat: ");
                       String alamat = scanner.nextLine().trim();
                       manager.tambahMahasiswa(npm, nama, alamat);
                       break;
                   case 2:
                       System.out.print("Masukkan NPM untuk dicari: ");
                       String npmCari = scanner.nextLine().trim();
                       System.out.println("Debug: NPM yang dicari: '" + npmCari + "'");
                       Mahasiswa m = manager.cariMahasiswa(npmCari);
                       System.out.println("Debug: Hasil cariMahasiswa: " + (m != null ? "Ditemukan" : "Tidak ditemukan"));
                       if (m != null) {
                           System.out.println("Debug: Memanggil displayInfo()");
                           m.displayInfo();
                       } else {
                           System.out.println("Mahasiswa tidak ditemukan.");
                       }
                       break;
                   case 3:
                       System.out.print("Masukkan NPM untuk diedit: ");
                       String npmEdit = scanner.nextLine().trim();
                       System.out.print("Masukkan Nama baru: ");
                       String namaBaru = scanner.nextLine().trim();
                       System.out.print("Masukkan Alamat baru: ");
                       String alamatBaru = scanner.nextLine().trim();
                       manager.editMahasiswa(npmEdit, namaBaru, alamatBaru);
                       break;
                   case 4:
                       System.out.print("Masukkan NPM untuk dihapus: ");
                       String npmHapus = scanner.nextLine().trim();
                       manager.hapusMahasiswa(npmHapus);
                       break;
                   case 5:
                       System.out.println("Keluar dari aplikasi.");
                       scanner.close();
                       return;
                   default:
                       System.out.println("Pilihan tidak valid. Coba lagi.");
               }
           }
       }
   }
   