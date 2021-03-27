package dev.resource;

import java.util.List;

import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import dev.entity.Activity;
import dev.entity.Rating;
import dev.entity.Student;

@Path("/ratings")
public class RatingResource {

    @GET
   
    public List<Rating> ratings() {
        return Rating.listAll();
    }

    @Transactional
    @POST
    public Response rating(Rating rating){
        rating.id = null;
        rating.activity = Activity.findById(rating.activity.id);
        rating.student = Student.findById(rating.student.id);
        rating.persist();
        return Response.status(Status.CREATED).entity(rating).build();
    }
}