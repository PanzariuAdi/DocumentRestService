package info.uaic.ro.restservice.resources;

import com.google.gson.Gson;
import info.uaic.ro.restservice.entities.Document;
import info.uaic.ro.restservice.repositories.DocumentRepository;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import java.util.List;

@Path("/documents")
public class DocumentResource {
    @Inject
    DocumentRepository documentRepository;

    @GET
    @Path("/all")
    @Produces("application/json")
    public String findAll() {
        List<Document> documents = documentRepository.findAll();
        return new Gson().toJson(documents);
    }

    @GET
    @Path("/{id}")
    @Produces("application/json")
    public String findById(@PathParam("id") int id) {
        Document document = documentRepository.findById(id);
        return new Gson().toJson(document);
    }
}
