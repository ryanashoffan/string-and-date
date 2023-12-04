import java.util.Scanner;

public class MainTransaksi {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        try {
            // Input data dari user
            System.out.print("Masukkan No Struk: ");
            int noFaktur = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Masukkan Nama Pelanggan: ");
            String namaPelanggan = scanner.nextLine();
            System.out.print("Masukkan No. HP Pelanggan: ");
            String noHP = scanner.nextLine();
            System.out.print("Masukkan Alamat Pelanggan: ");
            String alamat = scanner.nextLine();
            System.out.print("Masukkan Kode Barang: ");
            String kodeBarang = scanner.nextLine();
            System.out.print("Masukkan Nama Barang: ");
            String namaBarang = scanner.nextLine();
            System.out.print("Masukkan Harga Barang: ");
            double hargaBarang = scanner.nextDouble();
            System.out.print("Masukkan Jumlah Beli: ");
            int jumlahBeli = scanner.nextInt();

            // Membuat objek Transaksi
            TransaksiBaru transaksi = new TransaksiBaru(noFaktur, namaPelanggan, noHP, alamat, kodeBarang, namaBarang, hargaBarang, jumlahBeli);
            // Menampilkan informasi transaksi
            transaksi.tampilkanInformasi();

        } catch (Exception e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}