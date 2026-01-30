package CalculadoraNutricional;

import java.util.Locale;
import java.util.Scanner;

import static CalculadoraNutricional.Calculos.*;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Verificador verificador = new Verificador();

        System.out.println("Bem vindo(a) a sua calculadora nutricional");

        while (true) {
            System.out.println("1 - IMC \n2 - Quantidade de agua minima \n3 - TMB minimo\n4 - Sair");

            try {
                int resposta = scanner.nextInt();

                if (resposta == 1) {

                    System.out.println("Digite seu peso: ");
                    double peso = scanner.nextDouble();
                    while (!verificador.peso(peso)) {
                        System.out.println("Digite seu peso: ");
                        peso = scanner.nextDouble();
                    }

                    System.out.println("Digite sua altura (Ex: 1.67): ");
                    double altura = scanner.nextDouble();
                    while (!verificador.altura(altura)) {
                        System.out.println("Digite sua altura: ");
                        altura = scanner.nextDouble();
                    }

                    double imc = Imc(peso, altura);
                    System.out.println("Seu IMC é: " + imc);

                } else if (resposta == 2) {

                    System.out.println("Digite seu peso: ");
                    double peso = scanner.nextDouble();
                    while (!verificador.peso(peso)) {
                        System.out.println("Digite seu peso: ");
                        peso = scanner.nextDouble();
                    }

                    double aguaMin = AguaMin(peso);
                    System.out.println(aguaMin);

                } else if (resposta == 3) {

                    System.out.println("Digite seu peso: ");
                    double peso = scanner.nextDouble();
                    while (!verificador.peso(peso)) {
                        System.out.println("Digite seu peso: ");
                        peso = scanner.nextDouble();
                    }

                    System.out.println("Digite sua idade: ");
                    int idade = scanner.nextInt();
                    while (!verificador.idade(idade)) {
                        System.out.println("Digite sua idade: ");
                        idade = scanner.nextInt();
                    }

                    System.out.println("Digite sua altura em cm: ");
                    int altura = scanner.nextInt();
                    while (!verificador.alturaCm(altura)) {
                        System.out.println("Digite sua altura em cm: ");
                        altura = scanner.nextInt();
                    }

                    System.out.println("Qual seu genero? \n1 - masculino \n2 - feminino");
                    int genero = scanner.nextInt();

                    System.out.println("""
                            Escolha a alternativa:
                            1 - Sedentario
                            2 - Levemente ativo
                            3 - Moderadamente ativo
                            4 - Muito ativo
                            5 - Extremamente ativo
                            """);

                    int escolha = scanner.nextInt();
                    double tmb = Tmb(peso, idade, altura, genero, escolha);
                    System.out.println("A quantidade minima é " + tmb);

                } else if (resposta == 4) {
                    System.out.println("Saindo...");
                    scanner.close();
                    break;
                } else {
                    System.out.println("Escolha uma opcao valida");
                }

            } catch (Exception e) {
                System.out.println("Entrada invalida");
                scanner.nextLine();
            }
        }
    }
}
