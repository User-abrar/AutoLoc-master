package tn.esprit.autolocapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.autolocapi.domain.Vehicule;
import tn.esprit.autolocapi.repository.VehiculeRepository;

import java.util.List;

@Service
public class VehiculeService implements IVehiculeService {

    @Autowired
    VehiculeRepository vehRepo;

    @Override
    public List<Vehicule> retrieveAllVehicules() {
        return (List<Vehicule>) vehRepo.findAll();
    }

    @Override
    public Vehicule addVehicule(Vehicule v) {
        return vehRepo.save(v);
    }

    @Override
    public Vehicule updateVehicule(Vehicule v) {
        return vehRepo.save(v);
    }

    @Override
    public Vehicule retrieveVehicule(Long idVehicule) {
        return vehRepo.findById(idVehicule).orElse(null);
    }

    @Override
    public void removeVehicule(Long idVehicule) {
        vehRepo.deleteById(idVehicule);
    }

    @Override
    public List<Vehicule> addVehicules(List<Vehicule> vehicules) {
        return (List<Vehicule>) vehRepo.saveAll(vehicules);
    }
}