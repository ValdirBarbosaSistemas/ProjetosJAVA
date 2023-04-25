package generics;

public class CaixaNumero<N extends Number> extends Caixa<N> {
    /*
     * Aqui nesse modo temos como colocar uma restrição quando for criar um
     * genérico. Neste caso temos como colocar uma variável qualquer para 'extends'
     * de Number que é uma classe Mãe de Int, Double e qualquer tipo de número.
     */
}