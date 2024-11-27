import java.util.Scanner;

public class DesvioSimples{
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        int idade;

        System.out.println("Diga sua idade: ");
        idade = reader.nextInt();
        System.out.println("Verificando sua idade...");

        if(idade >= 18){
            System.out.println("Seja bem-vindo!");
        } else {
            System.out.println("Não pode entrar.");
        }

    }
}
