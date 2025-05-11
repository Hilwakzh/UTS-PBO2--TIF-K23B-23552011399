import model.*;
import service.*;

public class Main {
    public static void main(String[] args) {
        // Inisialisasi dan setup DB
        Database.setupDatabase();

        // Buat objek kasir
        Kasir kasir = new Kasir();

        // Tambah nasabah
        Nasabah nasabah1 = new Nasabah(1, "Budi", 30);
        kasir.tambahNasabah(nasabah1);

        // Buat polis untuk nasabah
        Asuransi asuransiKesehatan = new AsuransiKesehatan(); // Polymorphism
        kasir.buatPolis(nasabah1.getId(), asuransiKesehatan);

        Asuransi asuransiJiwa = new AsuransiJiwa();
        kasir.buatPolis(nasabah1.getId(), asuransiJiwa);
    }
}

