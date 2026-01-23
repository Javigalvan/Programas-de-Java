package claseTicket;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Ticket {
	
	public static final int MAX_SECUENCIA = 99999999;

    private static int ultimaSecuencia = 0; 
    private static int ultimoAnyo = LocalDate.now().getYear();
    
    private final String id;
    private final LocalDate fecha;
    private LocalTime usado;


private Ticket (LocalDate fecha) throws IllegalArgumentException, IllegalStateException {
	
	LocalDate hoy =  LocalDate.now();	
	
	if (fecha == null) {
		throw new IllegalArgumentException ("Error");
	}
	if (fecha.isBefore(hoy)) {
		throw new IllegalArgumentException ("Error");
	}
	if (fecha.getYear() != hoy.getYear()){
		throw new IllegalArgumentException ("Error");
	}
	if (Ticket.ultimaSecuencia == Ticket.MAX_SECUENCIA) {
		throw new IllegalStateException ("Error. No hay mas tickets");
	}

    this.id = generarId();
    this.fecha = fecha;
    this.usado = null;
    
    if (Ticket.ultimoAnyo != hoy.getYear()) {
        Ticket.ultimaSecuencia = 0;
        Ticket.ultimoAnyo= (short) hoy.getYear();
      }

    
}

private String generarId() {
	
	return null;
}

public Ticket() throws IllegalStateException {
	
	this(LocalDate.now());
}
public LocalDate getFecha() {
	return this.fecha;
}
public String getId() {
	return this.id;
}
public boolean isUsado() {
	return this.usado != null;
}
public boolean isFinDeSemana() {
	return (fecha.getDayOfWeek() == DayOfWeek.SATURDAY || fecha.getDayOfWeek() == DayOfWeek.SUNDAY);
}

public void usar() throws IllegalStateException {
	  if (!this.fecha.isEqual(LocalDate.now())) {
	    throw new IllegalStateException (
	      String.format("el ticket no es para hoy: %s",
	        String.format ("%02d/%02d/%02d",
	          this.fecha.getDayOfMonth(), this.fecha.getMonthValue(), this.fecha.getYear() ) )
	    );
	  }
	  
	  if (isUsado()) {
	    throw new IllegalStateException(
	       String.format("el ticket ya ha sido usado: %s", this.usado));
	  }
	  
	  usado = LocalTime.now();
}
public String toString () {
	  return String.format ("{ID: %s, Fecha:%02d/%02d/%02d, Usado: %s}",
	    this.id,
	    this.fecha.getDayOfMonth(), this.fecha.getMonthValue(), this.fecha.getYear(),
	    this.usado == null ? "no" : String.format ("%02d:%02d", usado.getHour(), usado.getMinute()));
	}

}