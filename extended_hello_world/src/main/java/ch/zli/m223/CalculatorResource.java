package ch.zli.m223;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/calculate/add")
public class CalculatorResource {
    @Path("{num}/{num2}")
    @GET
    public String calculate(double num, double num2) {
        double result = num + num2;
        return "Das ergebnis ist: " + result;
    }
}
