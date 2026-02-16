package ejercicio3;

public class Empleado {
	
		private static int cantidadEmpleados = 0;
		
	 	private String nif;
	    private String apellidos;
	    private String nombre;
	    private double sueldoBase;
	    private double pagoHoraExtra;
	    private int horasExtraMes;
	    private double tipoIRPF;
	    private boolean casado;
	    private int numHijos;


	    public Empleado(String nif, String apellidos, String nombre, double sueldoBase, double pagoHoraExtra, int horasExtraMes, double tipoIRPF, boolean casado, int numHijos)
	    		throws IllegalArgumentException {
	    	
	    	if (nif == null || nif.isEmpty()) {
	    		throw new IllegalArgumentException("NIF obligatorio");
	    	}
	        if (apellidos == null || apellidos.isEmpty()) { 
	        	throw new IllegalArgumentException("Apellidos obligatorios");
	        }
	        if (nombre == null || nombre.isEmpty()) {
	        	throw new IllegalArgumentException("Nombre obligatorio");
	        }
	        if (sueldoBase < 0) { 
	        	throw new IllegalArgumentException("El sueldo base no puede ser negativo");
	        }
	        if (pagoHoraExtra < 0) {
	        	throw new IllegalArgumentException("El pago por hora extra no puede ser negativo");
	        }
	        if (horasExtraMes < 0) {
	        	throw new IllegalArgumentException("Las horas extra no pueden ser negativas");
	        }
	        if (tipoIRPF < 0) {
	        	throw new IllegalArgumentException("El tipo de IRPF no puede ser negativo");
	        }
	        if (numHijos < 0) { 
	        	throw new IllegalArgumentException("El número de hijos no puede ser negativo");
	        }

	        this.nif = nif;
	        this.apellidos = apellidos;
	        this.nombre = nombre;
	        this.sueldoBase = sueldoBase;
	        this.pagoHoraExtra = pagoHoraExtra;
	        this.horasExtraMes = horasExtraMes;
	        this.tipoIRPF = tipoIRPF;
	        this.casado = casado;
	        this.numHijos = numHijos;

	        cantidadEmpleados++;
	    }

	    public Empleado(String nif, String apellidos, String nombre) {
	        this(nif, apellidos, nombre, 0, 0, 0, 0, false, 0);
	    }

	    public double calcularComplementoHorasExtra() {
	        return horasExtraMes * pagoHoraExtra;
	    }

	    public double calcularSueldoBruto() {
	        return sueldoBase + calcularComplementoHorasExtra();
	    }

	    public double calcularRetencionIRPF() {
	        double porcentaje = tipoIRPF;

	        if (casado) {
	            porcentaje -= 2;
	        }

	        porcentaje -= numHijos;

	        if (porcentaje < 0) {
	            porcentaje = 0;
	        }

	        return calcularSueldoBruto() * porcentaje / 100;
	    }

	    public double calcularSueldoNeto() {
	        return calcularSueldoBruto() - calcularRetencionIRPF();
	    }

	    public void verEmpleado() {
	        System.out.println("NIF: " + nif);
	        System.out.println("Nombre: " + nombre + " " + apellidos);
	    }

	    public void verTodoEmpleado() {
	    	
	        verEmpleado();
	        System.out.println("Sueldo base: " + sueldoBase);
	        System.out.println("Horas extra realizadas: " + horasExtraMes);
	        System.out.println("Pago por hora extra: " + pagoHoraExtra);
	        System.out.println("Complemento horas extra: " + calcularComplementoHorasExtra());
	        System.out.println("Sueldo bruto: " + calcularSueldoBruto());
	        System.out.println("Retención IRPF: " + calcularRetencionIRPF());
	        System.out.println("Sueldo neto: " + calcularSueldoNeto());
	        System.out.println("Casado: " + (casado ? "Sí" : "No"));
	        System.out.println("Número de hijos: " + numHijos);
	    }

	    public Empleado copia() {
	        return new Empleado(nif, apellidos, nombre, sueldoBase,
	                pagoHoraExtra, horasExtraMes, tipoIRPF, casado, numHijos);
	    }

	    public static int getCantidadEmpleados() {
	        return cantidadEmpleados;
	    }

		@Override
		public String toString() {
			return "Empleado [nif=" + nif + ", apellidos=" + apellidos + ", nombre=" + nombre + ", sueldoBase="
					+ sueldoBase + ", pagoHoraExtra=" + pagoHoraExtra + ", horasExtraMes=" + horasExtraMes
					+ ", tipoIRPF=" + tipoIRPF + ", casado=" + casado + ", numHijos=" + numHijos + "]";
		}
	    
	}
