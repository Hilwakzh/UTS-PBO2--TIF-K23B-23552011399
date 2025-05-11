package model;

public class Polis {
    private int id;
    private int nasabahId;
    private String jenis;
    private double premi;

    public Polis(int id, int nasabahId, String jenis, double premi) {
        this.id = id;
        this.nasabahId = nasabahId;
        this.jenis = jenis;
        this.premi = premi;
    }

    public int getId() { return id; }
    public int getNasabahId() { return nasabahId; }
    public String getJenis() { return jenis; }
    public double getPremi() { return premi; }

    public void setJenis(String jenis) { this.jenis = jenis; }
    public void setPremi(double premi) { this.premi = premi; }
}

