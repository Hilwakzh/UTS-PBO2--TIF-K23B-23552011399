package model;

public class Klaim {
    private int id;
    private int polisId;
    private String tanggal;
    private String status;

    public Klaim(int id, int polisId, String tanggal, String status) {
        this.id = id;
        this.polisId = polisId;
        this.tanggal = tanggal;
        this.status = status;
    }

    public int getId() { return id; }
    public int getPolisId() { return polisId; }
    public String getTanggal() { return tanggal; }
    public String getStatus() { return status; }

    public void setStatus(String status) { this.status = status; }
}
