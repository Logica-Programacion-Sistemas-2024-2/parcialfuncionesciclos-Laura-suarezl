
package parcial1g2;

import java.util.*;

public class App {
    
    public static void main(String[] args) {
        
        // Logica de solución

        Scanner sc = new Scanner(System.in);

        int cantidadVehiculos = 0;
        String decadaVehiculo = "";
        int avaluoVehiculo = 0;

        try {
      
        
            System.out.println("¿Cuantos vehiculos desea calcular? ");
            cantidadVehiculos = sc.nextInt();

        } catch (Exception e) {
            System.out.println("Error, solo puede ingresar numeros positivos");
        }


        for (int i = 1; i <= cantidadVehiculos; i++){

            try {

                System.out.println("Vehiculo " + i + ":");
                sc.nextLine();

                System.out.println("Ingrese la decada del modelo del vehiculo (70, 80, 90, 00, 10, 20, Otra):");
                decadaVehiculo = sc.nextLine();

                System.out.println("Ingrese el avaluo del vehiculo: ");
                avaluoVehiculo = sc.nextInt();
                sc.nextLine();

                System.out.println("Decada del Modelo: " + decadaVehiculo);

                System.out.println("Avalúo: " + avaluoVehiculo + " COP");

                System.out.println("Total a pagar: " + calcularTotalImpuestos(decadaVehiculo, avaluoVehiculo) + " COP");

            } catch (Exception e) {
                System.out.println("Error, solo puedes ingresar numeros positivos");
            }
        }

      


    }

    /*  Implemente una funcion llamada calcularTotalImpuestos que cumpla con las siguientes caracteristicas
        * Recibe: 
            - Una cadena de caracteres que representa la decada (70, 80, 90, 00, 10, 20, Otra)
            - Un entero que representa avaluo del vehiculo
        * Retorna:
            - Un entero representando el valor total a pagar de los impuestos
        * Controlar errores retornando -1
    */
    //------------------------------------------------------------------
    

    public static int calcularTotalImpuestos(String numDecada, int avaluo){

        try {
            
            int valorTotal = 0;
            double impuestoRodamiento = 0;
            double seguro = 0;

            switch (numDecada) {
                case "00":
                    impuestoRodamiento = (avaluo * 0.0434);
                    seguro = (avaluo * 0.00798);
                    valorTotal = (int)(impuestoRodamiento + seguro);
                    break;
            
                case "10":
                    impuestoRodamiento = (avaluo * 0.0493);
                    seguro = (avaluo * 0.00712);
                    valorTotal = (int)(impuestoRodamiento + seguro);
                    break;

                case "20":
                    impuestoRodamiento = (avaluo * 0.0568);
                    seguro = (avaluo * 0.00699);
                    valorTotal = (int)(impuestoRodamiento + seguro);
                    break;

                case "90":
                    impuestoRodamiento = (avaluo * 0.0409);
                    seguro = (avaluo * 0.00816);
                    valorTotal = (int)(impuestoRodamiento + seguro);
                    break;
                    
                

                default:
                    valorTotal = 0;
                    break;
            }

            return (int)valorTotal;

        } catch (Exception e) {
            return -1;
        }
    }

    
    //------------------------------------------------------------------

}
