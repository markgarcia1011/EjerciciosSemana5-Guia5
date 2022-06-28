
package Ejercicios1;

import Ejercicios2.DepreciacionMaquinaria;
import java.util.Scanner;

public class Resultado {
    public static void main(String [] asrg ) {
        Scanner leer =  new Scanner(System.in);
        
        DepreciacionMaquinaria objeto = new DepreciacionMaquinaria();
        
        System.out.println("Ingrese el costo de la Maquinaria");
        objeto.setCostoM(leer.nextDouble());
        System.out.println("Ingrese el nombre de la Maquinaria");
        objeto.setNombreM(leer.next());
        System.out.println("Ingrese el Periodo de Tiempo en el Cual Sera Depreciada");
        objeto.setTiempoD(leer.nextDouble());
        System.out.println("El precio de la depreciacion es de: "+ objeto.formula());
    }   
}
