import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int pil2;
        int pil4;

        System.out.println("MENU KASIR SWALAYAN BIGPHO!!!");
        System.out.println("==============================================================");
        System.out.println("Apa yang ingin anda lakukan?");
        System.out.println("1. Menambah stok barang");
        System.out.println("2. Membeli barang");
        System.out.print("Silakan masukan angka: ");
        int pil3 = in.nextInt();



        if (pil3 == 1) {
            System.out.println("==============================================================");

            MenuKasir barang1 = new MenuKasir(1, "Telur Ayam/lusin", 25000, 25);
            System.out.println(barang1.toString());
            MenuKasir barang2 = new MenuKasir(2, "Susu Sapi/kotak", 35000, 20);
            System.out.println(barang2.toString());
            MenuKasir barang3 = new MenuKasir(3, "Apel/kg", 50000, 15);
            System.out.println(barang3.toString());
            MenuKasir barang4 = new MenuKasir(4, "Yoghurt/botol", 12000, 50);
            System.out.println(barang4.toString());
            MenuKasir barang5 = new MenuKasir(5, "Ayam/ekor", 60000, 22);
            System.out.println(barang5.toString());
            System.out.println("==============================================================");

            System.out.println();
            do{
            System.out.print("Silakan Masukan id Barang yang ingin ditambah stoknya: ");
            int pil = in.nextInt();

            if (pil == 1) {
                System.out.print("Masukkan Jumlah Telur Ayam/lusin yang ingin ditambah: ");
                int banyak = in.nextInt();
                barang1.tambahStok(banyak);
                System.out.println("Jumlah yang ditambah = " + banyak);
                System.out.println();
                System.out.println("Laporan Stok Setelah ditambah");
                System.out.println(barang1.toString());
            } else if (pil == 2) {
                System.out.print("Masukkan Jumlah Telur Susu Sapi/kotak yang ingin ditambah: ");
                int banyak = in.nextInt();
                barang2.tambahStok(banyak);
                System.out.println("Jumlah yang ditambah = " + banyak);
                System.out.println();
                System.out.println("Laporan Stok Setelah ditambah");
                System.out.println(barang2.toString());
            } else if (pil == 3) {
                System.out.print("Masukkan Jumlah Apel/kg yang ingin ditambah: ");
                int banyak = in.nextInt();
                barang3.tambahStok(banyak);
                System.out.println("Jumlah yang ditambah = " + banyak);
                System.out.println();
                System.out.println("Laporan Stok Setelah ditambah");
                System.out.println(barang3.toString());
            } else if (pil == 4) {
                System.out.print("Masukkan Jumlah Yoghurt/botol yang ingin ditambah: ");
                int banyak = in.nextInt();
                barang4.tambahStok(banyak);
                System.out.println("Jumlah yang ditambah = " + banyak);
                System.out.println();
                System.out.println("Laporan Stok Setelah ditambah");
                System.out.println(barang4.toString());
            } else if (pil == 5) {
                System.out.print("Masukkan Jumlah Ayam/ekor yang ingin ditambah: ");
                int banyak = in.nextInt();
                barang5.tambahStok(banyak);
                System.out.println("Jumlah yang ditambah = " + banyak);
                System.out.println();
                System.out.println("Laporan Stok Setelah ditambah");
                System.out.println(barang5.toString());
            } else {
                System.out.println("PILIHAN SALAH!");
            }

            System.out.println("==============================================================");
            System.out.println();
            System.out.println("Apakah masih ada yang ingin ditambah?");
            System.out.println("1. Masih");
            System.out.println("2. Tidak");
            System.out.print("Silakan masukan angka: ");
            pil4 = in.nextInt();
            if (pil4 == 2) {
                System.out.println();
                System.out.println("Terima Kasih Telah Bekerja!");
            } else if (pil4 == 1) {
                System.out.println("MENU KASIR SWALAYAN BIGPHO!!!");
                System.out.println("==============================================================");
                System.out.println(barang1.toString());
                System.out.println(barang2.toString());
                System.out.println(barang3.toString());
                System.out.println(barang4.toString());
                System.out.println(barang5.toString());
                System.out.println("==============================================================");
                System.out.println();
            } else
                System.out.println("ERROR! BYE BYE!");
        }while (pil4 == 1);

        }





         else if (pil3 == 2) {
            System.out.println("==============================================================");

            MenuKasir barang1 = new MenuKasir(1, "Telur Ayam/lusin", 25000, 25);
            System.out.println(barang1.toString());
            MenuKasir barang2 = new MenuKasir(2, "Susu Sapi/kotak", 35000, 20);
            System.out.println(barang2.toString());
            MenuKasir barang3 = new MenuKasir(3, "Apel/kg", 50000, 15);
            System.out.println(barang3.toString());
            MenuKasir barang4 = new MenuKasir(4, "Yoghurt/botol", 12000, 50);
            System.out.println(barang4.toString());
            MenuKasir barang5 = new MenuKasir(5, "Ayam/ekor", 60000, 22);
            System.out.println(barang5.toString());
            System.out.println("==============================================================");

            System.out.println();
            do {
                System.out.print("Silakan Masukan id Barang yang ingin dibeli: ");
                int pil = in.nextInt();


                if (pil == 1) {
                    System.out.print("Masukkan Jumlah Telur Ayam/lusin yang ingin dibeli: ");
                    int banyak = in.nextInt();
                    barang1.sisaStok(banyak);
                    System.out.println("Jumlah yang dibeli = " + banyak);
                    System.out.println("Harga satu lusin telur ayam= " + barang1.getHarga());
                    System.out.println("Total yang harus dibayar = " + banyak + " x " + barang1.getHarga() + " = Rp." + banyak * barang1.getHarga());
                    System.out.println("==============================================================");
                    System.out.println();
                    System.out.println("Laporan Sisa Stok Setelah dibeli");
                    System.out.println(barang1.toString());
                } else if (pil == 2) {
                    System.out.print("Masukkan Jumlah Susu Sapi/kotak yang ingin dibeli: ");
                    int banyak = in.nextInt();
                    barang2.sisaStok(banyak);
                    System.out.println("Jumlah yang dibeli = " + banyak);
                    System.out.println("Harga satu kotak Susu Sapi= " + barang2.getHarga());
                    System.out.println("Total yang harus dibayar = " + banyak + " x " + barang2.getHarga() + " = Rp." + banyak * barang2.getHarga());
                    System.out.println("==============================================================");
                    System.out.println();
                    System.out.println("Laporan Sisa Stok Setelah dibeli");
                    System.out.println(barang2.toString());
                } else if (pil == 3) {
                    System.out.print("Masukkan Jumlah Apel/kg yang ingin dibeli: ");
                    int banyak = in.nextInt();
                    barang3.sisaStok(banyak);
                    System.out.println("Jumlah yang dibeli = " + banyak);
                    System.out.println("Harga satu kg Apel = " + barang3.getHarga());
                    System.out.println("Total yang harus dibayar = " + banyak + " x " + barang3.getHarga() + " = Rp." + banyak * barang3.getHarga());
                    System.out.println("==============================================================");
                    System.out.println();
                    System.out.println("Laporan Sisa Stok Setelah dibeli");
                    System.out.println(barang3.toString());
                } else if (pil == 4) {
                    System.out.print("Masukkan Jumlah Yoghurt/botol yang ingin dibeli: ");
                    int banyak = in.nextInt();
                    barang4.sisaStok(banyak);
                    System.out.println("Jumlah yang dibeli = " + banyak);
                    System.out.println("Harga satu botol Yoghurt= " + barang4.getHarga());
                    System.out.println("Total yang harus dibayar = " + banyak + " x " + barang4.getHarga() + " = Rp." + banyak * barang4.getHarga());
                    System.out.println("==============================================================");
                    System.out.println();
                    System.out.println("Laporan Sisa Stok Setelah dibeli");
                    System.out.println(barang4.toString());
                } else if (pil == 5) {
                    System.out.print("Masukkan Jumlah Ayam/ekor yang ingin dibeli: ");
                    int banyak = in.nextInt();
                    barang5.sisaStok(banyak);
                    System.out.println("Jumlah yang dibeli = " + banyak);
                    System.out.println("Harga satu ekor ayam= " + barang5.getHarga());
                    System.out.println("Total yang harus dibayar = " + banyak + " x " + barang5.getHarga() + " = Rp." + banyak * barang5.getHarga());
                    System.out.println("==============================================================");
                    System.out.println();
                    System.out.println("Laporan Sisa Stok Setelah dibeli");
                    System.out.println(barang5.toString());
                } else {
                    System.out.println("PILIHAN SALAH!");
                }

                System.out.println("==============================================================");
                System.out.println();
                System.out.println("Apakah masih ingin berbelanja?");
                System.out.println("1. Masih");
                System.out.println("2. Tidak");
                System.out.print("Silakan masukan angka: ");
                pil2 = in.nextInt();
                if (pil2 == 2) {
                    System.out.println();
                    System.out.println("Terima Kasih Telah Berbelanja!");
                } else if (pil2 == 1) {
                    System.out.println("MENU KASIR SWALAYAN BIGPHO!!!");
                    System.out.println("==============================================================");
                    System.out.println(barang1.toString());
                    System.out.println(barang2.toString());
                    System.out.println(barang3.toString());
                    System.out.println(barang4.toString());
                    System.out.println(barang5.toString());
                    System.out.println("==============================================================");
                    System.out.println();
                } else
                    System.out.println("ERROR! BYE BYE!");
            } while (pil2 == 1);
        }
    }
}
