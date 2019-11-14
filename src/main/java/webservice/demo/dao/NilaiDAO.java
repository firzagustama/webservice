package webservice.demo.dao;

import webservice.demo.model.Jadwal;
import webservice.demo.model.Karyawan;
import webservice.demo.model.Nilai;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

public class NilaiDAO extends Dao {

    public static List<Nilai> getNilai(String kode) {
        List<Nilai> nilaiList = new ArrayList<>();
        String sql = "SELECT * FROM nilai n " +
                "INNER JOIN karyawan k ON k.kode = n.kode_karyawan " +
                "INNER JOIN jadwal j ON j.kode = n.kode_jadwal " +
                "WHERE k.kode = ?";

        System.out.println(sql);

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, kode);

            ResultSet rs = preparedStatement.executeQuery();
            nilaiList = arrayMap(rs);
        } catch (SQLException e) {
            System.out.println(e);
        }

        return nilaiList;
    }

    public static List<Nilai> arrayMap(ResultSet rs) throws SQLException {
        List<Nilai> nilaiList = new ArrayList<>();
        while (rs.next()) {
            String kodeKaryawan = rs.getString("kode_karyawan");
            String nama = rs.getString("nama");
            String alamat = rs.getString("alamat");
            String phone = rs.getString("phone");
            Karyawan karyawan = new Karyawan(kodeKaryawan, nama, alamat, phone);

            String kodeJadwal = rs.getString("kode_jadwal");
            String materi = rs.getString("materi");
            String tanggal = rs.getString("tanggal");
            Integer lokasi = rs.getInt("lokasi");
            Integer session = rs.getInt("session");
            Jadwal jadwal = new Jadwal(kodeJadwal, materi, tanggal, lokasi, session);

            Integer nilai = rs.getInt("nilai");
            nilaiList.add(new Nilai(karyawan, jadwal, nilai));
        }

        return nilaiList;
    }
}
