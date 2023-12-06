package fr.arolla.trainreservation.ticket_office;

import fr.arolla.trainreservation.ticket_office.repository.SeatsRepository;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

@TestConfiguration
public class TestConfig {
  @Bean
  SeatsRepository getRepo(){
    return new FakeRepository();
  }
}