package polyinterface_new.geomapp;

import polyinterface_new.Geom2D;

import java.util.ArrayList;
import java.util.Scanner;

public class Geom2DApp {

    public static ArrayList<Geom2D> purchase = new ArrayList<Geom2D>();
    public static double hargaTotal = 0;
    public static int iterasi = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = 0;
        int i = 0;

        while (input != 9){
            iteration();
            System.out.println("------------------------------");
            System.out.println("Konfirmasi: Apakah ingin membeli lagi?");
            System.out.println("9. Tidak");
            System.out.println("1. Iya");
            System.out.print("Masukkan input: ");
            input = sc.nextInt();
            i++;
        }

        if (hargaTotal != 0) {
            System.out.println();
            System.out.println("------------------------------");
            System.out.print("Total harga yang harus dibayar: ");
            System.out.println(hargaTotal);
            System.out.println("------------------------------");
            System.out.println("Silahkan membayar dikasir :)");
            System.out.println("Terimakasih telah berbelanja");
        }

    }

    public static void iteration(){
        int input = 0;
        int jumlah = 1;

        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu();
        Buyment buy = new Buyment();

        menu.showDashboard();
        input = sc.nextInt();

        if (input == 9){

        } else {
            menu.showMainMenu(input);
            jumlah = sc.nextInt();
            if (jumlah == 9){

            } else {
                menu.showOptionBuyMenu(input);
                purchase.add(buy.Buy(input));

                hargaTotal = hargaTotal + (purchase.get(iterasi).getPrice() * jumlah);
                menu.showHeader(input);
                System.out.println("Informasi Pembelian Saat ini");
                System.out.println("------------------------------");
                System.out.print("Harga permeter persegi: ");
                System.out.println(purchase.get(iterasi).getPrice());
                System.out.print("Total harga sekarang: ");
                System.out.println(hargaTotal);
                iterasi++;
            }
        }
    }
}
