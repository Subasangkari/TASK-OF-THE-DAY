package Exceptions;
	class TicketNotFoundException extends Exception{
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public TicketNotFoundException() {
		super("Out of Stock");
		}
		}

		class BookMyShow
		{
			int availabletickets=10;
		void bookTicket(int NoOfTickets)throws TicketNotFoundException
		{
		if(NoOfTickets == 0)
		throw new TicketNotFoundException();

		else
		System.out.println(NoOfTickets +" tickets Booked enjoy the show available tickets "+(availabletickets-NoOfTickets));
		}

		}


		public class MyExceptionDemo {

		public static void main(String[] args) {
		BookMyShow b=new BookMyShow();

		try{
		b.bookTicket(6);
		}
		catch (TicketNotFoundException e) {
			e.printStackTrace();
		}
		try{
			b.bookTicket(2);
			}
			catch (TicketNotFoundException e) {
				e.printStackTrace();
			}
		BookMyShow b1=new BookMyShow();
		try{
			b1.bookTicket(1);
			}
		
			catch (TicketNotFoundException e) {
				e.printStackTrace();
			}
		
		
		}

		}



