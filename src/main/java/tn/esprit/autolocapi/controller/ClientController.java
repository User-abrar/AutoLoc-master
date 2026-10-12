package tn.esprit.autolocapi.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autolocapi.domain.Client;
import tn.esprit.autolocapi.service.IClientService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/Client")
public class ClientController {

    private final IClientService ic;

    @PostMapping("/addClient")
    public Client addClient(@RequestBody Client c) {
        return ic.addClient(c);
    }

    @GetMapping("/getClients")
    public List<Client> getAllClients() {
        return ic.retrieveAllClients();
    }

    @PostMapping("/addClients")
    public List<Client> addClients(@RequestBody List<Client> clients) {
        return ic.addClients(clients);
    }
    @GetMapping("/getClientById/{idc}")
    public Client getClientById(@PathVariable long idc) {
        return ic.retrieveClient(idc);
    }

    @DeleteMapping("/deleteClient/{idc}")
    public void deleteClient(@PathVariable long idc) {
        ic.removeClient(idc);
    }


    @PutMapping("/updateClient")
    public Client updateClient(@RequestBody Client c) {
        return ic.updateClient(c);
    }
}
