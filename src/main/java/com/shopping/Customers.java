package com.shopping;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.ArrayList;

@Path("/customers")
public class Customers {
    ArrayList<String> customersName = new ArrayList<String>();
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public ArrayList<String> getCustomersName() {

        customersName.clear();
        customersName.add("Mike");
        customersName.add("john");
        customersName.add("Milly");
        customersName.add("Mat");
        return customersName;
    }
}
