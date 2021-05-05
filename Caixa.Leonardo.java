package caixaeletronico;

import java.util.Scanner;

public class CaixaEletronico {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Insira o valor que deseja sacar(mínimo R$ 10): ");
        int valor_saque = leitor.nextInt();
        int nota_100 = 100;
        int nota_50 = 50;
        int nota_20 = 20;
        int nota_10 = 10;
        int nota_5 = 5;
        int nota_2 = 2;
        int nota_1 = 1;
        if (valor_saque >= 10 && valor_saque <= 600) {
            if (nota_100 > 0) {
                nota_100 = valor_saque / 100;
                valor_saque = valor_saque % 100;
                System.out.println(nota_100 + " notas de 100");
            }
            if (nota_50 > 0) {
                nota_50 = valor_saque / 50;
                valor_saque = valor_saque % 50;
                System.out.println(nota_50 + " notas de 50");
            }
            if (nota_20 > 0) {
                nota_20 = valor_saque / 20;
                valor_saque = valor_saque % 20;
                System.out.println(nota_20 + " notas de 20");
            }
            if (nota_10 > 0) {
                nota_10 = valor_saque / 10;
                valor_saque = valor_saque % 10;
                System.out.println(nota_10 + " notas de 10");
            }
            if (nota_5 > 0) {
                nota_5 = valor_saque / 5;
                valor_saque = valor_saque % 5;
                System.out.println(nota_5 + " notas de 5");
            }
            if (nota_2 > 0){
                nota_2 = valor_saque / 2;
                valor_saque = valor_saque % 2;
                System.out.println(nota_2 + " notas de 2");
            }
            if (nota_1 > 0) {
                nota_1 = valor_saque / 1;
                valor_saque = valor_saque % 1;
                System.out.println(nota_1 + " notas de 1");
            }
        } else {
            System.out.println("Não foi possível realizar o saque.");
        }

    }

}
