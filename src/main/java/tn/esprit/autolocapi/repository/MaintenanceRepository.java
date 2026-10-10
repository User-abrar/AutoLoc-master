package tn.esprit.autolocapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.autolocapi.domain.Maintenance;

@Repository
public interface MaintenanceRepository extends CrudRepository<Maintenance, Long> {
}
