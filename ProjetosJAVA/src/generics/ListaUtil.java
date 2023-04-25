package generics;

import java.util.List;

// Para criar Generics dentro de um método
public class ListaUtil {
    // Lembrando que desse modo de fazer "Object" voce teria que atribuir 'Casting'
    public static Object getUltimo1(List<?> lista) {
        return lista.get(lista.size() - 1);
    }

    // Com Generics (NÃO PRECISA SE PREOCUPAR COM CASTING)
    public static <T> T getUltimo2(List<T> lista) {
        return lista.get(lista.size() - 1);
    }
}