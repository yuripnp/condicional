/*
* Ana precisa identificar se um número é par ou ímpar para um jogo que está desenvolvendo.
* Para isso, deseja criar um programa que analisa se o número que ela definiu previamente é par ou ímpar.
* Como você ajudaria Ana a escrever um programa que determine se um número é par ou ímpar e
* exiba o resultado corretamente?
*
*
* input: 10
* output: "O número 10 é par."
*
* */

public class DesafioUm {
    public static void main(String[] args) {
        int numero = 10; // Substitua pelo número que você deseja verificar

        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é par.");
        } else {
            System.out.println("O número " + numero + " é ímpar.");
        }
    }
}
