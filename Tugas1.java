import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int tiket, totalTiket = 0 ;
        double totalSemua, totalHarga, totalDiskon, totalHarian = 0, harga = 50000, diskon = 0;
        String transaksi = "";

        do {
            System.out.println("Masukkan jumlah tiket : ");
            tiket = input.nextInt();
            
            if (tiket < 0) {
                System.out.println("Jumlah tiket tidak valid");
                continue;
            }

            if (tiket > 10) {
                diskon = 0.15;
            } else if (tiket > 4) {
                diskon = 0.10;
            }

            totalHarga = tiket * harga;
            totalDiskon = harga * diskon;
            totalSemua = totalHarga - totalDiskon;

            totalTiket += tiket;
            totalHarian += totalSemua;

            input.nextLine();

            System.out.println("Jadi total harga untuk tiket adalah: " + totalSemua);
            System.out.println("apakah melanjutkan transaksi (iya/tidak) : ");
            transaksi = input.nextLine();
        } while (transaksi.equalsIgnoreCase("iya"));

        System.out.println("Jadi total tiket yang terjual adalah = " + totalTiket);
        System.out.println("dan Total semua penjualan dalam sehari adalah = " + totalHarian);
        
    }
}
