package br.edu.ifpr.cars.api;

import java.util.List;

import org.spirngframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequesMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifpr.cars.domain.DriverRepository;

@Service
@RestController
@RequestMapping (produces = MediaType.APPLICATION_JSON_VALUE)
public class DriverController {
    
    @Autowired // injeção de dependência
    DriverRepository driverRepository; // Objeto instancia do repositório

    @GetMapping("/drivers")
    public List<Driver> listDrivers() {
        return driverRepository.findAll();
    }
}
