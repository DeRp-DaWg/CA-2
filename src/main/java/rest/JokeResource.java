package rest;

import java.util.List;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import dtos.JokeDTO;
import fetcher.JokeFetcher;

/**
 * REST Web Service
 *
 * @author lam
 */
@Path("jokes")
public class JokeResource {
    @Context
    private UriInfo context;

    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJokes() {
//        return "{hej}";
        return GSON.toJson(JokeFetcher.get());
    }
}
