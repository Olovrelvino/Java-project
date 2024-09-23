import java.util.Scanner;

public class ATMSederhana {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int pilihan;

        Rekening rkn = new Rekening("672022030", "Oliver Elvino", 500000, "Bank Sederhana");

        do{
            System.out.println("===ATM Bank Sederhana==="); 
            System.out.println("1. Tarik tunai");
            System.out.println("2. Deposit");
            System.out.println("3. Cek Saldo");
            System.out.println("4. Info Rekening");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu : ");
            pilihan = input.nextInt();

            switch(pilihan) {
                case 1:
                    rkn.tarikTunai(input);
                    tungguEnter(input);
                    break;

                case 2:
                    rkn.deposit(input);
                    tungguEnter(input);
                    break;

                case 3:
                    rkn.cekSaldo(input);
                    tungguEnter(input);
                    break;

                case 4:
                    rkn.infoRekening();
                    tungguEnter(input);
                    break;

                case 5:
                    System.out.println("Terima kasih telah menggunakan Bank Sederhana!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid, coba lagi !\n");

            }
        } while (pilihan != 5);
    }

    
// ---METHOD----

    public static void tungguEnter(Scanner input) {
        System.out.println("\nTekan Enter untuk next abangkuu...");
        try {
            System.in.read();  
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}