package ejercicio3;

import java.util.Scanner;

public class EmpleadoMain {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		try {

            Empleado empleado1 = new Empleado("11111111A", "Lopez", "Josema");
            Empleado empleado2 = new Empleado("22222222B", "Gonzalez", "Pablo", 2000, 20, 10, 15, true, 2);

            System.out.println("Introduce el sueldo base del empleado1:");
            double sueldoBase1 = entrada.nextDouble();
            if (sueldoBase1 < 0) throw new IllegalArgumentException("El sueldo base no puede ser negativo");

            System.out.println("Introduce las horas extra del empleado1:");
            int horasExtra1 = entrada.nextInt();
            if (horasExtra1 < 0) throw new IllegalArgumentException("Las horas extra no pueden ser negativas");

            empleado1 = new Empleado("11111111A", "Lopez", "Josema", sueldoBase1, 15, horasExtra1, 12, false, 0);

            System.out.println("\n--- Información económica del empleado1 ---");
            empleado1.verTodoEmpleado();

            Empleado empleado3 = empleado2.copia();

            System.out.println("\nIntroduce el sueldo base del empleado3:");
            double sueldoBase3 = entrada.nextDouble();
            if (sueldoBase3 < 0) throw new IllegalArgumentException("El sueldo base no puede ser negativo");

            System.out.println("Introduce las horas extra del empleado3:");
            int horasExtra3 = entrada.nextInt();
            if (horasExtra3 < 0) throw new IllegalArgumentException("Las horas extra no pueden ser negativas");

            empleado3 = new Empleado("22222222B", "Gonzalez", "Pablo", sueldoBase3, 20, horasExtra3, 15, true, 2);

            System.out.println("\n--- Información económica del empleado3 ---");
            empleado3.verTodoEmpleado();

            System.out.println("\n--- LISTADO DE EMPLEADOS ---");
            empleado1.verEmpleado();
            System.out.println();
            empleado2.verEmpleado();
            System.out.println();
            empleado3.verEmpleado();

            System.out.println("\nNúmero total de empleados: " + Empleado.getCantidadEmpleados());

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
	}

}
