package tn.esprit.autolocapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.autolocapi.domain.Agence;
import tn.esprit.autolocapi.repository.AgenceRepository;

import java.util.List;

@Service
public class AgenceService implements IAgenceService {

    @Autowired
    AgenceRepository agRepo;

    @Override
    public List<Agence> retrieveAllAgences() {
        return (List<Agence>) agRepo.findAll();
    }

    @Override
    public Agence addAgence(Agence a) {
        return agRepo.save(a);
    }

    @Override
    public Agence updateAgence(Agence a) {
        return agRepo.save(a);
    }

    @Override
    public Agence retrieveAgence(Long idAgence) {
        return agRepo.findById(idAgence).orElse(null);
    }

    @Override
    public void removeAgence(Long idAgence) {
        agRepo.deleteById(idAgence);
    }

    @Override
    public List<Agence> addAgences(List<Agence> agences) {
        return (List<Agence>) agRepo.saveAll(agences);
    }
}
