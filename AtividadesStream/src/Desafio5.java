import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

/*
Desafio 5 - Calcule a média dos números maiores que 5:
Com a Stream API, calcule a média dos números maiores que 5 e exiba o resultado no console.
 */
public class Desafio5 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        //List<Integer> numeroMaiores5 = numeros.stream().filter(s -> s > 5).toList();
        //int somaNumeros = numeroMaiores5.stream().reduce(0,Integer::sum);
        OptionalDouble somaNumeros = numeros.stream().filter(s -> s > 5).mapToInt(Integer::intValue).average();

        //System.out.println(numeroMaiores5);
        if (somaNumeros.isPresent()){
            System.out.println("A média é: " + somaNumeros.getAsDouble());
        } else {
            System.out.println("Nenhum número maior que 5 encontrado.");
        }
    }
}
