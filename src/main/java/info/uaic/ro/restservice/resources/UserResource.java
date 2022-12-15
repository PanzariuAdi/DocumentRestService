package info.uaic.ro.restservice.resources;

import com.google.gson.Gson;
import info.uaic.ro.restservice.entities.User;
import info.uaic.ro.restservice.repositories.UserRepository;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import java.util.List;

@Path("/users")
public class UserResource {
    @Inject
    UserRepository userRepository;

    @GET
    @Path("/")
    @Produces("application/json")
    public String findAll() {
        List<User> users = userRepository.findAll();
        return new Gson().toJson(users);
    }

    @GET
    @Path("/{id}")
    @Produces("text/plain")
    public String findById(@PathParam("id") int id) {
        User user = userRepository.findById(id);
        return new Gson().toJson(user);
    }

}