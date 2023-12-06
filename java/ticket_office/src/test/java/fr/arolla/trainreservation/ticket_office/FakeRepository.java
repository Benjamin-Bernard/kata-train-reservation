package fr.arolla.trainreservation.ticket_office;

import fr.arolla.trainreservation.ticket_office.repository.SeatsRepository;

import java.util.ArrayList;
import java.util.List;

public class FakeRepository implements SeatsRepository {
  private final ArrayList<Seat> seats;

  public FakeRepository(){
    seats = new ArrayList<>();
  }

  public String getRef(){
    return "Ref_Test";
  }

  public ArrayList<Seat> getSeats(String trainId) {
    return seats;
  }

  public List<String> reserveSeat(ArrayList<Seat> seats, int seatCount, String trainId, String bookingReference) {
    return  List.of("3A", "4A");
  }


}
