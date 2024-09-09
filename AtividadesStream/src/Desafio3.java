/*
Desafio 3 - Verifique se todos os números da lista são positivos:
Com a ajuda da Stream API, verifique se todos os números da lista são positivos e exiba o resultado no console.
*/

import java.util.Arrays;
import java.util.List;

public class Desafio3 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(-12,1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean positivo = numeros.stream().allMatch(s -> s > 0);

        System.out.println("Os numeros sao positivos? " + positivo);
    }
/*
anyMatch: Retorna true se algum elemento corresponder ao predicado.
allMatch: Retorna true se todos os elementos corresponderem ao predicado.
noneMatch: Retorna true se nenhum elemento corresponder ao predicado.
*/
}
