

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        byte n1 = 5;
        byte n2 = 10;
        byte n3 = 7;

        if (n1>n2 && n1>n3) {
            System.out.printf("El numero mayor es: "+n1);
        } else if (n2>n1 && n2>n3) {
            System.out.println("El numero mayor es: "+n2);
        } else if (n3>n1 && n3>n2) {
            System.out.println("El numero mayor es: "+n3);
        }




    }
}
