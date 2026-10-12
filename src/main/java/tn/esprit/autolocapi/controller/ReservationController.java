package tn.esprit.autolocapi.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autolocapi.domain.Reservation;
import tn.esprit.autolocapi.service.IReservationService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/Reservation")
public class ReservationController {

    private final IReservationService ir;

    @PostMapping("/addReservation")
    public Reservation addReservation(@RequestBody Reservation r) {
        return ir.addReservation(r);
    }

    @GetMapping("/getReservations")
    public List<Reservation> getAllReservations() {
        return ir.retrieveAllReservations();
    }

    @PostMapping("/addReservations")
    public List<Reservation> addReservations(@RequestBody List<Reservation> reservations) {
        return ir.addReservations(reservations);
    }

    @GetMapping("/getReservationById/{idr}")
    public Reservation getReservationById(@PathVariable long idr) {
        return ir.retrieveReservation(idr);
    }

    @DeleteMapping("/deleteReservation/{idr}")
    public void deleteReservation(@PathVariable long idr) {
        ir.removeReservation(idr);
    }

    @PutMapping("/updateReservation")
    public Reservation updateReservation(@RequestBody Reservation r) {
        return ir.updateReservation(r);
    }
}
