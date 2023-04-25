package generics;

public class CaixaNumeroTeste {
    public static void main(String[] args) {
        /*
         * CaixaNumero<String> caixaA = new CaixaNumero<String>();
         * caixaA.guardar("Teste"); VAI DAR ERRO DE QUAQUER FORMA
         * 
         * Ele pode até instanciar a classe como tipo 'String', porém não vai funcionar
         * devido a mesma estar associada como 'Number' e devido a isso ele fica
         * 'amarrado' não podendo instanciar de outro tipo.
         */
        CaixaNumero<Double> caixaA = new CaixaNumero<Double>();
        caixaA.guardar(2.3);
        System.out.println(caixaA.abrir());

        CaixaNumero<Integer> caixaB = new CaixaNumero<Integer>();
        caixaB.guardar(123);
        System.out.println(caixaB.abrir());

        /*
         * Neste caso vai dar certo pois como o tipo foi declarado como 'Number' tanto
         * pode como Double como Integer que irá funcionar.
         */
    }
}