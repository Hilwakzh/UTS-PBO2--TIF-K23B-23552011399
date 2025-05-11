package model;

public abstract class Asuransi implements LayananAsuransi {
    protected String jenis;

    public Asuransi(String jenis) {
        this.jenis = jenis;
    }

    public String getJenis() {
        return jenis;
    }

    // Karena ini abstract class, hitungPremi harus diimplementasi di subclass
    public abstract double hitungPremi();
}

