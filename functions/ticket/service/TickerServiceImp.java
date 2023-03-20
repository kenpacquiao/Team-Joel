package ph.com.alliance.jpa.functions.ticket.service;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ph.com.alliance.jpa.entity.Ticket;
import ph.com.alliance.jpa.functions.ticket.dao.TicketDao;
import ph.com.alliance.jpa.functions.ticket.model.TicketModel;

@Service
public class TickerServiceImp implements TicketService {
	
	@Autowired
	TicketDao ticketDao;
	
	public List<Ticket> getAllTicket() {
		
		List<Ticket> tickets =  ticketDao.findAll();
		
		return tickets;
		 
	}

	@Override
	public void createTicket(TicketModel ticketModel) {
		// TODO Auto-generated method stub
		
		Ticket ticket = new Ticket();
		try {
			BeanUtils.copyProperties(ticket, ticketModel);
			ticketDao.saveAndFlush(ticket);
		    
		} catch(IllegalAccessException e) {
			e.printStackTrace();
		}catch(InvocationTargetException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void updateTicket(Integer ticketid, TicketModel ticketModel) {
		// TODO Auto-generated method stub
		
		Ticket ticket = new Ticket();
		try {
			BeanUtils.copyProperties(ticket, ticketModel);
			ticket.setTicketID(ticketid);
			ticketDao.saveAndFlush(ticket);
		} catch(IllegalAccessException e) {
			e.printStackTrace();
		}catch(InvocationTargetException e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<Ticket> filterByStatus(String status) {
		// TODO Auto-generated method stub
		List<Ticket> ticket = ticketDao.findByStatus(status);
		
		return ticket;
	}
	@Override
	public void deleteTicket(Integer ticketId) {
		ticketDao.deleteById(ticketId);
	}
}
