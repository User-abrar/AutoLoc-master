package tn.esprit.autolocapi.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autolocapi.domain.Vehicule;
import tn.esprit.autolocapi.service.IVehiculeService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/Vehicule")
public class VehiculeController {

    private final IVehiculeService iv;

    @PostMapping("/addVehicule")
    public Vehicule addVehicule(@RequestBody Vehicule v) {
        return iv.addVehicule(v);
    }

    @GetMapping("/getVehicules")
    public List<Vehicule> getAllVehicules() {
        return iv.retrieveAllVehicules();
    }

    @PostMapping("/addVehicules")
    public List<Vehicule> addVehicules(@RequestBody List<Vehicule> vehicules) {
        return iv.addVehicules(vehicules);
    }

    @GetMapping("/getVehiculeById/{idv}")
    public Vehicule getVehiculeById(@PathVariable long idv) {
        return iv.retrieveVehicule(idv);
    }

    @DeleteMapping("/deleteVehicule/{idv}")
    public void deleteVehicule(@PathVariable long idv) {
        iv.removeVehicule(idv);
    }

    @PutMapping("/updateVehicule")
    public Vehicule updateVehicule(@RequestBody Vehicule v) {
        return iv.updateVehicule(v);
    }
}
