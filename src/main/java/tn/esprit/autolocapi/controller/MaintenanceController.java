package tn.esprit.autolocapi.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autolocapi.domain.Maintenance;
import tn.esprit.autolocapi.service.IMaintenanceService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/Maintenance")
public class MaintenanceController {

    private final IMaintenanceService im;

    @PostMapping("/addMaintenance")
    public Maintenance addMaintenance(@RequestBody Maintenance m) {
        return im.addMaintenance(m);
    }

    @GetMapping("/getMaintenances")
    public List<Maintenance> getAllMaintenances() {
        return im.retrieveAllMaintenances();
    }

    @PostMapping("/addMaintenances")
    public List<Maintenance> addMaintenances(@RequestBody List<Maintenance> maintenances) {
        return im.addMaintenances(maintenances);
    }

    @GetMapping("/getMaintenanceById/{idm}")
    public Maintenance getMaintenanceById(@PathVariable long idm) {
        return im.retrieveMaintenance(idm);
    }

    @DeleteMapping("/deleteMaintenance/{idm}")
    public void deleteMaintenance(@PathVariable long idm) {
        im.removeMaintenance(idm);
    }

    @PutMapping("/updateMaintenance")
    public Maintenance updateMaintenance(@RequestBody Maintenance m) {
        return im.updateMaintenance(m);
    }
}