package src;
import java.util.Scanner;

public class volume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double volume, pi, raio, altura;

        System.out.println("Digite o valor do raio");
        raio = sc.nextDouble();

        System.out.println("Digite o valor da altura");
        altura= sc.nextDouble();

        pi = 3.14159;

        volume = (pi*(raio*raio)*altura);

        System.out.println("Resultado: " + volume);



    }
}
