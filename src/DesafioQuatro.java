/*
* Pedro está aprendendo Java e se deparou com um problema: ele precisa criar um programa que compare
* dois números inteiros fornecidos pelo usuário e informe qual é o maior ou se são iguais.
* Mas, ele está com dificuldades para implementar a lógica de comparação e exibir o resultado corretamente.
*
* input:
* Digite o primeiro número: 10
* Digite o segundo número: 5
* output:
* "O maior número é: 10"
* */

import java.util.Scanner;

public class DesafioQuatro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int numeroUm = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int numeroDois = scanner.nextInt();

        if (numeroUm > numeroDois) {
            System.out.println("O maior número é: " + numeroUm);
        } else if (numeroDois > numeroUm) {
            System.out.println("O maior número é: " + numeroDois);
        } else {
            System.out.println("Os números são iguais.");
        }
    }
}
