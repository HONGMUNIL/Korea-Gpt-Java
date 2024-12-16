package chapter17.repository;

import chapter17.entity.Reservation;

import java.util.List;

public class ReservationRepository {
    public void save(Reservation reservation){
        reservations.add(reservation);
    }

    public List<Reservation> findByUserId(String userId){
        return reservations,stream()
    }
}
