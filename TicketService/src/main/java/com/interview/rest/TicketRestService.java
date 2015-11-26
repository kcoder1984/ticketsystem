package com.interview.rest;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicketRestService {

	@RequestMapping("/")
	public String index(){
		return "Ticket System working";
	}
	
	/**
	 * Note: available seats are seats that are neither held nor reserved.
	 * @param venueId : Venue Id
	 * @param levelId : Level Id
	 * @return
	 */
	@RequestMapping(value="/availability/venueId/{venueId}/levelId/{levelId}", method=RequestMethod.GET)
	public int checkAvailability(@PathVariable int venueId, @PathVariable int levelId){
			
		return 5;
	}
	
	
	@RequestMapping(value="/reserve/venueId/{venueId}/levelId/{levelId}/nofseat/{seatQty}", method = RequestMethod.PUT)
	public boolean reserve(@PathVariable int venueId, 
			               @PathVariable int levelId,
			               @PathVariable int seatQty){
		boolean isReserved = false;
		
		//TODO insert logic to reserve
	    /**
	     * Check for Race condition	
	     */
		return isReserved;
	}
}
