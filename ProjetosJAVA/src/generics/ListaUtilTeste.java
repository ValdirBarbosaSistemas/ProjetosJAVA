package generics;

import java.util.Arrays;
import java.util.List;

public class ListaUtilTeste {
    public static void main(String[] args) {
        List<String> langs = Arrays.asList("JS", "PHP", "Java", "C++");
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);

        // Casting pois o método está como tipo Object
        String ultimaLinguagem = (String) ListaUtil.getUltimo1(langs);
        System.out.println(ultimaLinguagem); // Irá aparecer C++

        Integer ultimoNumero = (Integer) ListaUtil.getUltimo1(nums);
        System.out.println(ultimoNumero); // Irá aparecer 6

        // Com Generics

        String ultimaLinguagem2 = ListaUtil.getUltimo2(langs);
        System.out.println(ultimaLinguagem2); // Irá aparecer C++

        Integer ultimoNumero2 = ListaUtil.getUltimo2(nums);
        System.out.println(ultimoNumero2); // Irá aparecer 6

    }
}