package com.mca.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/test")
public class TestRest {
    static int i =0;
    @GET
    @Path("/{name}")
    public Response getMsg(@PathParam("name") String name) {

        String array[]= {" You are awesome ", " You are the master of Motta", "  You are the SuperDuper Suku"};
        String output=null;

        if (name.equalsIgnoreCase("suku"))
        {
            output = "Welcome , " + name + array[i];
            i++;
            if (i ==2)
            {
                i=0;
            }
        }
        else
        {
            output = "Welcome , " + name;
        }


//        return Response.status(200).entity(output).build();
        return Response.status(200).entity(output).build();

    }

}