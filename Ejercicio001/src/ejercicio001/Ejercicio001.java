package ejercicio001;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio001 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String nombre;
        String mensaje_final = "";
        int dias;
        double costo_dia;
        double valor_cancelar;
        int contador = 1;

        while (contador <= 5) {
            System.out.println("Ingrese el nombre");
            nombre = entrada.nextLine();
            System.out.println("Ingrese el número de días");
            dias = entrada.nextInt();
            System.out.println("Ingrese valor de costo por día");
            costo_dia = entrada.nextDouble();
            
            valor_cancelar = dias * costo_dia;
            
            mensaje_final = String.format("Nombre:%s días:%s, costo por día"
                    + " %.2f, total %2f", nombre, dias, costo_dia, valor_cancelar);
            contador = contador + 1;

        }
        System.out.println(mensaje_final);
    }

}
