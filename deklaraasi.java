import java.util.Scanner;

public class deklaraasi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("masukkan jumlah siswa");
        int jumlahSiswa = in.nextInt();
        String namaSiswa[] = new String[jumlahSiswa];
        for (int i = 0; i < namaSiswa.length; i++) {
            System.out.println("Input nama siswa");
            namaSiswa[i] = in.next();
        } 
       System.out.println("-----Daftar Nama-----");
       for (int i = 0; i < namaSiswa.length; i++) {
        System.out.println(namaSiswa[i]);
       }
    } 
}