package webservice.demo.resource;

import webservice.demo.dao.JadwalDAO;
import webservice.demo.model.Jadwal;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name="jadwalResource")
@Path("/jadwal")
public class JadwalResource {
    @GET
    @Path("/{id}")
    @Produces({MediaType.APPLICATION_JSON})
    public Jadwal getJadwal(@PathParam("id") String id) {
        return JadwalDAO.getJadwal(id);
    }
}
