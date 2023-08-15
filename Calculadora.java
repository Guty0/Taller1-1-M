package Calculadora;
import java.util.Scanner;

public class Calculadora {

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
                      double c = sn.nextDouble();
                      double d = sn.nextDouble();
                      double e = c+d;
                      System.out.println(e);
                      break;
                  case 2:
                      System.out.println("\t RESTA");
                      double f = sn.nextDouble();
                      double g = sn.nextDouble();
                      double i = f-g;
                      System.out.println(i);
                      break;
                  case 3:
                      System.out.println("\t MULTIPLICACION");
                      double j = sn.nextDouble();
                      double k = sn.nextDouble();
                      double l = j*k;
                      System.out.println(l);
                      break;
                  case 4:
                      System.out.println("\t DIVISION");
                      double m = sn.nextDouble();
                      double n = sn.nextDouble();
                      double o = m/n;
                      System.out.println(o);
                      break;
                  case 5:
                      System.out.println("\t SENO");
                      double h = sn.nextDouble();
                      double x = Math.sin(h);
                      System.out.println(x);
                      break;
                  case 6:
                      System.out.println("\t COSENO");
                      double a = sn.nextDouble();
                      double b = Math.cos(a);
                      System.out.println(b);
                      break;
                  case 7:
                      System.out.println("\t TANGENTE");
                      double p = sn.nextDouble();
                      double q = Math.tan(p);
                      System.out.println(q);
                      break;
                  case 8:
                      System.out.println("\t RAIZ");
                      int t=sn.nextInt();
                      double r = sn.nextDouble();
                      double s = Math.pow(r,1.0/t);
                      System.out.println(s);
                      break;
                  case 9:
                      System.out.println("\t POTENCIA");
                      int u=sn.nextInt();
                      double v = sn.nextDouble();
                      double y = Math.pow(v, u);
                      System.out.println(y);
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
