package threads;

import java.util.concurrent.ConcurrentLinkedQueue;

public class ImplementacaoFilaThread extends Thread {
 
    private static ConcurrentLinkedQueue<ObjetoFilaThread> pilha_fila = new ConcurrentLinkedQueue<ObjetoFilaThread>();

    //metodo para adicionar os objetos
    public static void add (ObjetoFilaThread objetoFilaThread) {
        pilha_fila.add(objetoFilaThread);
    }

    @Override
    public void run() {
        while () {
            /**
             * *FIXME VERIFICAR NOVAMENTE A AULA DE THREAD
             */
        }
    }
}