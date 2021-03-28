package dev.resource;

import java.util.List;

import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import dev.entity.Student;

@Path("/students")
public class StudentResource {

    @GET
   
    public List<Student> students() {
        return Student.listAll();
    }

    @Transactional
    @POST
    public Response student(Student student){
        student.id = null;
        student.persist();
        return Response.status(Status.CREATED).entity(student).build();
    }
}