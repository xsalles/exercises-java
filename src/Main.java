package src;
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Digite o valor em celsius que você deseja transformar em fahrenheit");

        String celsiusString = keyboard.nextLine();
        int celsius = Integer.parseInt(celsiusString);

        int result = ((celsius * 9) / 5 + 32);

    
        System.out.println("A temperatura em fahrenheit é: " + result + "°");
    }
}

