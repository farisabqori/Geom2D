package polyinterface_new.geomapp;

public class Menu {

    public String[] shape = {
            "Lingkaran", "Layang-Layang", "Jajargenjang", "Persegi Panjang", "Persegi", "Trapesium", "Segitiga"
    };
    public void showDashboard(){
        System.out.println("Selamat Datang di Toko Geom2D");
        System.out.println("------------------------------");
        System.out.println("Katalog produk:");
        System.out.println("9. Keluar");
        System.out.println("1. Lingkaran");
        System.out.println("2. Layang-layang");
        System.out.println("3. Jajargenjang");
        System.out.println("4. Persegi Panjang");
        System.out.println("5. Persegi");
        System.out.println("6. Trapesium");
        System.out.println("7. Segitiga");
        System.out.println("------------------------------");
        System.out.print("Pilih: ");
    }

    public void showMainMenu(int i){
        System.out.println();
        System.out.println("Menu Pembelian " + shape[i - 1]);
        System.out.println("------------------------------");
        System.out.println("Jumlah Pembelian? (9 untuk kembali)");
    }

    public void showOptionBuyMenu(int i){
        System.out.println();
        System.out.println("Menu Pembelian " + shape[i - 1]);
        System.out.println("------------------------------");
        System.out.println("Masukkan ukuran:");
    }

    public void showHeader(int i){
        System.out.println();
        System.out.println("Menu Pembelian " + shape[i - 1]);
    }
}
