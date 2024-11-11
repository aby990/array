import java.util.Scanner;

public class Barang {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Masukkan Jumlah Barang");
        int jumlahBarang = n.nextInt();
        String namaBarang[] = new String[jumlahBarang];
        for (int i = 0; i < namaBarang.length; i++) {
            System.out.println("Nama Barang yang ingin dibeli");
            namaBarang[i] = n.next();
        }
        System.out.println("Masukkan harga barang");
        int hargaBarang = n.nextInt();

        
       }
    }

