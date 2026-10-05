package tn.esprit.autolocapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.autolocapi.domain.Equipement;

@Repository
public interface EquipementRepository extends CrudRepository<Equipement, Long> {
}
