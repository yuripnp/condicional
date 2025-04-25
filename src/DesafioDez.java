/*
* João está desenvolvendo um sistema de segurança para uma empresa. Para acessar o sistema,
* o usuário precisa fornecer:
* Um código de acesso numérico (o código correto é 2023).

  Um nível de permissão numérico (os níveis válidos são 1, 2 ou 3).
* O sistema só permitirá o acesso se:
* O código de acesso estiver correto.
* O nível de permissão for válido (1, 2 ou 3).
*
* Caso contrário, o acesso será negado, e o programa deve informar o motivo
* (código incorreto, nível de permissão inválido ou ambos).
*
* Crie um programa que receba o código de acesso e o nível de permissão e exiba
* uma mensagem indicando se o acesso foi permitido ou negado, além do motivo, se for o caso.
*
* input:
* Digite o código de acesso: 2023
* Digite o nível de permissão: 2
*
* output:
* "Acesso permitido."
* */

import java.util.Scanner;

public class DesafioDez {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int codigoAcessoCorreto = 2023;
        System.out.print("Digite o código de acesso: ");
        int codigoAcesso = scanner.nextInt();
        System.out.print("Digite o nível de permissão: ");
        int nivelPermissao = scanner.nextInt();
        scanner.close();

        if (codigoAcesso == codigoAcessoCorreto && (nivelPermissao == 1 || nivelPermissao == 2 || nivelPermissao == 3)) {
            System.out.println("Acesso permitido.");
        } else {
            System.out.println("Acesso negado.");
            if (codigoAcesso != codigoAcessoCorreto) {
                System.out.println("Motivo: código de acesso incorreto.");
            }
            if (nivelPermissao < 1 || nivelPermissao > 3) {
                System.out.println("Motivo: nível de permissão inválido.");
            }
        }
    }
}
