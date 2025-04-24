/*
* Julia é professora e precisa de um programa que ajude a determinar se um aluno foi aprovado
* na disciplina. A regra da escola é: O estudante é aprovado
* se média final é maior ou igual a 7.0.
  Se a média for entre 5.0 e 6.9, está de recuperação.
  Se for abaixo de 5.0, está reprovado.
  Crie um programa que, a partir de uma variável media, exiba a situação
  do estudante conforme as regras da escola.
  *
  * input: 6.5
  * output: "O aluno está de recuperação."
*
* */

import java.util.HashMap;
import java.util.Map;

public class DesafioDois {
    public static void main(String[] args) {
        Map<String, Double> alunos = new HashMap<>();
        alunos.put("João", 8.5);
        alunos.put("Maria", 6.5);
        alunos.put("Pedro", 4.0);
        for (Map.Entry<String, Double> entry : alunos.entrySet()) {
            String nome = entry.getKey();
            Double media = entry.getValue();

            if (media >= 7.0) {
                System.out.println("O aluno " + nome + " foi aprovado.");
            } else if (media >= 5.0) {
                System.out.println("O aluno " + nome + " está de recuperação.");
            } else {
                System.out.println("O aluno " + nome + " foi reprovado.");
            }
        }

        for (Double nota : alunos.values()) {
            System.out.println("Nota: " + nota);
        }
        for (String aluno : alunos.keySet()) {
            System.out.println("Aluno: " + aluno);
        }

    }
}
