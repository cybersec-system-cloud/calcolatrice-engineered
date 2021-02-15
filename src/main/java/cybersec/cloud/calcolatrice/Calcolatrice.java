package cybersec.cloud.calcolatrice;

import java.util.Optional;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

@Path("/calcolatrice")
@Produces(MediaType.APPLICATION_JSON)
public class Calcolatrice {
        
    public Calcolatrice() { }
    
    @GET
    @Path("/somma")
    public Response somma(
        @QueryParam("n") Optional<Integer> n,
        @QueryParam("m") Optional<Integer> m
    ) {
        // Se "n" o "m" non specificati,
        // restituisce un messaggio di errore (BAD REQUEST)
        if(!n.isPresent() || !m.isPresent()) {
            return Response.status(Status.BAD_REQUEST)
                    .entity("Specificare sia n sia m")
                    .type(MediaType.TEXT_PLAIN)
                    .build();
        }
        // Altrimenti, restituisce risultato
        Somma ris = new Somma(n.get(),m.get(),n.get()+m.get());
        return Response.ok().entity(ris).build();
    }

    @GET
    @Path("/differenza")
    public Response differenza(
        @QueryParam("n") Optional<Integer> n,
        @QueryParam("m") Optional<Integer> m
    ) {
        // Se "n" o "m" non specificati,
        // restituisce un messaggio di errore (BAD REQUEST)
        if(!n.isPresent() || !m.isPresent()) {
            return Response.status(Status.BAD_REQUEST)
                    .entity("Specificare sia n sia m")
                    .type(MediaType.TEXT_PLAIN)
                    .build();
        }
        // Altrimenti, restituisce risultato
        Differenza ris = new Differenza(n.get(),m.get(),n.get()-m.get());
        return Response.ok().entity(ris).build();
    }

    @GET
    @Path("/prodotto")
    public Response prodotto(
        @QueryParam("n") Optional<Integer> n,
        @QueryParam("m") Optional<Integer> m
    ) {
        // Se "n" o "m" non specificati,
        // restituisce un messaggio di errore (BAD REQUEST)
        if(!n.isPresent() || !m.isPresent()) {
            return Response.status(Status.BAD_REQUEST)
                    .entity("Specificare sia n sia m")
                    .type(MediaType.TEXT_PLAIN)
                    .build();
        }
        // Altrimenti, restituisce risultato
        Prodotto ris = new Prodotto(n.get(),m.get(),n.get()*m.get());
        return Response.ok().entity(ris).build();
    }
    
    @GET
    @Path("/divisione")
    public Response divisione(
        @QueryParam("n") Optional<Integer> n,
        @QueryParam("m") Optional<Integer> m
    ) {
        // Se "n" o "m" non specificati,
        // restituisce un messaggio di errore (BAD REQUEST)
        if(!n.isPresent() || !m.isPresent()) {
            return Response.status(Status.BAD_REQUEST)
                    .entity("Specificare sia n sia m")
                    .type(MediaType.TEXT_PLAIN)
                    .build();
        }
        // Altrimenti, restituisce risultato
        Quoziente ris = new Quoziente(n.get(),m.get(),n.get()/m.get(),n.get()%m.get());
        return Response.ok().entity(ris).build();
    }
}
