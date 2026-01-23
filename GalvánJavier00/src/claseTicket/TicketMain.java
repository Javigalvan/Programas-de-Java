package claseTicket;

public class TicketMain {

	public static void main(String[] args) {
		
		Ticket t1 = new Ticket();
		
		System.out.println("Fecha: " + t1.getFecha());	
		System.out.println("Id: " + t1.getId());	
		System.out.println("Esta usado: " + t1.isUsado());
		System.out.println("Es fin de semana: " + t1.isFinDeSemana());
		
		t1.usar();
		System.out.println("Esta usado: " + t1.isUsado());
		
		System.out.println(t1.toString());
	}

}
