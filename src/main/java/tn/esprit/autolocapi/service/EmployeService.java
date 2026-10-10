package tn.esprit.autolocapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.autolocapi.domain.Employe;
import tn.esprit.autolocapi.repository.EmployeRepository;

import java.util.List;

@Service
public class EmployeService implements IEmployeService {

    @Autowired
    EmployeRepository empRepo;

    @Override
    public List<Employe> retrieveAllEmployes() {
        return (List<Employe>) empRepo.findAll();
    }

    @Override
    public Employe addEmploye(Employe e) {
        return empRepo.save(e);
    }

    @Override
    public Employe updateEmploye(Employe e) {
        return empRepo.save(e);
    }

    @Override
    public Employe retrieveEmploye(Long idEmploye) {
        return empRepo.findById(idEmploye).orElse(null);
    }

    @Override
    public void removeEmploye(Long idEmploye) {
        empRepo.deleteById(idEmploye);
    }

    @Override
    public List<Employe> addEmployes(List<Employe> employes) {
        return (List<Employe>) empRepo.saveAll(employes);
    }
}