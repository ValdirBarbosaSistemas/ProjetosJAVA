package estruturacontrole;
    public class DesafioFor {
        public static void main(String[] args) {
            String valor = "#";
            for (int cont = 1; cont <= 5; cont ++){
                System.out.println(valor);
                valor += "#";
            }
        }   // usando for SEM valor numérico
    }
    /*public class DesafioFor {
        public static void main (String[]args) {
            for (String v = "#"; !v.equals("######"); v += "#") {
                System.out.println (v);
            }
        }
    }
     */