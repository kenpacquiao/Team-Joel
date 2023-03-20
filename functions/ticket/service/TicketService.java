package ph.com.alliance.jpa.functions.ticket.service;

import java.util.List;

import ph.com.alliance.jpa.entity.Ticket;
import ph.com.alliance.jpa.functions.ticket.model.TicketModel;
public interface TicketService {
  List<Ticket> getAllTicket();
  
  void createTicket(TicketModel ticketModel);
  
  void updateTicket(Integer ticketid,TicketModel ticketModel);
  
  List<Ticket> filterByStatus(String Status);
  
  void deleteTicket(Integer ticketId);
  }
