import java.util.Scanner;

public class Tugas307 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahToko;

        do {
            System.out.print("Masukkan jumlah toko: ");
            jumlahToko = sc.nextInt();
            if (jumlahToko < 1) {
                System.out.println("Jumlah toko minimal 1");
            }
        } while (jumlahToko < 1);

        int totalBarangSeluruhToko = 0;
        int tokoTerbanyak = 0;
        int barangTerbanyak = -1;
        String ringkasanToko = "";

        for (int i = 1; i <= jumlahToko; i++) {
            System.out.println("Data Toko " + i);

            int jumlahPelanggan;
            do {
                System.out.print("Masukkan jumlah pelanggan: ");
                jumlahPelanggan = sc.nextInt();
                if (jumlahPelanggan < 0) {
                    System.out.println("Jumlah pelanggan tidak boleh negatif");
                }
            } while (jumlahPelanggan < 0);

            int totalBarangTokoIni = 0;

            for (int j = 1; j <= jumlahPelanggan; j++) {
                int barangPelanggan;
                do {
                    System.out.print("Jumlah barang pelanggan ke - " + j + ": ");
                    barangPelanggan = sc.nextInt();
                    if (barangPelanggan < 0) {
                        System.out.println("Jumlah barang tidak boleh negatif");
                    }
                } while (barangPelanggan < 0);

                totalBarangTokoIni += barangPelanggan;
            }

            ringkasanToko += "Toko " + i + " - pelanggan: " + jumlahPelanggan + ", total barang: " + totalBarangTokoIni
                    + "\n";

            totalBarangSeluruhToko += totalBarangTokoIni;

            if (totalBarangTokoIni > barangTerbanyak) {
                barangTerbanyak = totalBarangTokoIni;
                tokoTerbanyak = i;
            }
        }

        System.out.print(ringkasanToko);
        System.out.println("Total barang seluruh toko: " + totalBarangSeluruhToko);
        System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);

        sc.close();
    }
}
