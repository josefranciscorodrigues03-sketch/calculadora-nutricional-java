package CalculadoraNutricional;
//Calculadora de IMC
//peso / altura**2
import java.util.Locale;
import java.util.Scanner;

import static CalculadoraNutricional.Calculos.*;

public class Main {
    public static void main(String[] args) {
        //padroniza o leitor
        Locale.setDefault(Locale.US);

        System.out.println("Bem vindo(a) a sua calculadora nutricional");
        System.out.println("escolha uma opção digitando o numero correspondente");

        //ativar o scanner
        var scanner = new Scanner(System.in);
        System.out.println("1 - IMC \n2 - Quantiade de agua minima \n3 - TMB mínimo");
        int resposta = scanner.nextInt();
        if (resposta == 1) {
            //ler o peso
            System.out.println("Digite seu peso: ");
            var peso = scanner.nextDouble();
            //ler a altura
            System.out.println("Digite sua altura(Ex; 1.67): ");
            var altura = scanner.nextDouble();
            double imc = Imc(peso, altura);
            System.out.println("Seu IMC é: " + imc);
        } else if (resposta == 2) {
            //ler peso
            System.out.println("Digite seu peso: ");
            var peso = scanner.nextDouble();
            double aguaMin = AguaMin(peso);
            System.out.println(aguaMin);
        } else if (resposta == 3) {
            //ler o peso
            System.out.println("Digite seu peso: ");
            var peso = scanner.nextDouble();
            //ler o idade
            System.out.println("Digite sua idade: ");
            var idade = scanner.nextDouble();
            //ler a altura
            System.out.println("Digite sua altura em cm(Ex; 167): ");
            var altura = scanner.nextDouble();
            //verifica o genero
            System.out.println("Qual seu genero? \n1 - masculino \n2 - feminino");
            var genero = scanner.nextInt();
            double tmb = Tmb(peso, idade, altura, genero);
            System.out.println(tmb);
        } else {
            System.out.println("escolha uma opção");
        }
    }
}