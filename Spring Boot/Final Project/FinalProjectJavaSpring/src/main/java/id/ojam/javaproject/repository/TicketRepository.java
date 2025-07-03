package id.ojam.javaproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import id.ojam.javaproject.model.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Long> {

}
