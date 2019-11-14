package webservice.demo.resource;

import webservice.demo.dao.KaryawanDAO;
import webservice.demo.model.Karyawan;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name="karyawanResource")
@Path("/karyawan")
public class KaryawanResource {
    @POST
    @Path("/")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    public Karyawan addKaryawan(Karyawan karyawan) {
        return KaryawanDAO.addKaryawan(karyawan);
    }

    @GET
    @Path("/{kode}")
    @Produces({MediaType.APPLICATION_JSON})
    public Karyawan getKaryawan(@PathParam("kode") String kode) {
        return KaryawanDAO.getKaryawan(kode);
    }
}
