package cybersec.cloud.calcolatrice;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/calcolatrice")
@Produces(MediaType.APPLICATION_JSON)
public class Calcolatrice {
        
    public Calcolatrice() { }
    
    @GET
    @Path("/somma")
    public Somma somma(
        @QueryParam("n") int n,
        @QueryParam("m") int m
    ) {
        return new Somma(n,m,n+m);
    }

    @GET
    @Path("/differenza")
    public Differenza differenza(
        @QueryParam("n") int n,
        @QueryParam("m") int m
    ) {
        return new Differenza(n,m,n-m);
    }

    @GET
    @Path("/prodotto")
    public Prodotto prodotto(
        @QueryParam("n") int n,
        @QueryParam("m") int m
    ) {
        return new Prodotto(n,m,n*m);
    }

    @GET
    @Path("/divisione")
    public Quoziente divisione(
        @QueryParam("n") int n,
        @QueryParam("m") int m
    ) {
        return new Quoziente(n,m,n/m,n%m);
    }
}
