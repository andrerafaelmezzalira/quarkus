package dev.resource;

import java.util.List;

import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import dev.entity.Activity;

@Path("/activities")
public class ActivityResource {

    @GET
   
    public List<Activity> activities() {
        return Activity.listAll();
    }

    @Transactional
    @POST
    public Response activity(Activity activity){
        activity.id = null;
        activity.persist();
        return Response.status(Status.CREATED).entity(activity).build();
    }
}