package ma.emsi.elmountassarmohcine.tp3.resource;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/guide")
public class GuideTouristiqueResource {

    /**
     * Retourne le lieu reçu dans le chemin de la requête.
     *
     * @param villeOuPays nom de la ville ou du pays
     * @return le lieu demandé
     */
    @GET
    @Path("lieu/{ville_ou_pays}")
    @Produces(MediaType.APPLICATION_JSON)
    public String[] endroitsDeVisite(
            @PathParam("ville_ou_pays") String villeOuPays) {
        return new String[]{villeOuPays};
    }
}