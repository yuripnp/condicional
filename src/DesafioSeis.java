/*
* Carlos trabalha em uma empresa de logística que opera apenas de segunda a sexta, sem atividades
* nos finais de semana. Para evitar confusões, ele precisa de um programa que, ao receber um dia da
* semana, informe se é um dia útil ou não.
*
* Crie um programa que receba um dia da semana (em letras minúsculas) e exiba uma mensagem
* indicando se é um dia útil ou não.
*
* input: "segunda-feira"
* output: "É um dia útil."
* */

import java.util.Map;
import java.util.Scanner;

public class DesafioSeis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Boolean> diasDaSemana = Map.of(
                "segunda-feira", true,
                "terça-feira", true,
                "quarta-feira", true,
                "quinta-feira", true,
                "sexta-feira", true,
                "sábado", false,
                "domingo", false
        );
        System.out.print("Digite um dia da semana: ");
        String dia = scanner.nextLine().toLowerCase();
        if (diasDaSemana.containsKey(dia)) {
            if (diasDaSemana.get(dia)) {
                System.out.println("É um dia útil.");
            } else {
                System.out.println("Não é um dia útil.");
            }
        } else {
            System.out.println("Dia inválido.");
        }
    }
}
