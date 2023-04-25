package estruturacontrole;

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int quantidadeDeNotas = 0;
        double notaAtual = 0;
        double total = 0;
        while (notaAtual != -1) {
            System.out.print("Digite a nota por favor: ");
            notaAtual = entrada.nextDouble();
            if (notaAtual <= 10 && notaAtual >= 0) {
                total += notaAtual;
                quantidadeDeNotas++;
            } else if (notaAtual != -1) {
                System.out.println("Nota Inválida, digite novamente");
            }
        }
        double media = total / quantidadeDeNotas;
        System.out.println("A média é: " + media);
        entrada.close();
    }
}