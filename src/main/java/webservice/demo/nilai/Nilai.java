package webservice.demo.nilai;

import webservice.demo.jadwal.Jadwal;
import webservice.demo.karyawan.Karyawan;

import java.util.HashMap;
import java.util.Map;

public class Nilai {
    Karyawan karyawan;
    Jadwal jadwal;
    Integer nilai;

    public Nilai() {

    }

    public Nilai(Karyawan karyawan, Jadwal jadwal, Integer nilai) {
        this.karyawan = karyawan;
        this.jadwal = jadwal;
        this.nilai = nilai;
    }

    public Karyawan getKaryawan() {
        return karyawan;
    }

    public void setKaryawan(Karyawan karyawan) {
        this.karyawan = karyawan;
    }

    public Jadwal getJadwal() {
        return jadwal;
    }

    public void setJadwal(Jadwal jadwal) {
        this.jadwal = jadwal;
    }

    public Integer getNilai() {
        return nilai;
    }

    public void setNilai(Integer nilai) {
        this.nilai = nilai;
    }
}
