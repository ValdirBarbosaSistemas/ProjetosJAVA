package threads;

public class Threads {

    public static void main(String[] args) throws InterruptedException {
        for (int t = 0; t < 10; t++);
        System.out.println("Executando alguma rotina, envio de email por exemplo");

        /*
         * Quero executar esse envio com algum tempo de parada,
         * ou com um tempo determinado. Para isso, usamos a THREAD.
         */

         Thread.sleep(1000); //Ira ser executado a mensagem atraves de 1 segundo
    }
}
