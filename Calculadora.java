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
                      System.out.println("Digite el sumando #1");
                      double Num1 = sn.nextDouble();
                      System.out.println("Digite el sumando #2");
                      double Num2 = sn.nextDouble();
                      double Sum = Num1+Num2;
                      System.out.println("La suma entre "+Num1+" y "+Num2+" Es : "+Sum);
                      break;
                  case 2:
                      System.out.println("\t RESTA");
                      System.out.println("Digite el minuendo");
                      double Num3 = sn.nextDouble();
                      System.out.println("Digite el sustraendo");
                      double Num4 = sn.nextDouble();
                      double Res = Num3-Num4;
                      System.out.println("La resta entre "+Num3+" y "+Num4+" Es : "+Res);
                      break;
                  case 3:
                      System.out.println("\t MULTIPLICACION");
                      System.out.println("Digite el multiplicando");
                      double Num5 = sn.nextDouble();
                      System.out.println("Digite el multiplicador");
                      double Num6 = sn.nextDouble();
                      double Mul = Num5*Num6;
                      System.out.println("La multiplicacion entre "+Num5+" y "+Num6+" Es : "+Mul);
                      break;
                  case 4:
                      System.out.println("\t DIVISION");
                      System.out.println("Digite el dividendo");
                      double Num7 = sn.nextDouble();
                      System.out.println("Digite el divisor");
                      double Num8 = sn.nextDouble();
                      double Div = Num7/Num8;
                      System.out.println(Num7+" Dividio en  "+Num8+" Es : "+Div);
                      break;
                  case 5:
                      System.out.println("\t SENO");
                      System.out.println("Digite el numero al cual desea sacar el seno");
                      double Num9 = sn.nextDouble();
                      double Sin = Math.sin(Num9);
                      System.out.println("El seno de "+Num9+" es : "+Sin);
                      break;
                  case 6:
                      System.out.println("\t COSENO");
                      System.out.println("Digite el numero al cual desea sacar el coseno");
                      double Num10 = sn.nextDouble();
                      double Cos = Math.cos(Num10);
                      System.out.println("El coseno de "+Num10+" es : "+Cos);
                      break;
                  case 7:
                      System.out.println("\t TANGENTE");
                      System.out.println("Digite el numero al cual desea sacar la tangente");
                      double Num11 = sn.nextDouble();
                      double Tan = Math.tan(Num11);
                      System.out.println("La tangente de "+Num11+" es : "+Tan);
                      break;
                  case 8:
                      System.out.println("\t RAIZ");
                      System.out.println("Digite el indice de la raiz");
                      int Indice=sn.nextInt();
                      System.out.println("Digite el radicando de la raiz");
                      double Num12 = sn.nextDouble();
                      double Rai = Math.pow(Num12,1.0/Indice);
                      System.out.println("La raiz "+Indice+" de "+Num12+" es : "+Rai);
                      break;
                  case 9:
                      System.out.println("\t POTENCIA");
                      System.out.println("Digite el exponente");
                      int Exponente=sn.nextInt();
                      System.out.println("Digite la base");
                      double Num13 = sn.nextDouble();
                      double Pot = Math.pow(Num13, Exponente);
                      System.out.println("La potencia "+Exponente+" de "+Num13+" es : "+Pot);
                      break;
                  case 10:
                      System.out.println("\t IVA");
                      System.out.println("Digite el valor al cual desea calcular el IVA ");
                      double montoCalcular = sn.nextDouble();
                      double IVA=19;
                      double Calculo= montoCalcular * (IVA/100);
                      System.out.println("El IVA de "+montoCalcular+" es : "+Calculo);
                      break;
                  default:
                      System.out.println("Seleccionar opciones del 1-10");
              }
      }
 
    }

}
