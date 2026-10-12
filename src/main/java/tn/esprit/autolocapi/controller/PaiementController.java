package tn.esprit.autolocapi.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autolocapi.domain.Paiement;
import tn.esprit.autolocapi.service.IPaiementService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/Paiement")
public class PaiementController {

    private final IPaiementService ip;

    @PostMapping("/addPaiement")
    public Paiement addPaiement(@RequestBody Paiement p) {
        return ip.addPaiement(p);
    }

    @GetMapping("/getPaiements")
    public List<Paiement> getAllPaiements() {
        return ip.retrieveAllPaiements();
    }

    @PostMapping("/addPaiements")
    public List<Paiement> addPaiements(@RequestBody List<Paiement> paiements) {
        return ip.addPaiements(paiements);
    }

    @GetMapping("/getPaiementById/{idp}")
    public Paiement getPaiementById(@PathVariable long idp) {
        return ip.retrievePaiement(idp);
    }

    @DeleteMapping("/deletePaiement/{idp}")
    public void deletePaiement(@PathVariable long idp) {
        ip.removePaiement(idp);
    }

    @PutMapping("/updatePaiement")
    public Paiement updatePaiement(@RequestBody Paiement p) {
        return ip.updatePaiement(p);
    }
}