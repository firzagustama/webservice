package webservice.demo.dao;

import webservice.demo.model.Jadwal;
import webservice.demo.model.Karyawan;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

public class JadwalDAO extends Dao {

    public static Jadwal getJadwal(String kode) {
        Jadwal jadwal = new Jadwal();
        String sql = "SELECT * FROM jadwal WHERE kode = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, kode);
            ResultSet rs = preparedStatement.executeQuery();

            rs.next();
            jadwal = mapper(rs);
        } catch (SQLException e) {
            System.out.println(e);
        }

        return jadwal;
    }

    public static Jadwal mapper(ResultSet rs) throws SQLException {
        String kode = rs.getString("kode");
        String materi = rs.getString("materi");
        String tanggal = rs.getString("tanggal");
        Integer lokasi = rs.getInt("lokasi");
        Integer session = rs.getInt("session");

        return new Jadwal(kode, materi, tanggal, lokasi, session);
    }

}
