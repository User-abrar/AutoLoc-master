package tn.esprit.autolocapi.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autolocapi.domain.Agence;
import tn.esprit.autolocapi.service.IAgenceService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/Agence")
public class AgenceController {

    private final IAgenceService ia;

    @PostMapping("/addAgence")
    public Agence addAgence(@RequestBody Agence a) {
        return ia.addAgence(a);
    }

    @GetMapping("/getAgences")
    public List<Agence> getAllAgences() {
        return ia.retrieveAllAgences();
    }

    @PostMapping("/addAgences")
    public List<Agence> addAgences(@RequestBody List<Agence> agences) {
        return ia.addAgences(agences);
    }

    @GetMapping("/getAgenceById/{ida}")
    public Agence getAgenceById(@PathVariable long ida) {
        return ia.retrieveAgence(ida);
    }

    @DeleteMapping("/deleteAgence/{ida}")
    public void deleteAgence(@PathVariable long ida) {
        ia.removeAgence(ida);
    }

    @PutMapping("/updateAgence")
    public Agence updateAgence(@RequestBody Agence a) {
        return ia.updateAgence(a);
    }
}
