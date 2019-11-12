package webservice.demo.jadwal;

import webservice.demo.karyawan.Karyawan;

import java.util.*;

public class JadwalDAO {
    private static final Map<String, Jadwal> jadwalMap = new HashMap<>();
    static {
        initEmps();
    }

    private static void initEmps() {
        jadwalMap.put("1", new Jadwal(1, "Algoritma", "31-Oct-19", 711, 3));
        jadwalMap.put("2", new Jadwal(2, "Spring Boot", "31-Oct-19", 711, 3));
        jadwalMap.put("3", new Jadwal(3, "Android", "31-Oct-19", 711, 3));
        jadwalMap.put("4", new Jadwal(4, "Phyton", "31-Oct-19", 711, 3));
        jadwalMap.put("5", new Jadwal(5, "Ajax", "31-Oct-19", 711, 3));
    }

    public static Jadwal getJadwal(String id) {
        return jadwalMap.get(id);
    }
}
