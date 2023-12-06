package fr.arolla.trainreservation.ticket_office;

import fr.arolla.trainreservation.ticket_office.controllers.BookingController;
import fr.arolla.trainreservation.ticket_office.controllers.BookingRequest;
import fr.arolla.trainreservation.ticket_office.controllers.BookingResponse;
import fr.arolla.trainreservation.ticket_office.repository.SeatsRepository;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestNoSpring {
  private final TestConfig testConfig = new TestConfig();

  private final SeatsRepository seatsRepository = testConfig.getRepo();

  @Test
  void add_2_reservations(){
    final String trainId = "express_2000";
    BookingRequest bookingRequest = new BookingRequest(trainId, 2);
    BookingResponse expected = new BookingResponse(trainId, "Ref_Test", List.of("3A", "4A"));

    BookingController bookingController = new BookingController(seatsRepository);

    assertEquals(expected,bookingController.reserve(bookingRequest));

  }
}
