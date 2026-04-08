package Galvan;

import java.time.LocalDate;

public class PrincipalVehiculo {
    public static void main(String[] args) {
       

        // 1. Crear camión 20tn
    	System.out.println("== 1. CREAR CAMION ==");
        Camion camion1 = new Camion("26-001", "8726HFV", LocalDate.of(2020, 4, 3), false, 100, 20);
        camion1.mostrarInformacion();

        // 2. Calcular precio 3 días
       System.out.println("== 2. CALCULAR PRECIO 3 DIAS ==");
       camion1.CalcularPrecio(3);

        // 3. Crear furgoneta con volumen máx. y refrigerado
       System.out.println("== 3. CREAR FURGONETA ==");
        Furgoneta furgoneta1 = new Furgoneta(Entrada.real(), true);
        furgoneta1.mostrarInformacion();
        

        // 4. Calcular precio 5 días
        System.out.println("== 4. CALCULAR PRECIO 5 DIAS ==");
        furgoneta1.CalcularPrecio(5);

        // 5. Modificar ITV camión
        System.out.println("== 5. MODIFICAR ITV CAMION ==");
        camion1.modificar("26-001", "8726HFV", LocalDate.of(2020, 4, 3), true, 100, 20);
        camion1.mostrarInformacion();

        // 6. Calcular precio 3 días
        System.out.println("== 6. CALCULAR PRECIO 3 DIAS ==");
        camion1.CalcularPrecio(3);

        
        // 7. Indica si la furgoneta tiene refrigeración
        System.out.println("== 7. INDICAR SI LA FURGONETA TIENE REFRIGERACION ==");
        System.out.println(furgoneta1.tieneRefrigeracion());

        // 8. Modifica el valor del precio por día de la furgoneta
        System.out.println("== 8. MODIFICAR VALOR PRECIO POR DIA DE FURGONETA ==");
        furgoneta1.modificar("26-002", "7382GFS", LocalDate.of(2020, 4, 3), true, 50, 100, true);
        furgoneta1.mostrarInformacion();

        // 9. Camión por método (el objeto debe ser vreado por un método
       
    	
        // 10. Número total vehículos
        System.out.println("== 10. NUMERO TOTAL DE VEHICULOS ==");
        System.out.println(Vehiculos.CalcularNumVehiculos());
    }

    
}