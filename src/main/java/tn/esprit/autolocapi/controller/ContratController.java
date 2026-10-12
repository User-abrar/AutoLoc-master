package tn.esprit.autolocapi.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autolocapi.domain.Contrat;
import tn.esprit.autolocapi.service.IContratService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/Contrat")
public class ContratController {

    private final IContratService icon;

    @PostMapping("/addContrat")
    public Contrat addContrat(@RequestBody Contrat c) {
        return icon.addContrat(c);
    }

    @GetMapping("/getContrats")
    public List<Contrat> getAllContrats() {
        return icon.retrieveAllContrats();
    }

    @PostMapping("/addContrats")
    public List<Contrat> addContrats(@RequestBody List<Contrat> contrats) {
        return icon.addContrats(contrats);
    }

    @GetMapping("/getContratById/{idc}")
    public Contrat getContratById(@PathVariable long idc) {
        return icon.retrieveContrat(idc);
    }

    @DeleteMapping("/deleteContrat/{idc}")
    public void deleteContrat(@PathVariable long idc) {
        icon.removeContrat(idc);
    }

    @PutMapping("/updateContrat")
    public Contrat updateContrat(@RequestBody Contrat c) {
        return icon.updateContrat(c);
    }
}