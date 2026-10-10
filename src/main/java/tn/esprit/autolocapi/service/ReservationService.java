package tn.esprit.autolocapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.autolocapi.domain.Reservation;
import tn.esprit.autolocapi.repository.ReservationRepository;

import java.util.List;

@Service
public class ReservationService implements IReservationService {

    @Autowired
    ReservationRepository resRepo;

    @Override
    public List<Reservation> retrieveAllReservations() {
        return (List<Reservation>) resRepo.findAll();
    }

    @Override
    public Reservation addReservation(Reservation r) {
        return resRepo.save(r);
    }

    @Override
    public Reservation updateReservation(Reservation r) {
        return resRepo.save(r);
    }

    @Override
    public Reservation retrieveReservation(Long idReservation) {
        return resRepo.findById(idReservation).orElse(null);
    }

    @Override
    public void removeReservation(Long idReservation) {
        resRepo.deleteById(idReservation);
    }

    @Override
    public List<Reservation> addReservations(List<Reservation> reservations) {
        return (List<Reservation>) resRepo.saveAll(reservations);
    }
}
