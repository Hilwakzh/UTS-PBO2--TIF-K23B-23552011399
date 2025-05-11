package model;

public class AsuransiKesehatan extends Asuransi {

    public AsuransiKesehatan() {
        super("Kesehatan");
    }

    public double hitungPremi() {
        // Contoh perhitungan premi tetap
        return 500000.0;
    }

    /**
     *
     */
    @Override
    public void tampilkanInfo() {
        System.out.println("Asuransi Kesehatan - Premi: Rp" + hitungPremi());
    }
}

