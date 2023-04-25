package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriacaoDaStream {
    public static void main(String[] args) {
        Consumer<String> print = System.out::print;
        Consumer<Integer> println = System.out::println;

        Stream<String> langs = Stream.of("JAVA ", "Lua ", "JS\n"); // Criação passando os valores literais

        // Para se criar/declarar uma Stream é necessário usar o método statico chamado
        // 'of'

        langs.forEach(print);

        // Outra maneira de se criar uma Stream
        String[] maislangs = { "Python ", "Lisp ", "Pearl ", "Go\n" }; // Criação passando em Arrays
        Stream.of(maislangs).forEach(print);

        // Outra maneira de criação de Streams é pela CLASSE Arrays
        Arrays.stream(maislangs).forEach(print);

        Arrays.stream(maislangs, 1, 3).forEach(print);
        /*
         * Neste caso é outra maneira de se criar Streams, que no caso ele vai imprimir
         * o segundo elemento da lista até o terceiro menos um, que no caso vai ser
         * 'Lisp', 'Pearl'.
         */

        // Outra possibilidade de criação é pelas COLLECTIONS
        List<String> outrasLangs = Arrays.asList("C ", "PHP ", "Kotlin\n");
        outrasLangs.stream().forEach(print);
        outrasLangs.parallelStream().forEach(print); // Neste caso ele vai imprimir o valor de forma paralela

        // Outra forma de criação de Stream
        Stream.generate(() -> "Exemplo").forEach(print);
        /*
         * Ele vai ser gerado uma Stream INFINITA e desordenada, ou seja, não tem
         * ordem. Essa forma ele tem que ser passado uma função SUPLIER, que é o método
         * que não recebe nenhum valor como parâmetro, mas que retorna algo.
         */

        /*
         * Outra forma de criação de Stream de forma INFINITA como a anterior é pelo
         * método ITERATE
         */
        Stream.iterate(0, n -> n + 1).forEach(println); // Neste caso foi o UnaryOperator
        /*
         * Desse modo ele vai imprimir de forma ORDENADA e INFINITA, ou seja, ele vai
         * somar os valores e imprimir na tela como no exemplo acima (valorInicial =
         * '0', 'UnaryOperator'). Dessa forma ele irá ser passado ou um PREDICATE ou um
         * UNARYOPERATOR.
         */
    }
}