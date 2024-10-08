package src;
import java.text.DecimalFormat;
import java.util.Scanner;

public class taxa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("00");
        
        double valor, taxa, parcela, valordataxa;
        int meses;
        
        System.out.println("Digite o valor do produto");
        valor = sc.nextDouble();

        System.out.println("Digite a quantidade de meses de atraso do pagamento");
        meses = sc.nextInt();

        System.out.println("Qual a porcentagem da taxa sobre o atraso mensal?");
        taxa = sc.nextDouble();

        parcela = valor + (valor * (taxa/100)*meses);
        valordataxa = valor * (taxa/100) * meses;

        System.out.println("O valor total que você deve pagar sobre o atraso é de R$" + (df.format(parcela)) + ", mas o valor de juros é R$"  + (df.format(valordataxa)));
    }
}
