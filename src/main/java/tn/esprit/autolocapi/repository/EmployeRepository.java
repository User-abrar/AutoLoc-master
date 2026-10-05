package tn.esprit.autolocapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.autolocapi.domain.Employe;

@Repository
public interface EmployeRepository extends CrudRepository<Employe, Long> {
}
