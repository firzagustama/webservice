package webservice.demo.karyawan;

import webservice.demo.jadwal.Jadwal;

import java.util.HashMap;
import java.util.Map;

public class KaryawanDAO {
    private static final Map<String, Karyawan> karyawanMap = new HashMap<>();
    static {
        initEmps();
    }

    private static void initEmps() {
        karyawanMap.put("PEG01", new Karyawan("PEG01", "Yohana", "Jakarta", 12345));
        karyawanMap.put("PEG02", new Karyawan("PEG02", "Yohana", "Jakarta", 12345));
        karyawanMap.put("PEG03", new Karyawan("PEG03", "Yohana", "Jakarta", 12345));
        karyawanMap.put("PEG04", new Karyawan("PEG04", "Yohana", "Jakarta", 12345));
        karyawanMap.put("PEG05", new Karyawan("PEG05", "Yohana", "Jakarta", 12345));
    }

    public static Karyawan getKaryawan(String kode) {
        return karyawanMap.get(kode);
    }

    public static Karyawan addKaryawan(Karyawan karyawan) {
        karyawanMap.put(karyawan.getKode(), karyawan);
        return karyawan;
    }
}
