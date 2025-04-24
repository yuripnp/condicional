/*
* Jéssica trabalha no setor de TI de uma empresa e precisa garantir a segurança dos acessos ao
* sistema interno. Os funcionários utilizam uma senha fixa para acessar suas contas, e o
* sistema deve verificar se a senha inserida está correta.
  Ajude Jéssica a criar um programa que, com base em uma senha pré-definida, por exemplo: 123456,
  verifique se o que o usuário digitou está correto ou não. O programa deve comparar a tentativa com a
  senha correta e exibir se o acesso foi permitido ou negado.
  *
  * input: 123456
  * output: "Acesso permitido."
* */

import java.util.Scanner;

public class DesafioTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a senha:");
        String senha = scanner.nextLine();
        System.out.println("Digite a senha novamente:");
        String repetirSenha = scanner.nextLine();

        if(senha.equals(repetirSenha)) {
            System.out.println("Acesso permitido.");
        } else {
            System.out.println("Acesso negado.");
        }
    }
}
