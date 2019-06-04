package br.com.esmaelgoncalves.ribbonserver.controller;

import br.com.esmaelgoncalves.ribbonserver.model.Planet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.validation.Valid;

@RestController
public class StarwarsController {

    @Autowired
    private RestTemplate restTemplate;

    @PostMapping
    public ResponseEntity addPlanet(@Valid @RequestBody Planet planet) {
        return restTemplate.postForEntity("http://starwars/starwars/api/planets/", planet, String.class);
    }

    @DeleteMapping("/{id}")
    public void deletePlanet(@PathVariable Long id) {
        restTemplate.delete("http://starwars/starwars/api/planets/", id);
    }

    @GetMapping("/{id}")
    public ResponseEntity findById(@PathVariable Long id) {
        String uri = String.format("http://starwars/starwars/api/planets/%s", id);
        return restTemplate.getForEntity(uri, String.class);
    }
}
