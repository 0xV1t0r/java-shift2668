import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Mensagem \naleatória");

        //Esse é um comentário aleatório

        Scanner readerString = new Scanner(System.in);
        Scanner readerByte = new Scanner(System.in);
        String nomePessoa;
        byte idadePessoa;

        System.out.println("Digite seu nome: ");
        nomePessoa = readerString.nextLine();
        System.out.println("Digite sua idade: ");
        idadePessoa = Byte.parseByte(readerByte.nextLine());

        System.out.println("Boa noite "+nomePessoa+" você tem "+idadePessoa+" anos");
    }
}
