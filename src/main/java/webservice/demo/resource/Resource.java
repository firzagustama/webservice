package webservice.demo.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name="Resource")
@Path("/")
public class Resource {
    @GET
    @Produces({MediaType.TEXT_HTML})
    public String hello() {
        return "Endpoint is : <ul>" +
                "<li>GET /nilai/{kode_karyawan}</li>" +
                "<li>POST /karyawan</li>" +
                "<li>GET /karyawan/{kode}</li>" +
                "<li>GET /jadwal/{kode}</li>" +
                "</ul>";
    }
}
