package com.cozentus.AnonymousClass_Thread;

public class TicketManager extends Thread{
	
	static TicketBook tb;
	int seat;
	
	@Override
	public void run() {
		tb.bookSeat(seat);	
	}

	public static void main(String[] args) {
		tb=new TicketBook();
		TicketManager Gourish = new TicketManager();
		Gourish.seat=7;
		Gourish.start();
		TicketManager Raj = new TicketManager();
		Raj.seat=3;
		Raj.start();	
	}
}
