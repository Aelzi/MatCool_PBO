import java.util.Scanner;

public class Tugas3_PBO {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Deklarasi variabel
        int jumlahBarang, totalHarga = 0, diskon = 0, hargaBarang, banyakBarang;
        String namaBarang;

        // Input jumlah barang yang dibeli
        System.out.print("Masukkan banyak barang yang dibeli: ");
        jumlahBarang = input.nextInt();

        // Input data barang
        for (int i = 1; i <= jumlahBarang; i++) {
            System.out.println("--Barang " + i + "--");
            System.out.print("Nama barang : ");
            namaBarang = input.next();
            System.out.print("Harga barang : ");
            hargaBarang = input.nextInt();
            System.out.print("Banyak barang : ");
            banyakBarang = input.nextInt();
            // Hitung total harga dan tambahkan ke totalHarga
            totalHarga += hargaBarang * banyakBarang;
        }

        // Hitung diskon
        if (totalHarga >= 20000 && totalHarga < 50000) {
            diskon = 10;
        } else if (totalHarga >= 50000 && totalHarga < 100000) {
            diskon = 20;
        } else if (totalHarga >= 100000) {
            diskon = 30;
        }

        // Tampilkan total harga dan diskon
        System.out.println("\n=========================================");
        System.out.println("               \t\tTotal : " + totalHarga);
        System.out.println("               \t\tDiskon : " + diskon + "%");

        // Hitung total harga setelah diskon
        int totalHargaSetelahDiskon = totalHarga - (totalHarga * diskon / 100);

        // Tampilkan total harga setelah diskon
        System.out.println("Total harga setelah diskon : " + totalHargaSetelahDiskon);
        System.out.println("=========================================\n");
    }
}
