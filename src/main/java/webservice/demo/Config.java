package webservice.demo;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;
import webservice.demo.jadwal.JadwalResource;
import webservice.demo.karyawan.Karyawan;
import webservice.demo.karyawan.KaryawanResource;
import webservice.demo.nilai.NilaiResource;

@Component
public class Config extends ResourceConfig {
    public Config() {
        register(KaryawanResource.class);
        register(JadwalResource.class);
        register(NilaiResource.class);
    }
}
