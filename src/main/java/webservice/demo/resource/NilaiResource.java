package webservice.demo.resource;

import webservice.demo.dao.NilaiDAO;
import webservice.demo.model.Nilai;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name="nilaiResource")
@Path("/nilai")
public class NilaiResource {

    @GET
    @Path("/{kode}")
    @Produces({MediaType.APPLICATION_JSON})
    public List<Nilai> getNilai(@PathParam("kode") String kode) {
        return NilaiDAO.getNilai(kode);
    }

}
