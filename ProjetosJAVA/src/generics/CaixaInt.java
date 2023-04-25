package generics;

//public class CaixaInt<X> extends Caixa<X> 
    /*
     * Quando nós colocamos a classe 'CaixaInt' para herdar de 'Caixa' e percebemos
     * que a Caixa é algo Genérico para ser definido... Você pode não querer
     * definir, querer passar essa responsabilidade pra outra classe? Pode?... Pode!
     * Basta fazer do modo que fizemos acima. De tal forma que voce consegue herdar
     * as funcionalidades de 'Caixa' e voce está colocando a responsabilidade de
     * CaixaInt quando instanciar poder passar o tipo qualquer.
     */
//O que queremos é desse modelo
public class CaixaInt extends Caixa<Integer>{
    
}