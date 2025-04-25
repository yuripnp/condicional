/*
* Marcos está estudando geometria e precisa verificar se três lados podem formar um
* triângulo. Para que três lados formem um triângulo, a soma de dois lados deve ser
* maior que o terceiro lado. Ele quer um programa que receba três lados e exiba uma
* mensagem informando se os lados podem formar um triângulo ou não.
*
* Com base nesse cenário, crie um programa que receba três lados e exiba uma
* mensagem informando se os lados podem formar um triângulo ou não.
*
* input:
* digite o primeiro lado: 3
* digite o segundo lado: 4
* digite o terceiro lado: 5
*
* output:
* "Os lados 3, 4 e 5 podem formar um triângulo."
* */

import java.util.Scanner;

public class DesafioOito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro lado: ");
        double ladoUm = scanner.nextDouble();
        System.out.print("Digite o segundo lado: ");
        double ladoDois = scanner.nextDouble();
        System.out.print("Digite o terceiro lado: ");
        double ladoTres = scanner.nextDouble();
        scanner.close();

        if (ladoUm + ladoDois > ladoTres && ladoUm + ladoTres > ladoDois && ladoDois + ladoTres > ladoUm) {
            System.out.println("Os lados " + ladoUm + ", " + ladoDois + " e " + ladoTres + " podem formar um triângulo.");
        } else {
            System.out.println("Os lados " + ladoUm + ", " + ladoDois + " e " + ladoTres + " não podem formar um triângulo.");
        }
    }
}
