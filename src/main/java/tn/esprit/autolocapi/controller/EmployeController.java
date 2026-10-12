package tn.esprit.autolocapi.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autolocapi.domain.Employe;
import tn.esprit.autolocapi.service.IEmployeService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/Employe")
public class EmployeController {

    private final IEmployeService ie;

    @PostMapping("/addEmploye")
    public Employe addEmploye(@RequestBody Employe e) {
        return ie.addEmploye(e);
    }

    @GetMapping("/getEmployes")
    public List<Employe> getAllEmployes() {
        return ie.retrieveAllEmployes();
    }

    @PostMapping("/addEmployes")
    public List<Employe> addEmployes(@RequestBody List<Employe> employes) {
        return ie.addEmployes(employes);
    }

    @GetMapping("/getEmployeById/{ide}")
    public Employe getEmployeById(@PathVariable long ide) {
        return ie.retrieveEmploye(ide);
    }

    @DeleteMapping("/deleteEmploye/{ide}")
    public void deleteEmploye(@PathVariable long ide) {
        ie.removeEmploye(ide);
    }

    @PutMapping("/updateEmploye")
    public Employe updateEmploye(@RequestBody Employe e) {
        return ie.updateEmploye(e);
    }
}
