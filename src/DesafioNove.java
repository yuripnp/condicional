/*
* Maria trabalha em um banco de sangue e precisa verificar se um doador é compatível
* para doar sangue. Para ser compatível, o doador deve atender aos seguintes critérios:
*
* 1. Ter entre 18 e 65 anos.
* 2. Pesar mais de 50 kg.
*
* Crie um programa que receba a idade e o peso do doador e exiba se ele é compatível ou não.
*
* input:
* digite a idade do doador: 17
* digite o peso do doador: 55
*
* output:
* "O doador não é compatível para doar sangue."
* Motivo: idade abaixo de 18 anos.
* */

import java.util.Scanner;

public class DesafioNove {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a idade do doador: ");
        int idade = scanner.nextInt();
        System.out.print("Digite o peso do doador: ");
        double peso = scanner.nextDouble();
        scanner.close();

        if (idade >= 18 && idade <= 65 && peso > 50) {
            System.out.println("O doador é compatível para doar sangue.");
        } else {
            System.out.println("O doador não é compatível para doar sangue.");
            if (idade < 18) {
                System.out.println("Motivo: idade abaixo de 18 anos.");
            }
            if (idade > 65) {
                System.out.println("Motivo: idade acima de 65 anos.");
            }
            if (peso <= 50) {
                System.out.println("Motivo: peso abaixo de 50 kg.");
            }
        }
    }
}
