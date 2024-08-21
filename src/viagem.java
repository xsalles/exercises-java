package src;
import java.text.DecimalFormat;
import java.util.Scanner;

public class viagem {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.");
        
        Scanner sc = new Scanner(System.in);

        int horas, consumo;
        double velocidadeMedia, distancia, litrosusados;
        
        System.out.println("Digite a velocidade média em km/h durante a viagem");
        velocidadeMedia = sc.nextDouble();

        System.out.println("Digite o tempo gasto em horas para ir até o destino");
        horas = sc.nextInt();
        
        consumo = 12;

        distancia = horas * velocidadeMedia;

        System.out.println("A distância é: " + distancia + "km");

        litrosusados = distancia / consumo;

        System.out.println("A quantidade de litros usados foi " + (df.format(litrosusados)) + "l");
    }
}
