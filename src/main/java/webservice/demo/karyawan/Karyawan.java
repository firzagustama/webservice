package webservice.demo.karyawan;

public class Karyawan {
    String kode;
    String nama;
    String alamat;
    Integer phone;

    public Karyawan() {

    }

    public Karyawan(String kode, String nama, String alamat, Integer phone) {
        this.kode = kode;
        this.nama = nama;
        this.alamat = alamat;
        this.phone = phone;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }
}
