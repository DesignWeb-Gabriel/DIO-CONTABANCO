package com.contabanco;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Criando o objeto Scanner para leitura dos dados do usuário
        Scanner scanner = new Scanner(System.in);

        // Primeira simulação
        System.out.println("=== Primeira Simulação ===");
        System.out.print("Digite o saldo inicial: ");
        double saldo = scanner.nextDouble();
        System.out.print("Digite o valor solicitado para saque: ");
        double valorSolicitado = scanner.nextDouble();

        if (saldo >= valorSolicitado) {
            saldo = saldo - valorSolicitado;
            // Exibe o saldo formatado com duas casas decimais
            System.out.println("Saque realizado com sucesso. Saldo atual: " + String.format("%.2f", saldo));
        } else {
            System.out.println("Saldo insuficiente.");
        }

        // Segunda simulação
        System.out.println("\n=== Segunda Simulação ===");
        System.out.print("Digite o saldo inicial: ");
        saldo = scanner.nextDouble();
        System.out.print("Digite o valor solicitado para saque: ");
        valorSolicitado = scanner.nextDouble();

        if (saldo >= valorSolicitado) {
            saldo = saldo - valorSolicitado;
            // Exibe o saldo formatado com duas casas decimais
            System.out.println("Saque realizado com sucesso. Saldo atual: " + String.format("%.2f", saldo));
        } else {
            System.out.println("Saldo insuficiente.");
        }

        // Fechando o scanner
        scanner.close();
    }
}
