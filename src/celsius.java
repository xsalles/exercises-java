package src;
import java.util.Scanner;

public class celsius {
    public static void main(String [] args) {

        double celsius, resultF, resultC, fahrenheit;

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o valor em celsius que você deseja transformar em fahrenheit");
        celsius = sc.nextDouble(); 

        System.out.println("Digite o valor de fahrenheit que você desjea transformar em celsius");
        fahrenheit=sc.nextDouble();
        

        resultF = ((celsius * 9) / 5 + 32);
        resultC = ((fahrenheit - 32) * 5 / 9);
    
        System.out.println("A temperatura em celsius para fahrenheit é: " + resultF + "°");
        System.out.println("A temperatura de fahrenheit para celsius é: " + resultC + "°");
    }
}

