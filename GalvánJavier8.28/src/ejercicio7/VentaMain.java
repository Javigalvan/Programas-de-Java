package ejercicio7;

import java.util.ArrayList;
import java.util.Scanner;

public class VentaMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        ArrayList<Venta> lista = new ArrayList<>();

        int op;

        do {
            System.out.println("1.Introducir  2.Mostrar  3.Total  4.Meses A  5.Mayor  6.Salir");
            op = sc.nextInt();

            switch (op) {

                case 1:
                    String[] meses = {"Enero","Febrero","Marzo","Abril","Mayo","Junio",
                                       "Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};

                    lista.clear();

                    for (int i = 0; i < meses.length; i++) {
                        System.out.print(meses[i] + ": ");
                        lista.add(new Venta(meses[i], sc.nextInt()));
                    }
                    break;

                case 2:
                    for (Venta v : lista)
                        System.out.println(v);
                    break;

                case 3:
                    int total = 0;
                    for (Venta v : lista)
                        total += v.ventas;
                    System.out.println("Total: " + total);
                    break;

                case 4:
                    int sumaA = 0;
                    for (Venta v : lista)
                        if (v.mes.startsWith("A"))
                            sumaA += v.ventas;
                    System.out.println("Meses con A: " + sumaA);
                    break;

                case 5:
                    Venta mayor = lista.get(0);
                    for (Venta v : lista)
                        if (v.ventas > mayor.ventas)
                            mayor = v;
                    System.out.println("Mayor: " + mayor.mes);
                    break;
            }

        } while (op != 6);


	}

}
