package webservice.demo;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;
import webservice.demo.resource.JadwalResource;
import webservice.demo.resource.KaryawanResource;
import webservice.demo.resource.NilaiResource;
import webservice.demo.resource.Resource;

@Component
public class Config extends ResourceConfig {
    public Config() {
        register(Resource.class);
        register(KaryawanResource.class);
        register(JadwalResource.class);
        register(NilaiResource.class);
    }
}
