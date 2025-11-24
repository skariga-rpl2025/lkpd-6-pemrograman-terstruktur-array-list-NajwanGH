import java.util.Scanner;

public class DataArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input jumlah elemen array
        System.out.print("Input jumlah element Array: ");
        int jumlah = input.nextInt();

        int[] data = new int[jumlah];

        // Input elemen array satu per satu
        System.out.println("Input " + jumlah + " angka (dipisah dengan enter):");
        for (int i = 0; i < jumlah; i++) {
            data[i] = input.nextInt();
        }

        // Input angka yang ingin dicari
        System.out.print("\nInput angka yang akan dicari: ");
        int cari = input.nextInt();

        // Linear Search
        int indexDitemukan = -1;
        for (int i = 0; i < jumlah; i++) {
            if (data[i] == cari) {
                indexDitemukan = i;
                break; // stop setelah ketemu
            }
        }

        // Output hasil
        if (indexDitemukan != -1) {
            System.out.println("Angka ditemukan pada index ke-" + indexDitemukan);
        } else {
            System.out.println("Angka tidak ditemukan");
        }
    }
}
