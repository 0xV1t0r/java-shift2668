import java.util.Scanner;

public class PlacaCarro {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Informe sua placa: ");
        int placa = reader.nextInt();
        int ultimoDigito = placa % 10;
        switch (ultimoDigito) {
            case 1:
                System.out.println("Não pode rodar na segunda-feira");
                break;
            case 2:
                System.out.println("Não pode rodar na segunda-feira");
                break;
            case 3:
                System.out.println("Não pode rodar na terça-feira");
                break;
            default:
                System.out.println("XYZ");
        }
    }
}
