package model;

public class Nasabah {
    private final int id;
    private String nama;
    private int umur;

    public Nasabah(int id, String nama, int umur) {
        this.id = id;
        this.nama = nama;
        this.umur = umur;
    }

    public int getId() { return id; }
    public String getNama() { return nama; }
    public int getUmur() { return umur; }

    public void setNama(String nama) { this.nama = nama; }
    public void setUmur(int umur) { this.umur = umur; }
}
