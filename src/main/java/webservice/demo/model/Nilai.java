package webservice.demo.model;

import webservice.demo.model.Jadwal;
import webservice.demo.model.Karyawan;

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
