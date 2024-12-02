import java.util.Scanner;

public class Senha {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        String usuario, senha;
        System.out.println("Digite seu usuário: ");
        usuario = reader.nextLine();
        System.out.println("Digite sua senha: ");
        senha = reader.nextLine();

        if(usuario.equals("admin") && senha.equalsIgnoreCase("Admin123")) {
            System.out.println("Bem vindo ao sistema! Você tem permissão total de uso.");
        } else {
            System.out.println("Acesso negado");
        }
    }
}
