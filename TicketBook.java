package com.cozentus.AnonymousClass_Thread;

public class TicketBook {
	
	int tot_seat = 10;
	synchronized void bookSeat(int seats) {
		if (tot_seat >= seats ) {
			System.out.println("Seats Booked Successfully");
			tot_seat = tot_seat - seats;
			System.out.println("Seat Available : " + tot_seat);
		}
		else {
			System.out.println("No Seats Available");
			System.out.println("Seat Available : " + tot_seat);
		}
	}
}
