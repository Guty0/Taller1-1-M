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
                      double Num1 = sn.nextDouble();
                      double Num2 = sn.nextDouble();
                      double Sum = Num1+Num2;
                      System.out.println(Sum);
                      break;
                  case 2:
                      System.out.println("\t RESTA");
                      double Num3 = sn.nextDouble();
                      double Num4 = sn.nextDouble();
                      double Res = Num3-Num4;
                      System.out.println(Res);
                      break;
                  case 3:
                      System.out.println("\t MULTIPLICACION");
                      double Num5 = sn.nextDouble();
                      double Num6 = sn.nextDouble();
                      double Mul = Num5*Num6;
                      System.out.println(Mul);
                      break;
                  case 4:
                      System.out.println("\t DIVISION");
                      double Num7 = sn.nextDouble();
                      double Num8 = sn.nextDouble();
                      double Div = Num7/Num8;
                      System.out.println(Div);
                      break;
                  case 5:
                      System.out.println("\t SENO");
                      double Num9 = sn.nextDouble();
                      double Sin = Math.sin(Num9);
                      System.out.println(Sin);
                      break;
                  case 6:
                      System.out.println("\t COSENO");
                      double Num10 = sn.nextDouble();
                      double Cos = Math.cos(Num10);
                      System.out.println(Cos);
                      break;
                  case 7:
                      System.out.println("\t TANGENTE");
                      double Num11 = sn.nextDouble();
                      double Tan = Math.tan(Num11);
                      System.out.println(Tan);
                      break;
                  case 8:
                      System.out.println("\t RAIZ");
                      int Indice=sn.nextInt();
                      double Num12 = sn.nextDouble();
                      double Rai = Math.pow(Num12,1.0/Indice);
                      System.out.println(Rai);
                      break;
                  case 9:
                      System.out.println("\t POTENCIA");
                      int Potencia=sn.nextInt();
                      double Num13 = sn.nextDouble();
                      double Pot = Math.pow(Num13, Potencia);
                      System.out.println(Pot);
                      break;
                  case 10:
                      System.out.println("\t IVA");
                      double montoCalcular = sn.nextDouble();
                      double IVA=19;
                      double Calculo= montoCalcular * (IVA/100);
                      System.out.println(Calculo);
                      break;
                  default:
                      System.out.println("Seleccionar opciones del 1-10");
              }
      }
 
    }

}
