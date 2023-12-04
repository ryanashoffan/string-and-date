import java.text.SimpleDateFormat;
import java.util.Date;

class TransaksiBaru extends Barang implements TotalBayar {
    private int noFaktur;
    private String namaPelanggan;
    private String noHP;
    private String alamat;
    private String kodeBarang;
    private int jumlahBeli;

    public TransaksiBaru(int noFaktur, String namaPelanggan, String noHP, String alamat, String kodeBarang, String namaBarang, double hargaBarang, int jumlahBeli) {
        super(namaBarang, hargaBarang);
        this.noFaktur = noFaktur;
        this.namaPelanggan = namaPelanggan;
        this.noHP = noHP;
        this.alamat = alamat;
        this.kodeBarang = kodeBarang;
        this.jumlahBeli = jumlahBeli;
    }

    @Override
    public double hitungTotalBayar() {
        return hargaBarang * jumlahBeli;
    }

    public void tampilkanInformasi() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE, dd/MM/yyyy");
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss z");

        Date date = new Date();
        String formattedDate = dateFormat.format(date);
        String formattedTime = timeFormat.format(date);

        System.out.println("==== TOKO RYAN=====");
        System.out.println("Tanggal: " + formattedDate);
        System.out.println("Waktu: " + formattedTime);
        System.out.println("========================");
        System.out.println("DATA PELANGGAN");
        System.out.println("---------------------");
        System.out.println("Nama Pelanggan: " + namaPelanggan);
        System.out.println("No. HP: " + noHP);
        System.out.println("Alamat: " + alamat);
        System.out.println("++++++++++++++++++++++++");
        System.out.println("DATA PEMBELIAN BARANG");
        System.out.println("------------------------------");
        System.out.println("Kode Barang: " + kodeBarang);
        System.out.println("Nama Barang: " + namaBarang);
        System.out.println("Harga Barang: " + hargaBarang);
        System.out.println("Jumlah Beli: " + jumlahBeli);
        System.out.println("TOTAL BAYAR: " + hitungTotalBayar());
        System.out.println("++++++++++++++++++++++++");
        System.out.println("Kasir:Ucok");
    }
}