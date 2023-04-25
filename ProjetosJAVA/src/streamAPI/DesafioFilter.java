package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {
    public static void main(String[] args) {
        Produto p1 = new Produto("Lapis", 1.99, 0.35, 0);
        Produto p2 = new Produto("Notebook", 4899.89, 0.32, 0);
        Produto p3 = new Produto("Caderno", 30, 0.45, 0);
        Produto p4 = new Produto("Impressora", 1200, 0.40, 0);
        Produto p5 = new Produto("Ipad", 3100, 0.29, 0);
        Produto p6 = new Produto("Relógio", 1900, 0.12, 0);
        Produto p7 = new Produto("Monitor", 800, 0.31, 0);

        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5, p6, p7);

        // Filter, Map
        Predicate<Produto> grandeDesconto = (p) -> {
            return p.desconto >= 0.3;
        };
        Predicate<Produto> freteGratis = p -> p.valorFrete == 0; // Outra forma de fazer função lambda é SEM RETURN

        Function<Produto, String> chamadaPromocional = p -> "Aproveite! " + p.nome + " por R$" + p.preco;
        produtos.stream() // Criação da Stream
        .filter(grandeDesconto) // Operação Intermediária
        .filter(freteGratis) // Operação Intermediária
        .map(chamadaPromocional) // Operação Intermediária
        .forEach(System.out::println); // Operação Terminal

        /*
         * Outra observação é que não se é necessário organizar de forma vertical como o
         * código acima. Pode-se também organizar as funções de modo 'horizontal', vai
         * depender do gosto do programador.
         */

        /*
         * O termo 'Pipline' vem do significado 'funil de pressão de funções' da stream
         * que é a sequência de execução quando se tem muitas funções.
         */
    }
}