package com.cjwalls.looktothestars.controllers;

import com.cjwalls.looktothestars.models.api.response.RestResponseBody;
import com.cjwalls.looktothestars.models.api.response.RestResponseErrorBody;
import com.cjwalls.looktothestars.services.PlanetRandomizerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

@RequestMapping("/api/v1")
@RestController
public class PlanetDataController {

    @Autowired
    PlanetRandomizerService randomizerService;

    @CrossOrigin
    @GetMapping("/planets")
    @ResponseBody
    public RestResponseBody getPlanet(@RequestParam(name="query-type", required=false, defaultValue="random") String queryType, HttpServletResponse response) {
        if (queryType.toLowerCase().equals("random")) {
             return new RestResponseBody(randomizerService.getRandomPlanet(), null);
        }
        response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
        return new RestResponseErrorBody("Unknown query type.");

    }
}
