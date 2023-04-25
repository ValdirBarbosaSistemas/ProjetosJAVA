package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {
    public static void main(String[] args) {
        /*
         * No caso do Filter, como o nome já diz, ele irá filtrar os elementos, ou seja,
         * se tivermos uma stream de 10 elementos de números e queremos que ele retorne
         * os números pares, o filter irá 'filtrar' somente os números pares retornando
         * uma nova stream com somente os números pares. O Filter recebe um PREDICATE
         * como interface funcional. (VER A TABELA DAS INTEFACES FUNCIONAIS PARA VER
         * COMO FUNCIONA)
         */
        Aluno a1 = new Aluno("Ana", 7.8);
        Aluno a2 = new Aluno("Bia", 5.8);
        Aluno a3 = new Aluno("Daniel", 9.8);
        Aluno a4 = new Aluno("Gui", 6.8);
        Aluno a5 = new Aluno("Rebeca", 7.1);
        Aluno a6 = new Aluno("Pedro", 8.8);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);

        /* Exemplo01
        alunos.stream() // Criação da Stream
            .filter(a -> a.nota >= 7) // Operação Intermediária
            .map(a -> "Parabéns" + a.nome + "! Você foi aprovado!") // Operação Intermediária
            .forEach(System.out::println); // Operação Terminal
        */

        // Exemplo02
        Predicate<Aluno> aprovado = a -> a.nota >= 7;

        Function<Aluno, String> saudacaoAprovado = (s) ->{
            return "Parabéns " + s.nome + "! Você foi aprovado!";
        };

        alunos.stream() // Criação da Stream
            .filter(aprovado) // Operação Intermediária
            .map(saudacaoAprovado) // Operação Intermediária
            .forEach(System.out::println); // Operação Terminal
    }
}