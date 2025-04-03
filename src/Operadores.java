import java.util.Scanner;

public class Operadores {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in) ;

        int num1 = 20;
        int num2 = 10;
        String operat ;
        int resultado ;


        System.out.println("Los numeros a operar son 20 y 10. Elija la operacion a realizar (* ; / ; - ; +)");
        operat = entrada.nextLine();

        if (operat.equals("*")) {
            resultado = num1 * num2;
            System.out.println("El resultado de 20*10 es "+resultado);
        } else if (operat.equals("/")) {
            resultado = num1 / num2;
            System.out.println("El resultado de 20/10 es "+resultado);
        } else if (operat.equals("+")) {
            resultado = num1 + num2;
            System.out.println("El resultado de 20+10 es "+resultado);
        }  else if (operat.equals("-")) {
            resultado = num1 - num2;
            System.out.println("El resultado de 20-10 es " + resultado);
        }


    }
}
