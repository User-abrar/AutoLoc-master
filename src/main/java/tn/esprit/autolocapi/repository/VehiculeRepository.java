package tn.esprit.autolocapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.autolocapi.domain.Vehicule;

@Repository
public interface VehiculeRepository extends CrudRepository<Vehicule, Long> {
}
