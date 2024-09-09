import java.util.Arrays;
import java.util.List;

/*
Desafio 1 - Mostre a lista na ordem numérica:
Crie um programa que utilize a Stream API para ordenar a lista de números em ordem crescente e a exiba no console.
*/

public class Desafio1 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosOrdernados = numeros.stream().sorted().toList();

        System.out.println(numerosOrdernados);

        List<Integer> numerosOrdernadosRemovendoDuplicatas = numeros.stream().distinct().sorted().toList();

        System.out.println(numerosOrdernadosRemovendoDuplicatas);


        // Para compilar o código java, o comando é o seguinte: javac Desafio1.java (javac SeuCodigo.java)
        /*Após executado o comando acima, se não for informado NADA no seu terminal é porque a compilação foi
        executada com sucesso. Posteriormente, pode-se notar que foi gerado um arquivo no diretório em que seu código
        foi compilado.
        Para executá-lo, execute o comando abaixo: java Desafio1.java ($ java SeuCodigo)*/
    }
}
