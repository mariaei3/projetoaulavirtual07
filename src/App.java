import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com a medida do lado do quadrado: ");
        double lado = sc.nextDouble();
        double area = lado * lado;

        double dobrodaarea = area * 2;

        System.out.println("O dobro da area do quadrado é: " + dobrodaarea);

    }
}
