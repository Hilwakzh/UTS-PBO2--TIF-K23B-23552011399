package model;

public class AsuransiJiwa extends Asuransi {

    public AsuransiJiwa() {
        super("Jiwa");
    }

    @Override
    public double hitungPremi() {
        // Contoh perhitungan premi tetap
        return 750000.0;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Asuransi Jiwa - Premi: Rp" + hitungPremi());
    }
}

