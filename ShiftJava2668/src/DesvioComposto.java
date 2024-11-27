import java.util.Scanner;

public class DesvioComposto {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("Digite o valor da sua doação: ");
        double valor = reader.nextDouble();
        double investimento;

        if(valor > 1000) {
            investimento = valor * 0.15;
        } else {
            investimento = valor * 0.05;
        }

        System.out.println("Seu investimento deve ser de R$ " +investimento);
    }
}
