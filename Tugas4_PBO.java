import java.util.Arrays;
import java.util.Scanner;

public class Tugas4_PBO {
    public static void main(String[] args) {
        String[] DataNim = {
                "190001", "190002", "190003", "190101", "190102", "190103",
                "190201", "190202", "190203", "190301", "190302", "190303",
                "190401", "190402", "190403", "190501", "190502", "190503",
                "190601", "190602", "190603", "190701", "190702", "190703",
                "190801", "190802", "190803", "190901", "190902", "190903"
        };
        String[] DataNama = {
                "Ani", "Budi", "Citra", "Dika", "Eva", "Fandi",
                "Gita", "Hadi", "Ira", "Joko", "Kiki", "Lina",
                "Mira", "Nina", "Oscar", "Putri", "Qori", "Rudi",
                "Sari", "Tono", "Uci", "Vivi", "Wulan", "Xander",
                "Yanti", "Zara", "Adi", "Bima", "Cindy", "Denny"
        };
        String[] DataProdi = {
                "TE", "TE", "TE", "TE", "TE", "TE",
                "TF", "TF", "TF", "TF", "TF", "TF",
                "TT", "TT", "TT", "TT", "TT", "TT",
                "TB", "TB", "TB", "TB", "TB", "TB",
                "TSE", "TSE", "TSE", "TSE", "TSE", "TSE"
        };


        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("\n===========\n");
            System.out.println("Menu:");
            System.out.println("1. Tampilkan Data");
            System.out.println("2. Cari Mahasiswa (NIM)");
            System.out.println("3. Cari Mahasiswa (Prodi)");
            System.out.println("4. Cari Mahasiswa (Nama)");
            System.out.println("5. Keluar");
            System.out.print("Pilihan Anda: ");

            int pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("\n===========\n");
                    System.out.println("Submenu:");
                    System.out.println("1. Tampilkan NIM (Ascending)");
                    System.out.println("2. Tampilkan NIM (Descending)");
                    System.out.println("3. Tampilkan Prodi");
                    System.out.println("4. Tampilkan Nama");
                    System.out.print("Pilihan Anda: ");
                    int Pilihan2 = input.nextInt();
                    switch (Pilihan2) {
                        case 1:
                            System.out.println("\n===========\n");
                            sortAndDisplay(DataNim, DataNama, DataProdi, true);
                            break;
                        case 2:
                            sortAndDisplay(DataNim, DataNama, DataProdi, false);
                            break;
                        case 3:
                            sortAndDisplayByProdi(DataNim, DataNama, DataProdi);
                            break;
                        case 4:
                            sortAndDisplayByName(DataNim, DataNama, DataProdi);
                            break;
                        default:
                            System.out.println("Pilihan tidak valid. Silakan pilih submenu yang sesuai!");
                    }
                    break;
                case 2:
                    System.out.println("\n===========\n");
                    searchAndDisplayByNIM(DataNim, DataNama, DataProdi);
                    break;
                case 3:
                    System.out.println("\n===========\n");
                    searchAndDisplayByProdi(DataNim, DataNama, DataProdi);
                    break;
                case 4:
                    System.out.println("\n===========\n");
                    searchAndDisplayByName(DataNim, DataNama, DataProdi);
                    break;
                case 5:
                    System.out.println("\n===========\n");
                    System.out.println("Terima kasih!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih menu yang sesuai.");
            }
        }
    }

    public static void sortAndDisplay(String[] nimArray, String[] namaArray, String[] prodiArray, boolean ascending) {
        int length = nimArray.length;

        if (ascending) {
            for (int i = 0; i < length - 1; i++) {
                for (int j = 0; j < length - i - 1; j++) {
                    if (nimArray[j].compareTo(nimArray[j + 1]) > 0) {
                        // Tukar NIM
                        String tempNim = nimArray[j];
                        nimArray[j] = nimArray[j + 1];
                        nimArray[j + 1] = tempNim;

                        // Tukar Nama
                        String tempNama = namaArray[j];
                        namaArray[j] = namaArray[j + 1];
                        namaArray[j + 1] = tempNama;

                        // Tukar Prodi
                        String tempProdi = prodiArray[j];
                        prodiArray[j] = prodiArray[j + 1];
                        prodiArray[j + 1] = tempProdi;
                    }
                }
            }
        }
        else {
            for (int i = 0; i < length - 1; i++) {
                for (int j = 0; j < length - i - 1; j++) {
                    if (nimArray[j].compareTo(nimArray[j + 1]) < 0) {
                        // Tukar NIM
                        String tempNim = nimArray[j];
                        nimArray[j] = nimArray[j + 1];
                        nimArray[j + 1] = tempNim;

                        // Tukar Nama
                        String tempNama = namaArray[j];
                        namaArray[j] = namaArray[j + 1];
                        namaArray[j + 1] = tempNama;

                        // Tukar Prodi
                        String tempProdi = prodiArray[j];
                        prodiArray[j] = prodiArray[j + 1];
                        prodiArray[j + 1] = tempProdi;
                    }
                }
            }
        }

        System.out.println("NIM\t\tNama\t\tProdi");
        for (int i = 0; i < length; i++) {
            System.out.printf("%s\t%-10s\t%s%n", nimArray[i], namaArray[i], prodiArray[i]);
        }
    }

    public static void sortAndDisplayByProdi(String[] DataNim, String[] DataNama, String[] DataProdi) {
        String[] sortedDataProdi = Arrays.copyOf(DataProdi, DataProdi.length);
        Arrays.sort(sortedDataProdi);

        System.out.println("NIM\t\tNama\t\tProdi");
        for (int A = 0; A < sortedDataProdi.length; A++) {
            String prodi = sortedDataProdi[A];
            for (int i = 0; i < DataProdi.length; i++) {
                if (DataProdi[i].equals(prodi)) {
                    System.out.printf("%s\t%-10s\t%s%n", DataNim[i], DataNama[i], DataProdi[i]);
                }
            }
        }
    }

    public static void sortAndDisplayByName(String[] DataNim, String[] DataNama, String[] DataProdi) {
        String[] sortedDataNama = Arrays.copyOf(DataNama, DataNama.length);
        Arrays.sort(sortedDataNama);
        System.out.println("\n===========\n");
        System.out.println("NIM\t\tNama\t\tProdi");
        for (int A = 0; A < sortedDataNama.length; A++) {
            String nama = sortedDataNama[A];
            for (int i = 0; i < DataNama.length; i++) {
                if (DataNama[i].equals(nama)) {
                    System.out.printf("%s\t%-10s\t%s%n", DataNim[i], DataNama[i], DataProdi[i]);
                }
            }
        }
    }

    public static void searchAndDisplayByNIM(String[] DataNim, String[] DataNama, String[] DataProdi) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan NIM yang dicari: ");
        String targetNIM = input.next();

        boolean found = false; // Menandakan apakah NIM ditemukan
        System.out.println("\n===========\n");
        System.out.println("NIM\t\tNama\t\tProdi");
        for (int i = 0; i < DataNim.length; i++) {
            if (DataNim[i].contains(targetNIM)) { //contains = memuat angka yang mirip dengan yang dicari
                System.out.printf("%s\t%-10s\t%s%n", DataNim[i], DataNama[i], DataProdi[i]);
                found = true; // NIM ditemukan
            }
        }

        if (!found) {
            System.out.println("NIM tidak ditemukan.");
            System.out.println("\n===========\n");
        }
    }


    public static void searchAndDisplayByProdi(String[] DataNim, String[] DataNama, String[] DataProdi) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Prodi yang dicari (TE/TT/TF/TSE): ");
        String targetProdi = input.next();
        System.out.println("\n===========\n");
        System.out.println("NIM\t\tNama\t\tProdi");
        for (int i = 0; i < DataProdi.length; i++) {
            if (DataProdi[i].equalsIgnoreCase(targetProdi)) {
                System.out.printf("%s\t%-10s\t%s%n", DataNim[i], DataNama[i], DataProdi[i]);
            }
        }
    }
    public static void searchAndDisplayByName(String[] DataNim, String[] DataNama, String[] DataProdi) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nama yang dicari: ");
        String targetName = input.next();

        boolean found = false; // Menandakan apakah nama ditemukan
        System.out.println("\n===========\n");
        System.out.println("NIM\t\tNama\t\tProdi");
        for (int i = 0; i < DataNama.length; i++) {
            if (DataNama[i].equalsIgnoreCase(targetName)) {
                System.out.printf("%s\t%-10s\t%s%n", DataNim[i], DataNama[i], DataProdi[i]);
                found = true; // Nama ditemukan
            }
        }

        if (!found) {
            System.out.println("Nama tidak ditemukan.");
            System.out.println("\n===========\n");
        }
    }
}