/*
* Marcos trabalha em uma loja e precisa verificar se um cliente tem direito a um desconto de
* 10% em sua compra. O desconto é aplicado apenas se o valor da compra for maior ou igual a R$ 100,00.
* Para isso, ele quer um programa que permita inserir o valor da compra e exiba se o desconto foi
* aplicado ou não, juntamente com o novo valor após o desconto, caso aplicável.
*
* input: 150.00
* output: "Desconto aplicado. Novo valor: R$ 135.00"
* */

import java.util.Scanner;

public class DesafioCinco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor da compra: ");
        double valorCompra = scanner.nextDouble();
        double desconto = 0.10; // 10% de desconto

        if (valorCompra >= 100.00) {
            double valorComDesconto = valorCompra - (valorCompra * desconto);
            System.out.printf("Desconto aplicado. Novo valor: R$ %.2f%n", valorComDesconto);
        } else {
            System.out.println("Desconto não aplicado.");
        }
    }
}
