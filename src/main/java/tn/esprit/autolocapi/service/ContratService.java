package tn.esprit.autolocapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.autolocapi.domain.Contrat;
import tn.esprit.autolocapi.repository.ContratRepository;

import java.util.List;

@Service
public class ContratService implements IContratService {

    @Autowired
    ContratRepository ctRepo;

    @Override
    public List<Contrat> retrieveAllContrats() {
        return (List<Contrat>) ctRepo.findAll();
    }

    @Override
    public Contrat addContrat(Contrat c) {
        return ctRepo.save(c);
    }

    @Override
    public Contrat updateContrat(Contrat c) {
        return ctRepo.save(c);
    }

    @Override
    public Contrat retrieveContrat(Long idContrat) {
        return ctRepo.findById(idContrat).orElse(null);
    }

    @Override
    public void removeContrat(Long idContrat) {
        ctRepo.deleteById(idContrat);
    }

    @Override
    public List<Contrat> addContrats(List<Contrat> contrats) {
        return (List<Contrat>) ctRepo.saveAll(contrats);
    }
}