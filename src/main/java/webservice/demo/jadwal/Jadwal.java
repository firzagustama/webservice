package webservice.demo.jadwal;

public class Jadwal {
    Integer id;
    String materi;
    String tanggal;
    Integer lokasi;
    Integer session;

    public Jadwal() {

    }

    public Jadwal(Integer id, String materi, String tanggal, Integer lokasi, Integer session) {
        this.id = id;
        this.materi = materi;
        this.tanggal = tanggal;
        this.lokasi = lokasi;
        this.session = session;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
