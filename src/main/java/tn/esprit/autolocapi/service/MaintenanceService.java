package tn.esprit.autolocapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.autolocapi.domain.Maintenance;
import tn.esprit.autolocapi.repository.MaintenanceRepository;

import java.util.List;

@Service
public class MaintenanceService implements IMaintenanceService {

    @Autowired
    MaintenanceRepository mtRepo;

    @Override
    public List<Maintenance> retrieveAllMaintenances() {
        return (List<Maintenance>) mtRepo.findAll();
    }

    @Override
    public Maintenance addMaintenance(Maintenance m) {
        return mtRepo.save(m);
    }

    @Override
    public Maintenance updateMaintenance(Maintenance m) {
        return mtRepo.save(m);
    }

    @Override
    public Maintenance retrieveMaintenance(Long idMaintenance) {
        return mtRepo.findById(idMaintenance).orElse(null);
    }

    @Override
    public void removeMaintenance(Long idMaintenance) {
        mtRepo.deleteById(idMaintenance);
    }

    @Override
    public List<Maintenance> addMaintenances(List<Maintenance> maintenances) {
        return (List<Maintenance>) mtRepo.saveAll(maintenances);
    }
}
