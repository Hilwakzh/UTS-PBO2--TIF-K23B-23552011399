package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {
    private static Connection conn;

    public static Connection connect() {
        try {
            if (conn == null) {
                conn = DriverManager.getConnection("jdbc:sqlite:asuransi.db");
            }
        } catch (SQLException e) {
            System.out.println("Koneksi gagal: " + e.getMessage());
        }
        return conn;
    }

    public static void setupDatabase() {
        String[] queries = {
            "CREATE TABLE IF NOT EXISTS nasabah(id INTEGER PRIMARY KEY, nama TEXT, umur INTEGER)",
            "CREATE TABLE IF NOT EXISTS polis(id INTEGER PRIMARY KEY AUTOINCREMENT, nasabah_id INTEGER, jenis TEXT, premi REAL)",
            "CREATE TABLE IF NOT EXISTS klaim(id INTEGER PRIMARY KEY AUTOINCREMENT, polis_id INTEGER, tanggal TEXT, status TEXT)"
        };
        try {
            Statement stmt = connect().createStatement();
            for (String sql : queries) {
                stmt.execute(sql);
            }
            System.out.println("Database siap digunakan.");
        } catch (SQLException e) {
            System.out.println("Gagal setup DB: " + e.getMessage());
        }
    }
}

