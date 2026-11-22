package ma.emsi.elmountassarmohcine.tp3.resource;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import ma.emsi.elmountassarmohcine.tp3.llm.LlmClient;

@Path("/guide")
public class GuideTouristiqueResource {

    @Inject
    private LlmClient llmClient;

//    /**
//     * Donne deux endroits à visiter et le prix moyen d'un repas.
//     *
//     * @param villeOuPays ville ou pays à découvrir
//     * @return les informations touristiques au format JSON
//     */
//    @GET
//    @Path("lieu/{ville_ou_pays}")
//    @Produces(MediaType.APPLICATION_JSON)
//    public String endroitsDeVisite(
//            @PathParam("ville_ou_pays") String villeOuPays) {
//        return llmClient.envoyerRequete(villeOuPays);
//    }
//
//
    /**
     * Donne les endroits à visiter et le prix moyen d'un repas.
     *
     * @param villeOuPays ville ou pays à découvrir
     * @param nombre nombre d'endroits demandés
     * @return les informations touristiques au format JSON
     */
    @GET
    @Path("lieu/{ville_ou_pays}/{nombre}")
    @Produces(MediaType.APPLICATION_JSON)
    public String endroitsDeVisite(
            @PathParam("ville_ou_pays") String villeOuPays,
            @PathParam("nombre") int nombre) {
        return llmClient.envoyerRequete(villeOuPays, nombre);
    }

}