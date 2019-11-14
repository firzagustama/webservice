package webservice.demo.model;

public class Jadwal {
    String kode;
    String materi;
    String tanggal;
    Integer lokasi;
    Integer session;

    public Jadwal() {

    }

    public Jadwal(String kode, String materi, String tanggal, Integer lokasi, Integer session) {
        this.kode = kode;
        this.materi = materi;
        this.tanggal = tanggal;
        this.lokasi = lokasi;
        this.session = session;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getMateri() {
        return materi;
    }

    public void setMateri(String materi) {
        this.materi = materi;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public Integer getLokasi() {
        return lokasi;
    }

    public void setLokasi(Integer lokasi) {
        this.lokasi = lokasi;
    }

    public Integer getSession() {
        return session;
    }

    public void setSession(Integer session) {
        this.session = session;
    }
}
