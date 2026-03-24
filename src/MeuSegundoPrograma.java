import java.util.Scanner; // importa no topo do arquivo

public class MeuSegundoPrograma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // cria o scanner

        System.out.println("Digite um número:");
        double numero1 = scanner.nextDouble(); // lê o que o usuário digitou

        System.out.println("Você digitou: " + numero1);

        System.out.println("Digite outro número:");
        double numero2 = scanner.nextDouble(); // lê o que o usuário digitou
        System.out.println("Você digitou: " + numero2);

        System.out.println("Digite a operação (+, -, *, /)");
        String fun = scanner.next();

        if (fun.equals("+")) {
            sum(numero1, numero2);
        } else if (fun.equals("-")) {
            sub(numero1, numero2);
        } else if (fun.equals("*")) {
            mult(numero1, numero2);
        } else if (fun.equals("/")) {
            div(numero1, numero2);
        } else {
            System.out.println("Operação inválida!");
        }
    }

    static void sum(double x, double y) {
        System.out.println("Resultado da soma:");
        System.out.println(x + y);
    }

    static void div(double x, double y) {
        System.out.println("Resultado da divisão:");
        System.out.println(x / y);
    }

    static void mult(double x, double y) {
        System.out.println("Resultado da multiplicação:");
        System.out.println(x * y);

    }

    static void sub(double x, double y) {
        System.out.println("Resultado da subtração:");
        System.out.println(x - y);
    }

}