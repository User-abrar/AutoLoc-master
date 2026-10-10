package tn.esprit.autolocapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.autolocapi.domain.Paiement;

@Repository
public interface PaiementRepository extends CrudRepository<Paiement, Long> {
}