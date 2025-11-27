package br.edu.ifpr.cars.repository;

import br.edu.ifpr.cars.domain.TravelRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TravelRequestRepository extends JpaRepository<TravelRequest, Long> {
}
