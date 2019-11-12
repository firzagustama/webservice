package webservice.demo.nilai;

import webservice.demo.jadwal.Jadwal;
import webservice.demo.karyawan.Karyawan;

import java.util.*;
import java.util.stream.Collectors;

public class NilaiDAO {
    private static final Map<String, Nilai> nilaiMap = new HashMap<>();
    static {
        initEmps();
    }

    private static void initEmps() {
        nilaiMap.put("1", new Nilai(new Karyawan("PEG01", "Yohana", "Jakarta", 12345),  new Jadwal(1, "Algoritma", "31-Oct-19", 711, 3), 100));
        nilaiMap.put("2", new Nilai(new Karyawan("PEG01", "Yohana", "Jakarta", 12345),  new Jadwal(1, "Algoritma", "31-Oct-19", 711, 3), 20));
        nilaiMap.put("3", new Nilai(new Karyawan("PEG01", "Yohana", "Jakarta", 12345),  new Jadwal(1, "Algoritma", "31-Oct-19", 711, 3), 300));
        nilaiMap.put("4", new Nilai(new Karyawan("PEG01", "Yohana", "Jakarta", 12345),  new Jadwal(1, "Algoritma", "31-Oct-19", 711, 3), 80));
    }

    public static List<Nilai> getNilai(String kode) {
        List<Nilai> tmp = new ArrayList<>();
        for (Nilai item : nilaiMap.values()) {
            if (item.getKaryawan().getKode().equalsIgnoreCase(kode))
                tmp.add(item);
        }
        return tmp;
    }

    public static List<Nilai> getAllNilai() {
        Collection<Nilai> c = nilaiMap.values();
        List<Nilai> list = new ArrayList<>();
        list.addAll(c);
        return list;
    };

    List<Nilai> list;
}
