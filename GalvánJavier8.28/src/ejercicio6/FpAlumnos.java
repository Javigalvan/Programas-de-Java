package ejercicio6;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Scanner;

public class FpAlumnos {

		public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        HashMap<String, Alumno> alumnos = new HashMap<>();

	        // a) Incorporar alumno
	        System.out.println("Añadir alumno:");
	        Alumno nuevo = new Alumno("A001", "Pérez", "Luis", "Calle Falsa 123",
	                                  "666111222", "CIC01", 3, LocalDate.of(2022,9,1));
	        alumnos.put(nuevo.codigo, nuevo);

	        // b) Mostrar info por código
	        System.out.print("Introduce código del alumno: ");
	        String codigo = sc.next();
	        if (alumnos.containsKey(codigo)) {
	            System.out.println(alumnos.get(codigo));
	        } else {
	            System.out.println("Alumno no encontrado.");
	        }

	        // c) Dar de baja por nombre y apellidos
	        System.out.print("Introduce nombre a eliminar: ");
	        String nombre = sc.next();
	        System.out.print("Introduce apellidos: ");
	        String apellidos = sc.next();
	        String claveEliminar = null;
	        for (Alumno a : alumnos.values()) {
	            if (a.nombre.equalsIgnoreCase(nombre) && a.apellidos.equalsIgnoreCase(apellidos)) {
	                claveEliminar = a.codigo;
	                break;
	            }
	        }
	        if (claveEliminar != null) {
	            alumnos.remove(claveEliminar);
	            System.out.println("Alumno eliminado.");
	        } else {
	            System.out.println("No encontrado.");
	        }

	        // d) Modificar dirección/teléfono por código
	        System.out.print("Introduce código para modificar dirección/teléfono: ");
	        codigo = sc.next();
	        if (alumnos.containsKey(codigo)) {
	            Alumno a = alumnos.get(codigo);
	            System.out.print("Nueva dirección: ");
	            a.direccion = sc.next();
	            System.out.print("Nuevo teléfono: ");
	            a.telefono = sc.next();
	            System.out.println("Datos actualizados.");
	        } else {
	            System.out.println("Alumno no encontrado.");
	        }

	        // e) Modificar ciclo y cursos aprobados
	        System.out.print("Introduce código para cambiar de ciclo: ");
	        codigo = sc.next();
	        if (alumnos.containsKey(codigo)) {
	            Alumno a = alumnos.get(codigo);
	            System.out.print("Nuevo código de ciclo: ");
	            a.codigoCiclo = sc.next();
	            System.out.print("Nueva cantidad de cursos aprobados: ");
	            a.cursosAprobados = sc.nextInt();
	            System.out.println("Cambio de ciclo aplicado.");
	        } else {
	            System.out.println("Alumno no encontrado.");
	        }
	    }
	

}
