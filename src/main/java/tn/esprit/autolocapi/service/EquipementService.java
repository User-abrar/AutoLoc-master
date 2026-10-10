package tn.esprit.autolocapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.autolocapi.domain.Equipement;
import tn.esprit.autolocapi.repository.EquipementRepository;

import java.util.List;

@Service
public class EquipementService implements IEquipementService {

    @Autowired
    EquipementRepository eqRepo;

    @Override
    public List<Equipement> retrieveAllEquipements() {
        return (List<Equipement>) eqRepo.findAll();
    }

    @Override
    public Equipement addEquipement(Equipement e) {
        return eqRepo.save(e);
    }

    @Override
    public Equipement updateEquipement(Equipement e) {
        return eqRepo.save(e);
    }

    @Override
    public Equipement retrieveEquipement(Long idEquipement) {
        return eqRepo.findById(idEquipement).orElse(null);
    }

    @Override
    public void removeEquipement(Long idEquipement) {
        eqRepo.deleteById(idEquipement);
    }

    @Override
    public List<Equipement> addEquipements(List<Equipement> equipements) {
        return (List<Equipement>) eqRepo.saveAll(equipements);
    }
}
