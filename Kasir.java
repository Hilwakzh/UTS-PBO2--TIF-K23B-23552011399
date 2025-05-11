package service;

import model.Asuransi;
import model.Nasabah;
import java.sql.*;

public class Kasir {

    public void tambahNasabah(Nasabah n) {
        String sql = "INSERT INTO nasabah(id, nama, umur) VALUES (?, ?, ?)";
        try (PreparedStatement pstmt = Database.connect().prepareStatement(sql)) {
            pstmt.setInt(1, n.getId());
            pstmt.setString(2, n.getNama());
            pstmt.setInt(3, n.getUmur());
            pstmt.executeUpdate();
            System.out.println("Nasabah berhasil ditambahkan.");
        } catch (SQLException e) {
            System.out.println("Gagal tambah nasabah: " + e.getMessage());
        }
    }

    public void buatPolis(int nasabahId, Asuransi asuransi) {
        String sql = "INSERT INTO polis(nasabah_id, jenis, premi) VALUES (?, ?, ?)";
        try (PreparedStatement pstmt = Database.connect().prepareStatement(sql)) {
            pstmt.setInt(1, nasabahId);
            pstmt.setString(2, asuransi.getJenis());
            pstmt.setDouble(3, asuransi.hitungPremi());
            pstmt.executeUpdate();
            System.out.println("Polis berhasil dibuat.");
        } catch (SQLException e) {
            System.out.println("Gagal buat polis: " + e.getMessage());
        }
    }
}
