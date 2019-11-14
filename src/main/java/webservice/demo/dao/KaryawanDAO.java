package webservice.demo.dao;

import webservice.demo.model.Karyawan;

import java.sql.*;

public class KaryawanDAO extends Dao {
    public static Karyawan getKaryawan(String kode) {
        Karyawan karyawan = new Karyawan();
        String sql = "SELECT * FROM karyawan WHERE kode = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, kode);
            ResultSet rs = preparedStatement.executeQuery();

            rs.next();
            karyawan = mapper(rs);
        } catch (SQLException e) {
            System.out.println(e);
        }

        return karyawan;
    }

    public static Karyawan addKaryawan(Karyawan karyawan)  {
        String sql = "INSERT INTO karyawan VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, karyawan.getKode());
            preparedStatement.setString(2, karyawan.getNama());
            preparedStatement.setString(3, karyawan.getAlamat());
            preparedStatement.setString(4, karyawan.getPhone());
            preparedStatement.execute();
        } catch (SQLException e) {
            System.out.println(e);
        }

        return karyawan;
    }

    public static Karyawan mapper(ResultSet rs) throws SQLException {
        String kode = rs.getString("kode");
        String nama = rs.getString("nama");
        String alamat = rs.getString("alamat");
        String phone = rs.getString("phone");

        return new Karyawan(kode, nama, alamat, phone);
    }
}
