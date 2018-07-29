package com.cjwalls.looktothestars.controllers;

import com.cjwalls.looktothestars.models.Planet;
import com.cjwalls.looktothestars.models.api.response.RestResponseBody;
import com.cjwalls.looktothestars.models.api.response.RestResponseErrorBody;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

@RequestMapping("/api/v1")
@RestController
public class PlanetDataController {

    @GetMapping("/planets")
    @ResponseBody
    public RestResponseBody getPlanet(@RequestParam(name="query-type", required=false, defaultValue="random") String queryType, HttpServletResponse response) {
        if (queryType.toLowerCase().equals("random")) {
             return new RestResponseBody(new Planet("Earth", 10, 100, "0xFFFFF"), null);
        }
        response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
        return new RestResponseErrorBody("Unknown query type.");

    }
}
