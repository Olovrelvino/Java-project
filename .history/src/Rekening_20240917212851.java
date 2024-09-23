import java.util.Scanner;

public class Rekening {

    private String noRekening;
    private String namaRekening;
    private double saldo;
    private String namaBank;

    // Constructor dengan 4 atribut
    public Rekening(String noRekening, String namaRekening, double saldo, String namaBank) {
        this.noRekening = noRekening;
        this.namaRekening = namaRekening;
        this.saldo = saldo;
        this.namaBank = namaBank;
    }
    
    // ----METHOD----

    public void tarikTunai(Scanner input){
        System.out.print("Masukkan jumlah yang ingin ditarik : Rp ");
        double jumlah = input.nextDouble();
        if (jumlah > 0 && jumlah <= this.saldo){
            this.saldo -= jumlah;
            System.out.println("Penarikan berhasil. Saldo baru anda : Rp " + this.saldo);  
        } else if (jumlah > this.saldo){
            System.out.println("Saldo tidak mencukupi untuk penarikan");
        }else {
            System.out.println("Jumlah tidak valid!");
        }
    }
        
    public void deposit(Scanner input){
        System.out.print("Masukkan jumlah yang ingin ditambahkan : Rp ");
        double jumlah = input.nextDouble();
        if (jumlah > 0){
            this.saldo += jumlah;
            System.out.println("Deposit berhasil, saldo baru anda : Rp " + this.saldo);
        }else {
            System.out.println("Jumlah tidak valid!");
        }
    }
        
    public void cekSaldo(Scanner input){
        System.out.println("-----Cek Saldo-----");
        System.out.println("1. Cek saldo sekarang");
        System.out.println("2. Cek saldo masa depan");
        System.out.print("Pilih : ");
        int pilihanCek = input.nextInt();

        switch(pilihanCek) {
            case 1:
                System.out.println("Saldo anda saat ini : Rp " + this.saldo);
                break;

            case 2:
                System.out.print("Masukkan jumlah bulan ke depan untuk cek saldo: ");
                int bulan = input.nextInt();
                System.out.print("Masukkan presentase bunga : ");
                double bungaPerBulan = input.nextDouble();

                double saldoMasaDepan = saldo;
                for (int i = 1; i <= bulan; i++) {
                    saldoMasaDepan -= saldoMasaDepan * (bungaPerBulan / 100);
                }
                System.out.println("Saldo anda setelah " + bulan + " bulan dengan potongan bunga " + bungaPerBulan + "% per bulan: Rp " + saldoMasaDepan);
                break;

            default:
                System.out.println("Pilihan tidak valid, kembali ke menu");    
        }
    }

    public void infoRekening(){
        System.out.println("------Informasi Rekening------");
        System.out.println("Nomor Rekening : " + this.noRekening);
        System.out.println("Nama Rekening : " + this.namaRekening);
        System.out.println("Saldo : Rp " + this.saldo);
        System.out.println("Nama Bank : " + this.namaBank);
    }

    public void ubahRekening(String userBaru){
        this.namaRekening = userBaru;
        System.out.println("Pemilik rekening berhasil diubah : " + userBaru);
    }
    
}
