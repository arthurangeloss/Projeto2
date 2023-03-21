package br.com.rendimento;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Investimento rend  = new Investimento();

        System.out.print("Qual o valor inicial deseja começar seu Investimento: ");
        double investM = ler.nextDouble();
        rend.setinvestM(investM);

        System.out.print("Taxa de crescimento mensal sobre seu investimento: ");
        double tax = ler.nextDouble();
        rend.setTax(tax);

        System.out.print("Quantos meses seu investimento parmanecerá aplicado: ");
        int setNumMeses = ler.nextInt();
        rend.setNumMeses(setNumMeses);

        System.out.printf("Retorno do investimento: R$ %.2f", rend.calcularendi());

    }

}
