package com.shopping;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.ArrayList;
import java.util.List;

@Path("/home")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)

    public String hello() {
        return "Welcome to E-Commerce shopping ";
    }
}
