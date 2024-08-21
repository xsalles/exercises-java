package src;
import java.util.Scanner;

public class baskara {
    public static void main (String args[]) {
        int a, b, c;
        double x1, x2, delta;
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Digite o valor de 'A'");
        a = sc.nextInt();
        
        System.out.println("Digite o valor de 'B'");
        b = sc.nextInt();
        
        System.out.println("Digite o valor de 'C'");
        c = sc.nextInt();
        
        delta = (b*b) - (4 * a * c);
        
        System.out.println("O valor de delta é " + delta);
        
        if (delta < 0) {
            System.out.println("O delta não pode ser negativo");
        } else {
            x1 = (double) (((-(b) + Math.sqrt(delta)) / 2*a)); 
            
            x2 = (double) (((-(b) - Math.sqrt(delta)) / 2*a)); 

            System.out.println("O valor de x1 é " + x1);
            System.out.println("O valor de x2 é " + x2);
        }  
    }
}
