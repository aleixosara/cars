package br.edu.ifpr.cars.api;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifpr.cars.domain.TravelRequest;
import br.edu.ifpr.cars.service.TravelService;
import jakarta.validation.Valid;

@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
public class TravelController {

    private final TravelService service;

    public TravelController(TravelService service) {
        this.service = service;
    }

    @GetMapping("/travels")
    public List<TravelRequest> listTravels() {
        return service.listTravels();
    }

    @GetMapping("/travels/{id}")
    public TravelRequest findTravel(@PathVariable("id") Long id) {
        return service.findById(id);
    }

    @PostMapping("/travels")
    public TravelRequest createTravel(@RequestBody @Valid TravelRequest viagem) {
        return service.createTravel(viagem);
    }

    @PutMapping("/travels/{id}")
    public TravelRequest fullUpdateTravel(@PathVariable("id") Long id,
            @RequestBody TravelRequest viagem) {
        return service.fullUpdateTravel(id, viagem);
    }

    @PatchMapping("/travels/{id}")
    public TravelRequest incrementalUpdateTravel(@PathVariable("id") Long id,
            @RequestBody TravelRequest viagem) {
        return service.incrementalUpdateTravel(id, viagem);
    }

    @PostMapping("/travels/{id}/accept")
    public TravelRequest acceptTravel(@PathVariable("id") Long id) {
        return service.acceptTravel(id);
    }

    @DeleteMapping("/travels/{id}")
    public void deleteTravel(@PathVariable("id") Long id) {
        service.deleteTravel(id);
    }
}
