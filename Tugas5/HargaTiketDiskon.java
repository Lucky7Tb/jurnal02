import java.util.Scanner;

public class HargaTiketDiskon {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        String kotaTujuan;
        int jumlahPenumpang;
        double totalHarga = 0;

        System.out.println("Soal ke-4\n");
        System.out.println("Nama  : Lucky Tri Bhakti");
        System.out.println("Kelas : D3-RPL-4401");    
        System.out.println("NIM   : 6706202055\n");

        System.out.print("Kota tujuan anda: ");
        kotaTujuan = userInput.nextLine().toLowerCase();

        System.out.print("Jumlah penumpang: ");
        jumlahPenumpang = userInput.nextInt();

        userInput.close();

        switch (kotaTujuan) {
            case "jakarta":
                totalHarga = jumlahPenumpang * 145000;
                break;
            case "bogor":
                totalHarga = jumlahPenumpang * 200000;
                if(totalHarga > 250000){
                    totalHarga = totalHarga - ( 0.1 * totalHarga);
                }
                break;
            case "garut":
            case "purwakarta":
                totalHarga = jumlahPenumpang * 75000;
                break;
            default:
                System.out.println("Kota tujuan tidak ada");
                break;
        }

        System.out.println("Harga total yang harus di bayar: Rp." + (int)totalHarga);

    }
    
}
