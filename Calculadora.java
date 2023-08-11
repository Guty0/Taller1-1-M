
package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {

    
    public static void main(String[] args) {
      Scanner sn = new Scanner(System.in);
      boolean salir = false;
      int opcion;

      while(!salir) {

              System.out.println("\t CALCULADORA\n\n1. Suma\n2. Resta\n3. Multipilicacion\n4. Division\n5. Seno\n6. Coseno\n7. Tanjente\n8. Raiz\n9. PotenCia\n10. IVA");
              opcion = sn.nextInt();
              
              switch(opcion){
                  case 1:
                      System.out.println("\t SUMA");
                      break;
                  case 2:
                      System.out.println("\t RESTA");
                      break;
                  case 3:
                      System.out.println("\t MULTIPLICACION");
                      break;
                  case 4:
                      System.out.println("\t DIVISION");
                      break;
                  case 5:
                      System.out.println("\t SENO");
                      double x = Math.sin(0.5);
                      System.out.println(x);
                      break;
                  case 6:
                      System.out.println("\t COSENO");
                      double x = Math.cos(0.5);
                      System.out.println(x);
                      break;
                  case 7:
                      System.out.println("\t TANGENTE");
                      break;
                  case 8:
                      System.out.println("\t RAIZ");
                      break;
                  case 9:
                      System.out.println("\t POTENCIA");
                      break;
                  case 10:
                      System.out.println("\t IVA");
                      break;
                  default:
                      System.out.println("Seleccionar opciones del 1-10");
              }
      }
 
    }

}
