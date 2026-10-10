package tn.esprit.autolocapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.autolocapi.domain.Paiement;
import tn.esprit.autolocapi.repository.PaiementRepository;

import java.util.List;

@Service
public class PaiementService implements IPaiementService {

    @Autowired
    PaiementRepository paiRepo;

    @Override
    public List<Paiement> retrieveAllPaiements() {
        return (List<Paiement>) paiRepo.findAll();
    }

    @Override
    public Paiement addPaiement(Paiement p) {
        return paiRepo.save(p);
    }

    @Override
    public Paiement updatePaiement(Paiement p) {
        return paiRepo.save(p);
    }

    @Override
    public Paiement retrievePaiement(Long idPaiement) {
        return paiRepo.findById(idPaiement).orElse(null);
    }

    @Override
    public void removePaiement(Long idPaiement) {
        paiRepo.deleteById(idPaiement);
    }

    @Override
    public List<Paiement> addPaiements(List<Paiement> paiements) {
        return (List<Paiement>) paiRepo.saveAll(paiements);
    }
}
