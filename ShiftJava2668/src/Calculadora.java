import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner readerString = new Scanner(System.in);
        Scanner readerFloat = new Scanner(System.in);

        String operador;
        float valorA;
        float valorB;
        float resultado = 0;

        System.out.println("Informe o valor A: ");
        valorA = readerFloat.nextFloat();
        System.out.println("Informe o valor B: ");
        valorB = readerFloat.nextFloat();

        System.out.println("Informe o operador matemático (+  -  *  /): ");
        operador = readerString.next();

        if(operador.equals("+")) {
            resultado = valorA + valorB;
        } else if(operador.equals("-")) {
            resultado = valorA - valorB;
        } else if(operador.equals("*")) {
            resultado = valorA * valorB;
        } else if(operador.equals("/")) {
            resultado = valorA / valorB;
        }

        System.out.println("Resultado: " +resultado);
    }
}
