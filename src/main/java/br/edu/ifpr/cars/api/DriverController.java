package br.edu.ifpr.cars.api;

import ord.spirngframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifpr.cars.domain.DriverRepository;

@Service
@RestController
public class DriverController {
    
    @Autowired // injeção de dependência
    DriverRepository driverRepository; // Objeto instancia do repositório
}
