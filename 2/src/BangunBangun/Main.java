package BangunBangun;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char tanya;
        do {
            final double Phi = 3.14;
            Cek Data = new Cek();
            int pilih, sisi , jari, panjang, lebar, tinggi, alas;
            System.out.print(" Menu :\n 1. Persegi\n 2. Lingkaran\n 3. Persegi Panjang\n 4. Segitiga\n 5. Kubus\n 6. Silinder\n 7. Balok\n 8. Sudahi Saja\n Pilihan : ");
            pilih = input.nextInt();
            switch (pilih) {
                case 1 -> {
                    System.out.println(" \nPERSEGI\n Inputan :");
                    System.out.print("  Sisi    = ");
                    sisi = Data.data();
                    if(sisi>=1) {
                        System.out.println();
                        System.out.println(" Hasil   :");
                        BangunDatar persegi = new Persegi(sisi);
                        System.out.println("  Luas Persegi    = " + persegi.luas());
                        System.out.println("  Keliling Persegi= " + persegi.keliling());
                    }
                }
                case 2 -> {
                    System.out.println(" \nLINGKARAN\n Inputan :");
                    System.out.println("  Phi    = " + Phi);
                    System.out.print("  Jari-jari = ");
                    jari = Data.data();
                    if(jari>=1) {
                        System.out.println();
                        System.out.println(" Hasil   :");
                        BangunDatar lingkaran = new Lingkaran(jari, Phi);
                        System.out.println("  Luas Lingkaran = " + lingkaran.luas());
                        System.out.println("  Keliling Lingkaran= " + lingkaran.keliling());
                    }
                }
                case 3 -> {
                    System.out.println(" \nPERSEGI PANJANG\n Inputan :");
                    System.out.print("  Panjang = ");
                    panjang = Data.data();
                    if(panjang>=1 ) {
                        System.out.print("  Lebar = ");
                        lebar = Data.data();
                        if (lebar >= 1) {
                            System.out.println();
                            System.out.println(" Hasil   :");
                            BangunDatar persegiPanjang = new PersegiPanjang(panjang, lebar);
                            System.out.println("  Luas Persegi Panjang   = " + persegiPanjang.luas());
                            System.out.println("  Keliling Persegi Panjang   = " + persegiPanjang.keliling());
                        }
                    }
                }
                case 4 -> {
                    System.out.println(" \nSEGITIGA\n Inputan :");
                    System.out.print("  Tinggi = ");
                    tinggi = Data.data();
                    if(tinggi>=1) {
                        System.out.print("  Alas = ");
                        alas = Data.data();
                        if (alas >= 1) {
                            System.out.println();
                            System.out.println(" Hasil   :");
                            BangunDatar segitiga = new Segitiga(tinggi, alas);
                            System.out.println("  Luas Segitiga   = " + segitiga.luas());
                            System.out.println("  Keliling Segitiga   = " + segitiga.keliling());
                        }
                    }
                }
                case 5 -> {
                    System.out.println(" \nKUBUS\n Inputan :");
                    System.out.print("  Sisi = ");
                    sisi = Data.data();
                    if(sisi>=1){
                        System.out.println();
                        System.out.println(" Hasil   :");
                        BangunRuang kubus = new Kubus(sisi);
                        System.out.println("  Luas Alas Kubus   = " + kubus.luas());
                        System.out.println("  Keliling Alas Kubus   = " + kubus.keliling());
                        System.out.println("  Volume Kubus   = " + kubus.Volume());
                        System.out.println("  Luas Permukaan Kubus   = " + kubus.LuasPermukaan());
                    }
                }
                case 6 -> {
                    System.out.println(" \nSILINDER\n Inputan :");
                    System.out.println("  Phi = "+ Phi);
                    System.out.print("  Jari = ");
                    jari = Data.data();
                    if(jari>=1) {
                        System.out.print("  Tinggi = ");
                        tinggi = Data.data();
                        if (tinggi >= 1) {
                            System.out.println();
                            System.out.println(" Hasil   :");
                            BangunRuang silinder = new Silinder(Phi, jari, tinggi);
                            System.out.println("  Luas Alas Silinder   = " + silinder.luas());
                            System.out.println("  Luas Alas Silinder   = " + silinder.keliling());
                            System.out.println("  Volume Silinder   = " + silinder.Volume());
                            System.out.println("  Luas Selimut Silinder   = " + silinder.LuasSelimut());
                            System.out.println("  Luas Permukaan Silinder dengan Tutup   = " + silinder.LuasPermukaanTutup());
                            System.out.println("  Luas Permukaan Silinder Tanpa Tutup   = " + silinder.LuasPermukaanTanpaTutup());
                        }
                    }
                }
                case 7 -> {
                    System.out.println(" \nBALOK\n Inputan :");
                    System.out.print("  Panjang = ");
                    panjang = Data.data();
                    if (panjang >= 1) {
                        System.out.print("  Lebar = ");
                        lebar = Data.data();
                        if (lebar >= 1) {
                            System.out.print("  Tinggi = ");
                            tinggi = Data.data();
                            if (tinggi >= 1) {
                                System.out.println();
                                System.out.println(" Hasil   :");
                                BangunRuang balok = new Balok(panjang, lebar, tinggi);
                                System.out.println("  Luas Alas Balok   = " + balok.luas());
                                System.out.println("  Keliling Alas Balok   = " + balok.keliling());
                                System.out.println("  Volume Balok   = " + balok.Volume());
                                System.out.println("  Luas Permukaan Balok   = " + balok.LuasPermukaan());
                            }
                        }
                    }
                }
                default -> System.out.println(" Inputan Salah");
            }
            System.out.println();
            System.out.print(" Apakah anda ingin kembali ? ");
            tanya = input.next().charAt(0);
        }while(tanya=='y' || tanya=='Y' );
    }
}
