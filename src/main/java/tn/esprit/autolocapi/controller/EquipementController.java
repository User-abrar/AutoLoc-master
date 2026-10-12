package tn.esprit.autolocapi.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autolocapi.domain.Equipement;
import tn.esprit.autolocapi.service.IEquipementService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/Equipement")
public class EquipementController {

    private final IEquipementService ieq;

    @PostMapping("/addEquipement")
    public Equipement addEquipement(@RequestBody Equipement e) {
        return ieq.addEquipement(e);
    }

    @GetMapping("/getEquipements")
    public List<Equipement> getAllEquipements() {
        return ieq.retrieveAllEquipements();
    }

    @PostMapping("/addEquipements")
    public List<Equipement> addEquipements(@RequestBody List<Equipement> equipements) {
        return ieq.addEquipements(equipements);
    }

    @GetMapping("/getEquipementById/{ide}")
    public Equipement getEquipementById(@PathVariable long ide) {
        return ieq.retrieveEquipement(ide);
    }

    @DeleteMapping("/deleteEquipement/{ide}")
    public void deleteEquipement(@PathVariable long ide) {
        ieq.removeEquipement(ide);
    }

    @PutMapping("/updateEquipement")
    public Equipement updateEquipement(@RequestBody Equipement e) {
        return ieq.updateEquipement(e);
    }
}