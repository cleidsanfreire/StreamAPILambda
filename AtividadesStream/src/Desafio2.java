/*
Desafio 2 - Imprima a soma dos números pares da lista:
Utilizando a Stream API, realize a soma dos números pares da lista e exiba o resultado no console.
 */

import java.util.Arrays;
import java.util.List;

public class Desafio2 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int valor = numeros.stream()
                .filter(n -> n % 2 == 0)
                .reduce(0, Integer::sum);

        System.out.println("Numeros Pares Total:" + valor);
//
//        List<Integer> numerosPares = numeros.stream().filter(n -> n % 2 == 0).toList();
//        int valor = numerosPares.stream().reduce(0,(a,b) -> a + b);
//
//        System.out.println("Numeros Pares: "+ numerosPares + " Total:" + valor);
//
//
//        int valor = numeros.stream().filter(n -> n % 2 == 0).reduce(0,(a,b) -> a + b);
//
//        System.out.println(valor);
//
//
//        numeros.stream().filter(n -> n % 2 == 0).forEach(s -> System.out.println(s));
//
//        List<Integer> numerosPares = numeros.stream().filter(n -> n % 2 == 0).toList();
//
//        System.out.println(numerosPares);
    }
}
