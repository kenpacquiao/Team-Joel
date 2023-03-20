package ph.com.alliance.jpa.functions.ticket.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ph.com.alliance.jpa.common.ApiResult;
import ph.com.alliance.jpa.functions.ticket.model.TicketModel;
import ph.com.alliance.jpa.functions.ticket.service.TicketService;

@RestController
@RequestMapping("/ticket")

public class TicketController {
	
	@Autowired
	private TicketService ticketService;
	
	@GetMapping("/getAll")
	public Object getAllTicket() {
		
		return ApiResult.CreateSuccess(ticketService.getAllTicket(),"Tickets Retrieved Successfully!");
	}
	@GetMapping("/test")
	public ApiResult getTest() {
		return ApiResult.CreateSuccess("okey ra!");
	}
	
	@GetMapping("/filter/status/{status}")
	public ApiResult getByStatus(@PathVariable String status) {
		
		return null;
	}
	
	@PostMapping("/create")
	public ApiResult createTicket(TicketModel ticketModel){
		ticketService.createTicket(ticketModel);
		
		return ApiResult.CreateSuccess("Successfully Saved!");
		
	}
	@PutMapping("/update/{ticketId}")
	public ApiResult updateTicket(@PathVariable Integer ticketId, TicketModel ticketModel){
		ticketService.updateTicket(ticketId,ticketModel);
		return ApiResult.CreateSuccess("Successfully Updated!");
		
	}
	
	@DeleteMapping("/delete/{ticketId}")
	public ApiResult deleteTicket(@PathVariable Integer ticketId) {
		ticketService.deleteTicket(ticketId);
		return ApiResult.CreateSuccess("Deleted successfully");
	}
}
