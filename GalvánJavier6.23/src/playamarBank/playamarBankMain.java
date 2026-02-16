package playamarBank;

import java.time.LocalDate;

public class playamarBankMain {

	public static void main(String[] args) {
		
		
		try {
			
            PlayamarBank cuenta1 = new PlayamarBank(1000);
            System.out.println("Cuenta 1 creada con ID: " + cuenta1.getId());
            System.out.println("Saldo inicial: " + cuenta1.getSaldo());

            cuenta1.ingresar(500);
            System.out.println("Después de ingresar 500, saldo: " + cuenta1.getSaldo());


            cuenta1.establecerEmbargo(30);
            System.out.println("Porcentaje de embargo aplicado: " + cuenta1.getPorcentajeEmbargo());
            System.out.println("Saldo disponible (descontando embargo): " + cuenta1.getSaldoDisponible());


            LocalDate fechaCreacion = LocalDate.of(2020, 5, 10);
            PlayamarBank cuenta2 = new PlayamarBank(2000, fechaCreacion, -500);
            System.out.println("\nCuenta 2 creada con ID: " + cuenta2.getId());
            System.out.println("Saldo inicial: " + cuenta2.getSaldo());
            System.out.println("Fecha de creación: " + cuenta2.getFechaCreacion());
            
            System.out.println(cuenta1.toString());


        } catch (IllegalArgumentException e) {
            System.out.println("Error al crear la cuenta: " + e.getMessage());
		
		
        }
	}
}
